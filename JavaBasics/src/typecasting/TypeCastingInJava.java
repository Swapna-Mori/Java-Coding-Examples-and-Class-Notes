package typecasting;

public class TypeCastingInJava {
	
	public static void main(String[] args) {
		
		int value = 15;
		double dValue = value; //automatic or implicit type casting int to double
		
		System.out.println(dValue);
		
		float data = 2345.6789f;
		int intData = (int) data; //explictly mentioning the data type to convert from float to int
		
		System.out.println(intData);
	}

}
