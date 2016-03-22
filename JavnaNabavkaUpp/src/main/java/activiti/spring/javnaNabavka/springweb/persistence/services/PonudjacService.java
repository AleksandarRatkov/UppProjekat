package activiti.spring.javnaNabavka.springweb.persistence.services;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Ponuda;
import activiti.spring.javnaNabavka.enitity.Ponudjac;
import activiti.spring.javnaNabavka.enitity.Registar;

@Service("PonudjacService")
public class PonudjacService {

	@PersistenceContext
	private EntityManager entityManager;

	public Ponudjac sacuvaj(String id, String ime, String prezime, String email, String lozinka, Boolean poslaoPrijavu,
			Boolean mozePoslatiPonudu, Boolean poslaoPonudu) {

		System.out.println("Ponudjac sacuvaj");
		Ponudjac ponudjac = new Ponudjac(id, ime, prezime, email, lozinka, poslaoPrijavu, mozePoslatiPonudu,
				poslaoPonudu);

		entityManager.persist(ponudjac);
		return ponudjac;
	}

	public Ponuda sacuvajPonudu(String nazivNarucioca, String adresaNarucioca, Double procenjenaVrednost,
			Double ponudjenaCena, Double brojPondera) {

		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("Ponuda sacuvaj");
		Ponuda ponuda = new Ponuda(u.getUsername(), nazivNarucioca, adresaNarucioca, procenjenaVrednost, ponudjenaCena,
				brojPondera);

		entityManager.persist(ponuda);
		return ponuda;
	}

	public ArrayList<String> vratiAktivnePonudjace() {
		System.out.println("usao u vratiAktivPonudj");
		@SuppressWarnings("unchecked")
		ArrayList<String> adekvatniKorisnici = (ArrayList<String>) entityManager
				.createQuery("SELECT id FROM Ponudjac WHERE poslataPrijava = 0").getResultList();
		System.out.println("adekvatniKor su: " + adekvatniKorisnici);
		return adekvatniKorisnici;
	}

	public Ponudjac editujFlegPrijava() {
		System.out.println("Usao u edit flega prijava!");
		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("User koji je ulogovan je : " + u);

		Ponudjac p = (Ponudjac) entityManager
				.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + u.getUsername() + "'").getSingleResult();
		System.out.println("Ponudjac je : " + p);
		p.setPoslataPrijava(true);
		entityManager.merge(p);

