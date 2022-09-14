package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Rol(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public Rol(String nom) {
		super();
		this.nom = nom;
	}
	public Rol() {
		super();
	}	
}
