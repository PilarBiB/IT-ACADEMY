package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos;

public class PorcentageExitoDto {

	private Integer id;
	private String playerNom;
	private Double porcentageExito;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlayerNom() {
		return playerNom;
	}

	public void setPlayerNom(String playerNom) {
		this.playerNom = playerNom;
	}

	/**
	 * @return the porcentageExito
	 */
	public Double getPorcentageExito() {
		return porcentageExito;
	}

	/**
	 * @param porcentageExito the porcentageExito to set
	 */
	public void setPorcentageExito(Double porcentageExito) {
		this.porcentageExito = porcentageExito;
	}

}
