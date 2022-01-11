package copyofarray;

public class CopyOfArrayExample {
	
	public static void main(String[] args) {
		
		int[] array1 = {34,34,43,42,55,22,77};
		System.out.println("hashcode of array1 = " + array1.hashCode());
		System.out.println("=======================");
		int [] array2 = array1;
		System.out.println("hashcode of array2 = " + array2.hashCode());
		for (int i : array1) {
			System.out.println(i);
		}
		
	
		System.out.println("=======================");
		for (int i : array2) {
			System.out.println(i);
		}
		
		System.out.println("=======================");
		
		int[] array3 = new int[10];
		System.out.println("hashcode of array3 = " + array3.hashCode());
		array3 = array2;
		for (int i : array3) {
			System.out.println(i);
		}
	}

}
