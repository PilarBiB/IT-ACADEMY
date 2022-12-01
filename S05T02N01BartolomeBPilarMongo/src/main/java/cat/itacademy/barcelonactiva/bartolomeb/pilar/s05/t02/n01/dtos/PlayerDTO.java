package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos;

import java.util.Date;

public class PlayerDTO {

	private String id;
	private String playerNom;
	private String password;
	private Date dataRegistre;

	public String getPlayerNom() {
		return playerNom;
	}

	public void setPlayerNom(String playerNom) {
		this.playerNom = playerNom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
