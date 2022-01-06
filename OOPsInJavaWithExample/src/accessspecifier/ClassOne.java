package accessspecifier;

public class ClassOne {
	
	public ClassOne() {
		// TODO Auto-generated constructor stub
	}
	
	private int d =0;
	protected int value; //only in subclasses
	public float data;//global scope
	char ch = 'A'; //default scope of this variable is in same package
	
	
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
		display(50);
	}

	private void display(int d) {
		this.d = d;
	}
	
	protected void display1(int d) {
		this.d = d;
		System.out.println(ch);
	}
}
