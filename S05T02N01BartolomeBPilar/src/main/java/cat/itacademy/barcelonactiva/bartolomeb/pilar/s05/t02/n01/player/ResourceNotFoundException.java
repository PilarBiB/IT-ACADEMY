package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.player;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	private String nomDelRecurs;
	private String nomDelCamp;
	private long ValorDelCamp;
	
	public ResourceNotFoundException(String nomDelRecurs, String nomDelCamp, long valorDelCamp) {
		super(String.format("%s No trobat amb : %s : '%s'",nomDelRecurs,nomDelCamp,valorDelCamp));
		this.nomDelRecurs = nomDelRecurs;
		this.nomDelCamp = nomDelCamp;
		ValorDelCamp = valorDelCamp;
	}

	public String getNomDelRecurs() {
		return nomDelRecurs;
	}

	public void setNomDelRecurs(String nomDelRecurs) {
		this.nomDelRecurs = nomDelRecurs;
	}

	public String getNomDelCamp() {
		return nomDelCamp;
	}

	public void setNomDelCamp(String nomDelCamp) {
		this.nomDelCamp = nomDelCamp;
	}

	public long getValorDelCamp() {
		return ValorDelCamp;
	}

	public void setValorDelCamp(long valorDelCamp) {
		ValorDelCamp = valorDelCamp;
	}
}
