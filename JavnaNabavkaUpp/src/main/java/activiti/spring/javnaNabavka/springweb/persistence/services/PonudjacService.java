package activiti.spring.javnaNabavka.springweb.persistence.services;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Ponudjac;


@Service("PonudjacService")
public class PonudjacService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Ponudjac sacuvaj(String id,String ime,String prezime,String email,String lozinka,Boolean poslaoPrijavu){
		
		System.out.println("Ponudjac sacuvaj");
		Ponudjac ponudjac = new Ponudjac(id,ime,prezime,email,lozinka,poslaoPrijavu);
		
		entityManager.persist(ponudjac);
		return ponudjac;
	}
	
	public ArrayList<String> vratiAktivnePonudjace(){
		System.out.println("usao u vratiAktivPonudj");
		@SuppressWarnings("unchecked")
		ArrayList<String> adekvatniKorisnici = (ArrayList<String>) entityManager.createQuery("SELECT id FROM Ponudjac WHERE poslataPrijava = 0").getResultList();
		System.out.println("adekvatniKor su: " + adekvatniKorisnici);
		return adekvatniKorisnici;
	}
	
	public Ponudjac editujFleg(){
		System.out.println("Usao u edit flega!");
		User u = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		System.out.println("User koji je ulogovan je : " + u);
		
		Ponudjac p = (Ponudjac)entityManager.createQuery("SELECT p FROM Ponudjac p WHERE id = '" + u.getUsername() + "'").getSingleResult();
		System.out.println("Ponudjac je : " + p);
		p.setPoslataPrijava(true);
		entityManager.merge(p);
		
		return p;
		
	}
}
