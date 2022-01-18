package methodreferenceexample;

public class NonStaticMethodReferenceExample {

	public static void main(String[] args) {
		
		Quote qt = new Quote();
		Quotations qu =  qt::printQuote;
		System.out.println(qu.printQuotation("all is well"));
		
		

	}

}
