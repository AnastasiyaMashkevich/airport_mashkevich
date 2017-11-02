package helper.exception;


public class PlaneException extends Exception {

	private static final long serialVersionUID = 1L;

	public PlaneException() {
		super();
	}

	public PlaneException(String message) {
		super(message);
	}

	public PlaneException(Exception e) {
		super(e);
	}

	public PlaneException(String message, Exception e) {
		super(message, e);
	}

}
