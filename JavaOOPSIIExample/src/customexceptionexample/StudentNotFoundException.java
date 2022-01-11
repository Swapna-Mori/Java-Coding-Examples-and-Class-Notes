package customexceptionexample;

public class StudentNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4066336746906713047L;

	public StudentNotFoundException(String message) {
		super(message);
	}
}
