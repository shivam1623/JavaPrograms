package first;


	
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	public class Comparable  {
	  public static void main(String[] args) {
	    /*
	     * Integer class implements Comparable
	     * Interface so we can use the sort method
	     */
	    int[] arr = {11,55,22,0,89};
	    Arrays.sort(arr);
	    System.out.print("Sorted Int Array: ");
	    for(int i:arr)
	    System.out.println(i);
	  }
	}
