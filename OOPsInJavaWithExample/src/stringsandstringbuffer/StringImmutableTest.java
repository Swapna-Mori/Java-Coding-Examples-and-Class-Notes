package stringsandstringbuffer;

public class StringImmutableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a String";
		System.out.println("hash code of initial string ..... " + s.hashCode());
		
		/*
		 * s = "hello how are you doing????";
		 * System.out.println("hash code of changed string ..... " + s.hashCode()); s =
		 * "bye!!! Take Care";
		 * System.out.println("hash code of second time changed string ..... " +
		 * s.hashCode());
		 */
		
		StringBuffer sb  = new StringBuffer(s);
		System.out.println(sb.hashCode());
		sb.append(" in java");
		System.out.println("string after appending new words = " + sb);
		System.out.println(sb.hashCode());
		
		sb.insert(16," Buffer");
		System.out.println("string after inserting new words = " + sb);
		System.out.println(sb.hashCode());	
		
		//convert stringbuffer to string
		System.out.println(sb.toString());
		
		
		StringBuilder sbd  = new StringBuilder(s);
		System.out.println(sb.hashCode());
		sbd.append(" in java");
		System.out.println("string after appending new words = " + sb);
		System.out.println(sbd.hashCode());
		
		sbd.insert(16," Buffer");
		System.out.println("string after inserting new words = " + sb);
		System.out.println(sbd.hashCode());	
		
		//convert stringbuffer to string
		System.out.println(sb.toString());
		
	}

}
