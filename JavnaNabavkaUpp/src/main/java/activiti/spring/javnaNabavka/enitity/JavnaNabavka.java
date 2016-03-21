package activiti.spring.javnaNabavka.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JavnaNabavka {

	@Id
	@GeneratedValue
	private Long id;
	private String nazivNarucioca;
	private String adresaNarucioca;
	private Long rbrNabavke;
	private String predmetNabavke;
	private String nazivIzOpstegRecnika;
	private String oznakaIzOpstegRecnika;
	private String vrstaPostupka;
	private Double procenjenaVrednost;

	public JavnaNabavka() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JavnaNabavka(String nazivNarucioca, String adresaNarucioca, Long rbrNabavke, String predmetNabavke,
			String nazivIzOpstegRecnika, String oznakaIzOpstegRecnika, String vrstaPostupka,
			Double procenjenaVrednost) {
		super();
		this.nazivNarucioca = nazivNarucioca;
		this.adresaNarucioca = adresaNarucioca;
		this.rbrNabavke = rbrNabavke;
		this.predmetNabavke = predmetNabavke;
		this.nazivIzOpstegRecnika = nazivIzOpstegRecnika;
		this.oznakaIzOpstegRecnika = oznakaIzOpstegRecnika;
		this.vrstaPostupka = vrstaPostupka;
		this.procenjenaVrednost = procenjenaVrednost;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getNazivIzOpstegRecnika() {
		return nazivIzOpstegRecnika;
	}

	public void setNazivIzOpstegRecnika(String nazivIzOpstegRecnika) {
		this.nazivIzOpstegRecnika = nazivIzOpstegRecnika;
	}

	public String getOznakaIzOpstegRecnika() {
		return oznakaIzOpstegRecnika;
	}

	public void setOznakaIzOpstegRecnika(String oznakaIzOpstegRecnika) {
		this.oznakaIzOpstegRecnika = oznakaIzOpstegRecnika;
	}

	public String getVrstaPostupka() {
		return vrstaPostupka;
	}

	public void setVrstaPostupka(String vrstaPostupka) {
		this.vrstaPostupka = vrstaPostupka;
	}

	public Double getProcenjenaVrednost() {
		return procenjenaVrednost;
	}

	public void setProcenjenaVrednost(Double procenjenaVrednost) {
		this.procenjenaVrednost = procenjenaVrednost;
	}

}
