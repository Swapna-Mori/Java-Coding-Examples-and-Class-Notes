package classandobjectinoops;

import java.util.Scanner;

public class BookManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// create a book object
		Book b = new Book();
		System.out.println(b.hashCode());
		Book b1 = new Book();
		System.out.println(b1.hashCode());
		
		
		Book b11 = new Book
				("345","Bankrupt",
						245f,
						350,
						"2009-01-01");
		System.out.println("hashcode of b11 ====== " + b11.hashCode());
		
		Book b12 = new Book();
		System.out.println("hashcode of b12 ========" + b12.hashCode());
		
		System.out.println("refering to same object (b11)");
		Book b122 = b11;
		System.out.println("hashcode of b12 ========" + b122.hashCode());
		
		char ch = 'y';// local variable because it is defined inside main method

		while (ch == 'y') {
			System.out.println("Enter the Transaction.....");
			System.out.println("Enter 'read' to enter book details.....");
			System.out.println("Enter 'display' to view book details.....");
			String transaction = sc.next();

			switch (transaction) {
			case "read":
				b.readBookDetails();
				break;
			case "display":
				b.displyBookDetails();
				break;
			default:
				System.out.println("Wrong choice....");
				break;
			}// close of switch
			System.out.println("Enter the choice to continue.....");
			ch = sc.next().charAt(0);
		} // close of while

	}

}
