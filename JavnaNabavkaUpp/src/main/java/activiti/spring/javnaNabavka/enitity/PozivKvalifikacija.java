package activiti.spring.javnaNabavka.enitity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PozivKvalifikacija {

	@Id
	@GeneratedValue
	private Long id;
	private String nazivNarucioca;
	private String adresaNarucioca;
	private String internetStranicaNarucioca;
	private String vrstaNarucioca;
	private String vrstaPostupka;
	private String opisPredmetaNabavke;
	private String nazivIzOpstegRjecnika;
	private String oznakaIzOpstegRjecnika;
	private String obimRadova;
	private String mjestoIzvrsenjaRadova;
	private Long brojPartija;
	private String posebnaNapomena;
	private String kriterijumZaDodjeluUgovora;
	private String internetAdresaKonkursneDokumentacije;
	private String internetAdresaNadleznogOrgana;
	private Date rokZaPodnosenjePonuda;
	private String mjestoOtvaranjaPonuda;
	private Date vrijemeOtvaranjaPonuda;
	private String nacinOtvaranjaPonuda;
	private String dodatniUslovi;
	private Date rokZaDonosenjeOdluke;
	private String liceZaKontakt;
	
	
	
	public PozivKvalifikacija() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PozivKvalifikacija(String nazivNarucioca, String adresaNarucioca,
			String internetStranicaNarucioca, String vrstaNarucioca,
			String vrstaPostupka, String opisPredmetaNabavke,
			String nazivIzOpstegRjecnika, String oznakaIzOpstegRjecnika,
			String obimRadova, String mjestoIzvrsenjaRadova, Long brojPartija,
			String posebnaNapomena, String kriterijumZaDodjeluUgovora,
			String internetAdresaKonkursneDokumentacije,
			String internetAdresaNadleznogOrgana, Date rokZaPodnosenjePonuda,
			String mjestoOtvaranjaPonuda, Date vrijemeOtvaranjaPonuda,
			String nacinOtvaranjaPonuda, String dodatniUslovi,
			Date rokZaDonosenjeOdluke, String liceZaKontakt) {
		super();
		this.nazivNarucioca = nazivNarucioca;
		this.adresaNarucioca = adresaNarucioca;
		this.internetStranicaNarucioca = internetStranicaNarucioca;
		this.vrstaNarucioca = vrstaNarucioca;
		this.vrstaPostupka = vrstaPostupka;
		this.opisPredmetaNabavke = opisPredmetaNabavke;
		this.nazivIzOpstegRjecnika = nazivIzOpstegRjecnika;
		this.oznakaIzOpstegRjecnika = oznakaIzOpstegRjecnika;
		this.obimRadova = obimRadova;
		this.mjestoIzvrsenjaRadova = mjestoIzvrsenjaRadova;
		this.brojPartija = brojPartija;
		this.posebnaNapomena = posebnaNapomena;
		this.kriterijumZaDodjeluUgovora = kriterijumZaDodjeluUgovora;
		this.internetAdresaKonkursneDokumentacije = internetAdresaKonkursneDokumentacije;
		this.internetAdresaNadleznogOrgana = internetAdresaNadleznogOrgana;
		this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
		this.mjestoOtvaranjaPonuda = mjestoOtvaranjaPonuda;
		this.vrijemeOtvaranjaPonuda = vrijemeOtvaranjaPonuda;
		this.nacinOtvaranjaPonuda = nacinOtvaranjaPonuda;
		this.dodatniUslovi = dodatniUslovi;
		this.rokZaDonosenjeOdluke = rokZaDonosenjeOdluke;
		this.liceZaKontakt = liceZaKontakt;
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
	public String getInternetStranicaNarucioca() {
		return internetStranicaNarucioca;
	}
	public void setInternetStranicaNarucioca(String internetStranicaNarucioca) {
		this.internetStranicaNarucioca = internetStranicaNarucioca;
	}
	public String getVrstaNarucioca() {
		return vrstaNarucioca;
	}
	public void setVrstaNarucioca(String vrstaNarucioca) {
		this.vrstaNarucioca = vrstaNarucioca;
	}
	public String getVrstaPostupka() {
		return vrstaPostupka;
	}
	public void setVrstaPostupka(String vrstaPostupka) {
		this.vrstaPostupka = vrstaPostupka;
	}
	public String getOpisPredmetaNabavke() {
		return opisPredmetaNabavke;
	}
	public void setOpisPredmetaNabavke(String opisPredmetaNabavke) {
		this.opisPredmetaNabavke = opisPredmetaNabavke;
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
	public String getObimRadova() {
		return obimRadova;
	}
	public void setObimRadova(String obimRadova) {
		this.obimRadova = obimRadova;
	}
	public String getMjestoIzvrsenjaRadova() {
		return mjestoIzvrsenjaRadova;
	}
	public void setMjestoIzvrsenjaRadova(String mjestoIzvrsenjaRadova) {
		this.mjestoIzvrsenjaRadova = mjestoIzvrsenjaRadova;
	}
	public Long getBrojPartija() {
		return brojPartija;
	}
	public void setBrojPartija(Long brojPartija) {
		this.brojPartija = brojPartija;
	}
	public String getPosebnaNapomena() {
		return posebnaNapomena;
	}
	public void setPosebnaNapomena(String posebnaNapomena) {
		this.posebnaNapomena = posebnaNapomena;
	}
	public String getKriterijumZaDodjeluUgovora() {
		return kriterijumZaDodjeluUgovora;
	}
	public void setKriterijumZaDodjeluUgovora(String kriterijumZaDodjeluUgovora) {
		this.kriterijumZaDodjeluUgovora = kriterijumZaDodjeluUgovora;
	}
	public String getInternetAdresaKonkursneDokumentacije() {
		return internetAdresaKonkursneDokumentacije;
	}
	public void setInternetAdresaKonkursneDokumentacije(
			String internetAdresaKonkursneDokumentacije) {
		this.internetAdresaKonkursneDokumentacije = internetAdresaKonkursneDokumentacije;
	}
	public String getInternetAdresaNadleznogOrgana() {
		return internetAdresaNadleznogOrgana;
	}
	public void setInternetAdresaNadleznogOrgana(
			String internetAdresaNadleznogOrgana) {
		this.internetAdresaNadleznogOrgana = internetAdresaNadleznogOrgana;
	}
	public Date getRokZaPodnosenjePonuda() {
		return rokZaPodnosenjePonuda;
	}
	public void setRokZaPodnosenjePonuda(Date rokZaPodnosenjePonuda) {
		this.rokZaPodnosenjePonuda = rokZaPodnosenjePonuda;
	}
	public String getMjestoOtvaranjaPonuda() {
		return mjestoOtvaranjaPonuda;
	}
	public void setMjestoOtvaranjaPonuda(String mjestoOtvaranjaPonuda) {
		this.mjestoOtvaranjaPonuda = mjestoOtvaranjaPonuda;
	}
	public Date getVrijemeOtvaranjaPonuda() {
		return vrijemeOtvaranjaPonuda;
	}
	public void setVrijemeOtvaranjaPonuda(Date vrijemeOtvaranjaPonuda) {
		this.vrijemeOtvaranjaPonuda = vrijemeOtvaranjaPonuda;
	}
	public String getNacinOtvaranjaPonuda() {
		return nacinOtvaranjaPonuda;
	}
	public void setNacinOtvaranjaPonuda(String nacinOtvaranjaPonuda) {
		this.nacinOtvaranjaPonuda = nacinOtvaranjaPonuda;
	}
	public String getDodatniUslovi() {
		return dodatniUslovi;
	}
	public void setDodatniUslovi(String dodatniUslovi) {
		this.dodatniUslovi = dodatniUslovi;
	}
	public Date getRokZaDonosenjeOdluke() {
		return rokZaDonosenjeOdluke;
	}
	public void setRokZaDonosenjeOdluke(Date rokZaDonosenjeOdluke) {
		this.rokZaDonosenjeOdluke = rokZaDonosenjeOdluke;
	}
	public String getLiceZaKontakt() {
		return liceZaKontakt;
	}
	public void setLiceZaKontakt(String liceZaKontakt) {
		this.liceZaKontakt = liceZaKontakt;
	}
	
	
}
