package methodreferenceexample;

public class CnstrReferenceExample {
	public static void main(String[] args) {
		
		//Quote qt = new Quote();
		Quotations1 qu =  QuoteMessage::new;
		qu.printMessage("hello... how are you");
		
		

	}

}
