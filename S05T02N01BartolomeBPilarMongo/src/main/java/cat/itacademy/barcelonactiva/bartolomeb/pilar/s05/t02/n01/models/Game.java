package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models;

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "game")
public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	@MongoId(FieldType.OBJECT_ID)
	private Integer idGame;

	@Indexed
	private int dau1;

	@Indexed
	private int dau2;

	@Indexed
	private boolean guanyar;

	@Indexed
	@Field(targetType = FieldType.STRING)
	private Player player;
	
	

	public Integer getIdGame() {
		return idGame;
	}

	public void setIdGame(Integer idGame) {
		this.idGame = idGame;
	}

	public int getDau1() {
		return dau1;
	}

	public void setDau1(int dau1) {
		this.dau1 = dau1;
	}

	public int getDau2() {
		return dau2;
	}

	public void setDau2(int dau2) {
		this.dau2 = dau2;
	}

	public boolean isGuanyar() {
		return guanyar;
	}

	public void setGuanyar(boolean guanyar) {
		this.guanyar = guanyar;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}