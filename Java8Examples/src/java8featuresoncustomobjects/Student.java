package java8featuresoncustomobjects;

public class Student {
	
	private String name;
	private int age;
	private float marks;
	private String branch;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, float marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	

	public Student(String name, int age, float marks, String branch) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
