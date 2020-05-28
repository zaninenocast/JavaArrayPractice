import java.util.Arrays;

/* Write a program to copy an array by iterating the array
 * */ 
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6};
		int[] b = new int[6];
		for (int i = 0; i < a.length; i++) {
		    b[i]= a[i];
		}
  System.out.println(Arrays.toString(b));
	}

}
