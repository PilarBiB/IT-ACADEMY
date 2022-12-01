package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.ErrorDTO;

public class NotFountException extends GameException {

	private static final long serialVersionUID = 1L;

	public NotFountException(String code, String message) {
		super(code, HttpStatus.NOT_FOUND.value(), message);
		// TODO Auto-generated constructor stub
	}

	public NotFountException(String code, String message, ErrorDTO data) {
		super(code, HttpStatus.NOT_FOUND.value(), message, Arrays.asList(data));
		// TODO Auto-generated constructor stub
	}

}
