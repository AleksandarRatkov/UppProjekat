package activiti.spring.javnaNabavka.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ponudjac{

	@Id
	private String id;
	private String ime;
	private String prezime;
	private String email;
	private String lozinka;
	private Boolean poslataPrijava;
	private Boolean mozePoslatiPonudu;
	private Boolean poslataPonuda;
	
	public Ponudjac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ponudjac(String id, String ime, String prezime, String email, String lozinka, boolean poslataPrijava,boolean mozePoslatiPonudu, Boolean poslataPonuda) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.lozinka = lozinka;
		this.poslataPrijava = poslataPrijava;
		this.mozePoslatiPonudu = mozePoslatiPonudu;
		this.poslataPonuda = poslataPonuda;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public Boolean getPoslataPrijava() {
		return poslataPrijava;
	}

	public void setPoslataPrijava(Boolean poslataPrijava) {
		this.poslataPrijava = poslataPrijava;
	}

	public Boolean getMozePoslatiPonudu() {
		return mozePoslatiPonudu;
	}

	public void setMozePoslatiPonudu(Boolean mozePoslatiPonudu) {
		this.mozePoslatiPonudu = mozePoslatiPonudu;
	}

	public Boolean getPoslataPonuda() {
		return poslataPonuda;
	}

	public void setPoslataPonuda(Boolean poslataPonuda) {
		this.poslataPonuda = poslataPonuda;
	}

	
	
	
}
