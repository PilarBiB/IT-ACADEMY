package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "player")
public class Player {

	@MongoId(FieldType.OBJECT_ID)
	private String id;

	@Field
	@Indexed(unique = true)
	private String playerNom;

	private Date dataRegistre;

	@Field
	@Indexed(unique = true)
	private String password;

	private List<Game> games;

	@DBRef
	private Set<Roles> roles = new HashSet<>();
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPlayerNom() {
		return playerNom;
	}

	public void setPlayerNom(String playerNom) {
		this.playerNom = playerNom;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

}
