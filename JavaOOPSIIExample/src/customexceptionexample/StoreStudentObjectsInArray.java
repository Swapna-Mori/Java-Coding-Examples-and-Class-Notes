package customexceptionexample;

import java.util.Scanner;

public class StoreStudentObjectsInArray {

	public static void main(String[] args) {
		
		Student[] studentArray = new Student[3];
		
		//firstway to store an object in to array
		Student st1 = new Student(123, "Rama", 55.67f);
		System.out.println(st1.getStudentId());
		System.out.println(st1.getStudentName());
		System.out.println(st1.getStudentMarks());
		
		//store above object in studentArray
		studentArray[0] = st1;
		
		System.out.println(studentArray[0].toString());
		
		//second way of creating an object of student and store in array
		studentArray[1] = new Student(124, "Krishna", 67.56f);
		System.out.println(studentArray[1].toString());
		
		//thirdway of creating an object of student and store in array
		Scanner sc = new Scanner(System.in);
		Student st2 = new Student();
		System.out.println("Enter the Student Details");
		System.out.println("Enter the student id");
		st2.setStudentId(sc.nextInt());
		System.out.println("Enter the student name");
		sc.nextLine();
		st2.setStudentName(sc.nextLine());
		System.out.println("Enter the student marks");
		st2.setStudentMarks(sc.nextFloat());
		
		//store above object in to array
		studentArray[2] = st2;
		System.out.println(studentArray[2]);
		System.out.println("list of all students using foreach loop........");
		for (Student student : studentArray) {
			System.out.println(student);
		}
		
		Student[] studentArray1 = new Student[3];
		/*
		 * Store user defined objects in above array using
		 * for loop
		 */
		System.out.println("Enter the Student details");
		for(int i=0;i<studentArray1.length;i++) {
			Student st = new Student();
			System.out.println("Enter the studentId");
			st.setStudentId(sc.nextInt());
			System.out.println("Enter the studentName");
			sc.nextLine();
			st.setStudentName(sc.nextLine());
			System.out.println("Enter the studentMarks");
			st.setStudentMarks(sc.nextFloat());
			studentArray1[i] = st;
		}
		
		System.out.println("list of all students using foreach loop........");
		System.out.println("================================================");
		for (Student student : studentArray1) {
			System.out.println(student);
		}
		
		
		System.out.println("Enter the student id to search.....");
		int sid = sc.nextInt();
		try {
			for(int i=0;i<studentArray1.length;i++) {
				if(studentArray1[i].getStudentId() == sid) {
					System.out.println("student found");
				}else {
					throw new StudentNotFoundException("Student does not exist with id = " + sid);
				}
			}
		}catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
