package activiti.spring.javnaNabavka.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JavnaNabavka {

	@Id
	@GeneratedValue
	private Long id;
	private String  nazivNarucioca;
	private String adresaNarucioca;
	private Long rbrNabavke;
	private String predmetNabavke;
	private String nazivIzOpstegRjecnika;
	private String oznakaIzOpstegRjecnika;
	private String vrstaPostupka;
	private Double procjenjenaVrijednost;
	
	
	
	public JavnaNabavka() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public JavnaNabavka( String nazivNarucioca, String adresaNarucioca,
			Long rbrNabavke, String predmetNabavke,
			String nazivIzOpstegRjecnika, String oznakaIzOpstegRjecnika,
			String vrstaPostupka, Double procjenjenaVrijednost) {
		super();
		this.nazivNarucioca = nazivNarucioca;
		this.adresaNarucioca = adresaNarucioca;
		this.rbrNabavke = rbrNabavke;
		this.predmetNabavke = predmetNabavke;
		this.nazivIzOpstegRjecnika = nazivIzOpstegRjecnika;
		this.oznakaIzOpstegRjecnika = oznakaIzOpstegRjecnika;
		this.vrstaPostupka = vrstaPostupka;
		this.procjenjenaVrijednost = procjenjenaVrijednost;
	
	}




	public String getNazivNarucioca() {
		return nazivNarucioca;
	}
	public void setNazivNarucioca(String nazivNarucioca) {
		this.nazivNarucioca = nazivNarucioca;
	}
	public String getAdresaNarucioca() {
		return adresaNarucioca;
	}
	public void setAdresaNarucioca(String adresaNarucioca) {
		this.adresaNarucioca = adresaNarucioca;
	}
	public Long getRbrNabavke() {
		return rbrNabavke;
	}
	public void setRbrNabavke(Long rbrNabavke) {
		this.rbrNabavke = rbrNabavke;
	}
	public String getPredmetNabavke() {
		return predmetNabavke;
	}
	public void setPredmetNabavke(String predmetNabavke) {
		this.predmetNabavke = predmetNabavke;
	}
	public String getNazivIzOpstegRjecnika() {
		return nazivIzOpstegRjecnika;
	}
	public void setNazivIzOpstegRjecnika(String nazivIzOpstegRjecnika) {
		this.nazivIzOpstegRjecnika = nazivIzOpstegRjecnika;
	}
	public String getOznakaIzOpstegRjecnika() {
		return oznakaIzOpstegRjecnika;
	}
	public void setOznakaIzOpstegRjecnika(String oznakaIzOpstegRjecnika) {
		this.oznakaIzOpstegRjecnika = oznakaIzOpstegRjecnika;
	}

	public Double getProcjenjenaVrijednost() {
		return procjenjenaVrijednost;
	}
	public void setProcjenjenaVrijednost(Double procjenjenaVrijednost) {
		this.procjenjenaVrijednost = procjenjenaVrijednost;
	}

	public String getVrstaPostupka() {
		return vrstaPostupka;
	}

	public void setVrstaPostupka(String vrstaPostupka) {
		this.vrstaPostupka = vrstaPostupka;
	}
	
	
}
