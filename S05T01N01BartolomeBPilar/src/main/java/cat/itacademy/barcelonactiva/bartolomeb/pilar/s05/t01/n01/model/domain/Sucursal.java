package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sucursals")
public class Sucursal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Pk_SucursalID")
	private Integer pk_SucursalID;
	@Column(name = "Nom", length = 100, unique = true, nullable = false)
	private String nomSucursal;
	@Column(name = "País", length = 100)
	private String paisSucursal;
	
	public Sucursal() {
	}
	public Sucursal(Integer pk_SucursalID, String nomSucursal, String paisSucursal) {
	
		this.pk_SucursalID = pk_SucursalID;
		this.nomSucursal = nomSucursal;
		this.paisSucursal = paisSucursal;
	}
	public Integer getPk_SucursalID() {
		return pk_SucursalID;
	}
	public void setPk_SucursalID(Integer pk_SucursalID) {
		this.pk_SucursalID = pk_SucursalID;
	}
	public String getNomSucursal() {
		return nomSucursal;
	}
	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	public String getPaisSucursal() {
		return paisSucursal;
	}
	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}

	@Override
	public String toString() {
		return "Sucursal [Pk_SucursalID  = " + pk_SucursalID + ", Nom = " + nomSucursal + ", País = "
				+ paisSucursal + "]";
	}	
}
