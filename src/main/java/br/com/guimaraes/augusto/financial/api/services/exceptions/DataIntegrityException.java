package br.com.guimaraes.augusto.financial.api.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = -6493888589771634163L;

	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
