package de.bht.ema.around.exceptions;

public class FileExtensionDetectionException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private static final String defaultMessage = "";
	
	public FileExtensionDetectionException() {
		super(defaultMessage);
	}

}
