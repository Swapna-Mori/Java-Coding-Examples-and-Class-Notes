package java8featuresoncustomobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>(
				Arrays.asList(new Student("bohny",8,55f,"CSE"),
						new Student("jones",10,45,"EEE")));
		studentList.add(new Student("simmy",8,50,"ECE"));
		studentList.add(new Student("rinnie",9,60,"CSE"));
	     List<String> namesOfStudents = studentList.stream()
	    		 .filter(s1 ->s1.getName().startsWith("s"))
	    		 .map(Student::getName).collect(Collectors.toList());
	     namesOfStudents.forEach(System.out::println);
	     
	     // Convert elements to strings and concatenate them, separated by commas
	     String studentNames = studentList.stream()
	                           .map(Student::getName)
	                           .collect(Collectors.joining(", "));
	     System.out.println(studentNames);
	     
	     //summing all Student marks
	     
	     // Compute sum of marks of student
	     Double total = studentList.stream()
	                          .collect(Collectors.summingDouble(Student::getMarks));
	     System.out.println("Total Marks = "  +total);
	     
	  // Group Students by Branch
	     Map<String, Long> countByDept
	         = studentList.stream()
	                    .collect(Collectors.groupingBy(Student::getBranch,Collectors.counting()));
	     
	     System.out.println(countByDept);

	}

}
