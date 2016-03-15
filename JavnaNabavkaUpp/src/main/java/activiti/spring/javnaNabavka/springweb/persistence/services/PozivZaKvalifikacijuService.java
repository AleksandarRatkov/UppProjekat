package activiti.spring.javnaNabavka.springweb.persistence.services;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import activiti.spring.javnaNabavka.enitity.PozivKvalifikacija;

@Service("PozivKvalifikacijaServis")
public class PozivZaKvalifikacijuService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public PozivKvalifikacija sacuvaj(String nazivNarucioca, String adresaNarucioca,
			String internetStranicaNarucioca, String vrstaNarucioca,
			String vrstaPostupka, String opisPredmetaNabavke,
			String nazivIzOpstegRecnika, String oznakaIzOpstegRecnika,
			String obimRadova, String mestoIzvrsenjaRadova, Long brojPartija,
			String posebnaNapomena, String kriterijumZaDodeluUgovora,
			String internetAdresaKonkursneDokumentacije,
			String internetAdresaNadleznogOrgana, Date rokZaPodnosenjePonuda,
			String mestoOtvaranjaPonuda, Date vremeOtvaranjaPonuda,
			String nacinOtvaranjaPonuda, String dodatniUslovi,
			Date rokZaDonosenjeOdluke, String liceZaKontakt)
	{
		PozivKvalifikacija poziv = new PozivKvalifikacija(nazivNarucioca,  adresaNarucioca,
				 internetStranicaNarucioca,  vrstaNarucioca,
				vrstaPostupka, opisPredmetaNabavke,
				nazivIzOpstegRecnika, oznakaIzOpstegRecnika,
				obimRadova,mestoIzvrsenjaRadova,brojPartija,
				posebnaNapomena,kriterijumZaDodeluUgovora,
				internetAdresaKonkursneDokumentacije,
				internetAdresaNadleznogOrgana, rokZaPodnosenjePonuda,
				 mestoOtvaranjaPonuda, vremeOtvaranjaPonuda,
				nacinOtvaranjaPonuda,  dodatniUslovi,
				 rokZaDonosenjeOdluke, liceZaKontakt);
		entityManager.persist(poziv);

		return poziv;
	}
}
