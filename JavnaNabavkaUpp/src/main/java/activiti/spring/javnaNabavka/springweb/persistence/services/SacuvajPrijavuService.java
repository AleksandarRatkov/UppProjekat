package activiti.spring.javnaNabavka.springweb.persistence.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Prijava;
@Service("SacuvajPrijavuService")
public class SacuvajPrijavuService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Prijava sacuvaj(String nazivPodnosiocaPrijave, String adresaPodnosiocaPrijave,String emailPodnosiocaPrijave){
		
		Prijava prijava = new Prijava(nazivPodnosiocaPrijave,adresaPodnosiocaPrijave,emailPodnosiocaPrijave);
		
		entityManager.persist(prijava);
		return prijava;
		
	}
}
