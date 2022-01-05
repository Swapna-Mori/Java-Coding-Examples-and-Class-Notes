package operatorsdemo;

public class PrefixAndPostfixExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fvalue = 23.5f;
		float fvalue1 = 23.5f;
		System.out.println("Post increment = " + fvalue++);
		System.out.println("Pre increment = " +  ++fvalue1);
		
		//difference between a = a + 1 or a++
		
		fvalue = 23.5f;
		fvalue1 = 23.5f;
		System.out.println("Post increment = " + fvalue--);
		System.out.println("Pre increment = " +  --fvalue1);
		
		//wat is the ouput of the following expression
		int a = 5,i;
		i =  ++a + ++a + a++;
		//i = (6   + 7 + 7) then 7++
		System.out.println(a);
		System.out.println(" i value = " + i);
		
		a = 5;
		i =  a++ + ++a + ++a;
			// 5       7     8
	}

}
