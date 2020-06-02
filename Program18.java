import java.util.Arrays;

/* Write a Java program to find the second smallest element in an array. */ 
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array = {23,32,43,12,56,54,76,45}; 
	         System.out.println(Arrays.toString(array));
	         Arrays.sort(array);
	         System.out.println(Arrays.toString(array));
	         
	       int  secondNo = array[1];
	       System.out.println("Second smallest no is :"+ secondNo);
	 
	}

}
