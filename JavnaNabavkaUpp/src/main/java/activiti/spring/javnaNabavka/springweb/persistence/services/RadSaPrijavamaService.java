package activiti.spring.javnaNabavka.springweb.persistence.services;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.Prijava;
@Service("SacuvajPrijavuService")
public class RadSaPrijavamaService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Prijava sacuvaj(String nazivPodnosiocaPrijave, String adresaPodnosiocaPrijave,String emailPodnosiocaPrijave){
	
	Prijava prijava = new Prijava(nazivPodnosiocaPrijave,((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername(),adresaPodnosiocaPrijave,emailPodnosiocaPrijave);
	
		entityManager.persist(prijava);
		
		return prijava;
		
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Prijava> listaPrijavljenih(){
		System.out.println("usao");
		System.out.println( entityManager.createQuery("SELECT * FROM Prijava"));
		return (ArrayList<Prijava>) entityManager.createQuery("SELECT * FROM Prijava");
	}
}
