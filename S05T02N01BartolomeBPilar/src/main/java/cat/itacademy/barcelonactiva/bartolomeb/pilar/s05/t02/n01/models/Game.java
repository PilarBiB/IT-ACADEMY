package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "game")
public class Game implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer idGame;

	@Column(name = "Dau_1", length = 1, nullable = false, updatable = false)
	private int dau1;

	@Column(name = "Dau_2", length = 1, nullable = false, updatable = false)
	private int dau2;

	@Column(name = "Partida", length = 20, nullable = false, updatable = false)
	private boolean guanyar;

	@ManyToOne(optional = false, cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "Id_player")
	private Player player;

	public Integer getIdGame() {
		return idGame;
	}

	public void setIdGame(Integer idGame) {
		this.idGame = idGame;
	}

	public int getDau1() {
		int dau1 = (int) (Math.random() * 6 + 1);
		return dau1;
	}

	public void setDau1(int dau1) {
		this.dau1 = dau1;
	}

	public Integer getDau2() {
		int dau2 = (int) (Math.random() * 6 + 1);
		return dau2;
	}

	public void setDau2(int dau2) {
		this.dau2 = dau2;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game() {
		super();
	}

	public Game(Player player) {
		super();
		this.player = player;
	}

	public Game(Integer idGame) {
		super();
		this.idGame = idGame;
	}

	public Game(Integer idGame, int dau1, int dau2, boolean guanyar) {
		super();
		this.idGame = idGame;
		this.dau1 = dau1;
		this.dau2 = dau2;
		this.guanyar = guanyar;
	}

	public Game(int dau1, int dau2, boolean guanyar, Player player) {
		super();
		this.dau1 = dau1;
		this.dau2 = dau2;
		this.guanyar = guanyar;
		this.player = player;
	}

	public Game(Integer idGame, int dau1, int dau2, boolean guanyar, Player player) {
		super();
		this.idGame = idGame;
		this.dau1 = dau1;
		this.dau2 = dau2;
		this.guanyar = guanyar;
		this.player = player;
	}

	public boolean isGuanyar() {
		return guanyar;
	}

	public void setGuanyar(boolean guanyar) {
		this.guanyar = guanyar;
	}
}