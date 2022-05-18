package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.dtos;

import java.util.ArrayList;

public class SucursalDTO {
	
	private Integer pk_SucursalID;	
	private String nomSucursal;
	private String paisSucursal;
	private String tipusSucursal;
	
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
	public String getTipusSucursal() {
		
		ArrayList <String> paisosUe = new ArrayList <String>();
		
		paisosUe.add("Alemanya");
		paisosUe.add("Àustria");
		paisosUe.add("Bèlgica");
		paisosUe.add("Bulgària");
		paisosUe.add("Croàcia");
		paisosUe.add("Dinamarca");
		paisosUe.add("Eslovàquia");
		paisosUe.add("Eslovènia");
		paisosUe.add("Espanya");
		paisosUe.add("Estònia");
		paisosUe.add("Finlàndia");
		paisosUe.add("França");
		paisosUe.add("Grècia");
		paisosUe.add("Hongria");
		paisosUe.add("Irlanda");
		paisosUe.add("Itàlia");
		paisosUe.add("Letònia");
		paisosUe.add("Lituània");
		paisosUe.add("Luxemburg");
		paisosUe.add("República de Malta");
		paisosUe.add("Països Baixos");
		paisosUe.add("Polònia");
		paisosUe.add("Portugal");
		paisosUe.add("República Txeca");
		paisosUe.add("Romania");
		paisosUe.add("Suècia");	
		paisosUe.add("Xipre");
		
		this.tipusSucursal = "";
		if (paisSucursal != null &&  paisSucursal != "") {
			String busqueda = getPaisSucursal();
			boolean existeix = paisosUe.contains(busqueda);
			if (existeix==true) {
				this.tipusSucursal = "UE";	
			}
			else{
				this.tipusSucursal = "Fora UE";
			}
		}	
		return this.tipusSucursal;
	}
}
