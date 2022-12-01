package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.exception;

import java.util.Arrays;

import org.springframework.http.HttpStatus;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.dtos.ErrorDTO;

public class InternalServerErrorException extends GameException {

	private static final long serialVersionUID = 1L;

	public InternalServerErrorException(String code, String message) {
		super(code, HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
		// TODO Auto-generated constructor stub
	}

	public InternalServerErrorException(String code, String message, ErrorDTO data) {
		super(code, HttpStatus.INTERNAL_SERVER_ERROR.value(), message, Arrays.asList(data));
		// TODO Auto-generated constructor stub
	}
}
