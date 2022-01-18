package parallelsort;

import java.util.Arrays;

public class ParallelSortExample {
	
	public static void main(String[] args) {
		
		int[] arr = {78,98,38,28,18};
		Arrays.parallelSort(arr,0,4);
		for(int i : arr) {
		System.out.println(i);
		}
	}

}
