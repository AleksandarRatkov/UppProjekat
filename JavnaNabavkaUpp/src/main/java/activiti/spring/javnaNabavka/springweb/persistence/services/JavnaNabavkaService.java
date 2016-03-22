package activiti.spring.javnaNabavka.springweb.persistence.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.JavnaNabavka;
import activiti.spring.javnaNabavka.enitity.Registar;

@Service("JavnaNabavkaService")
public class JavnaNabavkaService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public JavnaNabavka sacuvaj(String nazivNarucioca, String adresaNarucioca,
			Long rbrNabavke, String predmetNabavke,
			String nazivIzOpstegRecnika, String oznakaIzOpstegRecnika,
			String vrstaPostupka, Double procenjenaVrednost){
		
		JavnaNabavka nabavka = new JavnaNabavka(nazivNarucioca,adresaNarucioca,
				rbrNabavke,predmetNabavke,nazivIzOpstegRecnika,oznakaIzOpstegRecnika,vrstaPostupka,
				procenjenaVrednost);
		
		entityManager.persist(nabavka);
		return nabavka;
		
	}
	
	public Registar sacuvajURegistar(String clanovi){
		
		Registar r = new Registar(clanovi);
		entityManager.persist(r);
		System.out.println("Sacuvan je u clan u registru: " + r.getClanovi());
		
		return r;
	}
}
