package activiti.spring.javnaNabavka.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Registar {

	@Id
	@GeneratedValue
	private Long id;
	private String clanovi;

	public Registar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registar(String clanovi) {
		super();
		this.clanovi = clanovi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClanovi() {
		return clanovi;
	}

	public void setClanovi(String clanovi) {
		this.clanovi = clanovi;
	}

}
