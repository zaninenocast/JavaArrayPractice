import java.util.Arrays;

/* Write a Java program to get the difference between the largest and smallest values 
 * in an array of integers. The length of the array must be 1 and above.*/
public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] array = {1,2,3,4,5,6,7,8,9};
          System.out.println(Arrays.toString(array));
          int min = array[0];
          int max = array[8];
          int diff = max - min;
          System.out.println(diff);
          
	}

}
