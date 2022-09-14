package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import javax.persistence.*;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.game.Game;

@Entity
@Table(name = "Player")
public class Player implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;
	
	@Column(name = "Nom", length = 50)
	private String playerNom;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Data_registre")
	private Calendar dataRegistre; 
	
	@Column(name = "Percent_exits")
	private double percentExits;
	
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "players_rols",
			joinColumns = @JoinColumn(name = "player_Id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_Id", referencedColumnName = "id")
			)			
	private Collection<Rol> rols;
		
	@OneToMany( mappedBy = "player",cascade = CascadeType.ALL)
	private List<Game> games;

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
	
	public Calendar getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Calendar dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Rol> getRols() {
		return rols;
	}

	public void setRols(Collection<Rol> rols) {
		this.rols = rols;
	}

	public double getPercentExits() {
		/*int exit = 0;
		int totalJocs = 0;
		for (Game joc : games)
			if (joc.isGuanyar()) {
			exit++;
			totalJocs++;
		}else {
			totalJocs++;
		}
		percentExits = (exit/totalJocs)*100;*/
		return percentExits;
	}

	public void setPercentExits(double percentExits) {
		this.percentExits = percentExits;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(Game game) {
		games.add(game);
	}	
	public Player() {
		super();
	}

	public Player(Integer id) {
		super();
		this.id = id;
	
	}

	public Player(String playerNom) {
		super();
		this.playerNom = playerNom;
	}

	public Player(String playerNom, String password) {
		super();
		this.playerNom = playerNom;
		this.password = password;
	}

	public Player(Integer id, String playerNom, Calendar dataRegistre, double percentExits) {
		super();
		this.id = id;
		this.playerNom = playerNom;
		this.dataRegistre = dataRegistre;
		this.percentExits = percentExits;
	}

	public Player(Integer id, String playerNom, Calendar dataRegistre, double percentExits, String password,
				Collection<Rol> rols, List<Game> games) {
		super();
		this.id = id;
		this.playerNom = playerNom;
		this.dataRegistre = dataRegistre;
		this.percentExits = percentExits;
		this.password = password;
		this.rols = rols;
		this.games = games;
	}

	public Player(String playerNom, String password, Collection<Rol> rols) {
		super();
		this.playerNom = playerNom;
		this.password = password;
		this.rols = rols;
	}

	public Player(String playerNom, Calendar dataRegistre, double percentExits, String password, Collection<Rol> rols,
			List<Game> games) {
		super();
		this.playerNom = playerNom;
		this.dataRegistre = dataRegistre;
		this.percentExits = percentExits;
		this.password = password;
		this.rols = rols;
		this.games = games;
	}

	public Player(Integer id, String password, Collection<Rol> rols) {
		super();
		this.id = id;
		this.password = password;
		this.rols = rols;
	}
	
	
}
	