package customexceptionexample;

public class AgeNotValidExcetion extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6201787427185485252L;
	
	public AgeNotValidExcetion(String msg) {
		super(msg);
	}

}
