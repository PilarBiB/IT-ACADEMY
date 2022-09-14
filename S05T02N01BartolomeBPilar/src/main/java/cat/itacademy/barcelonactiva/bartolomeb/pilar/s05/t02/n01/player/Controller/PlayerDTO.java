package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.Controller;

public class PlayerDTO {
	
	private Integer id;
	private String playerNom;
	private String password;
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public PlayerDTO(Integer id, String playerNom, String password) {
		super();
		this.id = id;
		this.playerNom = playerNom;
		this.password = password;
	}
	public PlayerDTO(String playerNom, String password) {
		super();
		this.playerNom = playerNom;
		this.password = password;
	}
	public PlayerDTO() {
		super();
	}
}
