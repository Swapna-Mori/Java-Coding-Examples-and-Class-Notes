package java8featuresoncustomobjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
	
	public static void main(String[] args) {
		
		//create student object and add in to arraylist
		
		List<Student> studentList = new ArrayList<Student>(
				Arrays.asList(new Student("bohny",8),
						new Student("jones",10)));
		studentList.add(new Student("simmy",8));
		studentList.add(new Student("rinnie",9));
		
		List<Student> sortedListOnAge =  studentList.stream()
				.sorted(Comparator.comparingInt(Student::getAge).reversed())
				.collect(Collectors.toList());
		
		sortedListOnAge.forEach(System.out::println);
		
		//sorting based on the name
		
		List<Student> sortedListOnNames = studentList.stream()
								.sorted(new Comparator<Student>() {

									@Override
									public int compare(Student s1, Student s2) {
										return (s1.getName().compareTo(s2.getName()));
										
									}
								}).filter(s1 ->s1.getAge() > 8).collect(Collectors.toList());
		
		System.out.println("SortedList Based on Names.........................");
		
		sortedListOnNames.forEach(System.out::println);
		
		
	}

}
