package cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Fruites")
public class Fruita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name = "Nom", length = 100, unique = true, nullable = false)
	private String nom;
	@Column(name = "Quantitat_Kg")
	private int quantitatQuilos;	
	
	public Fruita (int id, String nom, int quantitatQuilos) {
		this.id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;	
	}
	public Fruita(){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}
	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}
	@Override
	public String toString() {
		return "Fruita [id= " +id+ ", Nom= " +nom+ ", Quantitat_Kg= " +quantitatQuilos+ "]";
	}
}
	/*public String toString(){
        StringBuilder value = new StringBuilder("Entrada Fruita(");
        value.append("Id: ");
        value.append(id);
        value.append(", Nom ");
        value.append(nom);
        value.append(", Quantitad_Kg: ");
        value.append(quantitatQuilos);
        
        return value.toString();
    }*/
