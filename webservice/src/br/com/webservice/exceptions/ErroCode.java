package br.com.webservice.exceptions;

public enum ErroCode {

	BAD_REQUEST(400), NOT_FOUND(404), SERVER_ERROR(500);

	private int code;

	ErroCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
}