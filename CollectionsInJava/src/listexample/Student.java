package listexample;

public class Student {
	private int studentId;
	private String studentName;
	private Float studentMarks;
	
	public Student() {
		System.out.println("default constructor");
	}
	
	

	public Student(int studentId, String studentName, Float studentMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Float getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(Float studentMarks) {
		this.studentMarks = studentMarks;
	}

	
	  @Override 
	  public String toString() { 
		  return "Student [studentId=" + studentId
	  + ", studentName=" + studentName + ", studentMarks=" + studentMarks + "]"; 
		  }
	 
	

}
