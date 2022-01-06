package inheritanceandpolymorphism.multilevelinheritanceexample;

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		/*
		 * //Object of Employee Employee e = new Employee();
		 * e.readEmployeeInformation(); e.viewEmployeeInformation();
		 */
		
		/* in inheritance we can create an object to subclass to use the properties
		 * of superclass ,JVM copies the properties of super class in to subclass when we
		 * use extends keyword 
		 */
		/*
		 * //Object of the programmer Programmer prg = new Programmer();
		 * //prg.readEmployeeInformation(); prg.readProgrammerInformation();
		 * //prg.viewEmployeeInformation(); prg.viewProgrammerInformation();
		 */
		/*In Multilevel inheritance we can create an object to the last subclass to inherit
		 * the properties of all the classes in hierarchy
		*/

		PythonDeveloper pdev = new PythonDeveloper();
		pdev.readProgrammerInformation();
		pdev.viewPythonDeveloperInformation();
		
		HR hr =new HR();
		hr.readEmployeeInformation();
		hr.readRole();
		hr.viewEmployeeInformation();
		hr.viewRole();

	}

}
