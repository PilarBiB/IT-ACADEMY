package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos;

import java.util.Date;

public class RegistroDTO {

	private String username;
	private String password;
	private Date dataRegistre;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dataRegistre
	 */
	public Date getDataRegistre() {
		return dataRegistre;
	}

	/**
	 * @param dataRegistre the dataRegistre to set
	 */
	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

}