		return p;

	}

	public Ponudjac editujFlegPonuda(String id) {
		System.out.println("Usao u edit flega ponuda!");

		Ponudjac p = (Ponudjac) entityManager.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + id + "'")
				.getSingleResult();
		System.out.println("Ponudjac je : " + p);
		p.setMozePoslatiPonudu(true);
		entityManager.merge(p);

		return p;

	}

	public ArrayList<String> vratiKvalifikovanePonudjace() {
		System.out.println("usao u vratiKvalifikovanePonudjace");
		@SuppressWarnings("unchecked")
		ArrayList<String> adekvatniKorisnici = (ArrayList<String>) entityManager
				.createQuery("SELECT id FROM Ponudjac WHERE mozePoslatiPonudu = 1 AND poslataPonuda = 0")
				.getResultList();
		System.out.println("adekvatniKor su: " + adekvatniKorisnici);
		return adekvatniKorisnici;
	}

	public Ponudjac editujFlegPoslataPonudaDokumentacija() {
		System.out.println("Usao u edit editujFlegPoslataPonudaDokumentacija!");

		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("User koji je ulogovan je : " + u);

		Ponudjac p = (Ponudjac) entityManager
				.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + u.getUsername() + "'").getSingleResult();
		System.out.println("Ponudjac je : " + p);
		p.setPoslataPonuda(true);
		entityManager.merge(p);

		return p;

	}

	@SuppressWarnings("unchecked")
	public Ponudjac editujFlegPoslataPonudaRegistar() {
		System.out.println("Usao u edit editujFlegPoslataPonudaRegistar!");

		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		ArrayList<Registar> korisnikURegistru = (ArrayList<Registar>) entityManager
				.createQuery("SELECT r FROM Registar r").getResultList();
		boolean postojiURegistru = false;

		for (Registar reg : korisnikURegistru) {

			if (u.getUsername().equals(reg.getClanovi())) {

				postojiURegistru = true;
			}
		}

		if (postojiURegistru) {

			System.out.println("ima ga u registru setovan je flag za poslatu prijavu");
			Ponudjac p = (Ponudjac) entityManager
					.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + u.getUsername() + "'").getSingleResult();
			System.out.println("Ponudjac je : " + p);
			p.setPoslataPonuda(true);
			entityManager.merge(p);
			return p;
		} else {

			System.out.println("nema ga u registru!");
			Ponudjac p = (Ponudjac) entityManager
					.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + u.getUsername() + "'").getSingleResult();
			System.out.println("Ponudjac je : " + p);
			p.setMozePoslatiPonudu(false);
			entityManager.merge(p);

			Ponuda nevalidnaPonuda = (Ponuda) entityManager
					.createQuery("SELECT p FROM Ponuda p WHERE user = '" + u.getUsername() + "'").getSingleResult();
			entityManager.remove(nevalidnaPonuda);
			return p;

		}
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Ponuda> dobaviPonude() {

		ArrayList<Ponuda> adekvatnePonude = (ArrayList<Ponuda>) entityManager.createQuery("SELECT p FROM Ponuda p")
				.getResultList();

		return adekvatnePonude;
	}

	public Ponuda azurirajPondere(Double brojPondera, String user) {

		Ponuda p = (Ponuda) entityManager.createQuery("SELECT p FROM Ponuda p WHERE user = '" + user + "'")
				.getSingleResult();
		p.setBrojPondera(brojPondera);
		entityManager.merge(p);

		return p;
	}

	@SuppressWarnings("unchecked")
	public void odbacivanjeNeprihvatljivihPonuda() {
		System.out.println("usao u odbacivanjeNeprihvatljivihPonuda");
		Double limitZaNiskuCenu = new Double(200000);
		ArrayList<Ponuda> listaPonuda = (ArrayList<Ponuda>) entityManager.createQuery("SELECT p FROM Ponuda p ")
				.getResultList();
		Double prekoDozvoljenogLimita = new Double(0);

		for (Ponuda ponuda : listaPonuda) {
			
			prekoDozvoljenogLimita = ponuda.getProcenjenaVrednost() + ponuda.getProcenjenaVrednost() / 10;

			if (ponuda.getBrojPondera() == 0) {

				if (limitZaNiskuCenu >= ponuda.getPonudjenaCena() || prekoDozvoljenogLimita < ponuda.getPonudjenaCena()) { // ako
																													// je
																													// sumnjivo
																													// mala

					System.out.println("Ponuda od korisnika: " + ponuda.getUser()
							+ " je prepoznata kao nepozeljna jer je sumnjivo mala ili je preko 10% dozvoljenog limita!");
					
					entityManager.createQuery("DELETE FROM Ponuda WHERE id = '" + ponuda.getId() + "'").executeUpdate();
					
				}else{
					System.out.println("Ponuda od korisnika: " + ponuda.getUser()
					+ " je prepoznata ok!");
				}
			} else {

				System.out.println("posto se radi preko pondera onda nema ovakvvih uslova i odbacivanja");
			}
		}

	}

	@SuppressWarnings("unchecked")
	public String rangirajPonude() {
		
		System.out.println("usao u rangirajPonude");
		
		
		
		ArrayList<String> listaPonudjaca = (ArrayList<String>) entityManager.createQuery("SELECT p.user FROM Ponuda p ORDER BY p.ponudjenaCena ASC").getResultList();
		String ponudjac = "ne";
		
		try {
			
			 ponudjac = listaPonudjaca.get(0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println(
				"Pobednicka ponuda je od korisnika : " + ponudjac);

		return ponudjac;

	}
}
