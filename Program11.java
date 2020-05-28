import java.util.Arrays;

/*   Write a Java program to reverse an array of integer values*/ 
public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra = {34,56,78,12,43,54,65,76,98,9};
		int[] arra1  = new int[10];
		for (int i = arra[9]  ; i < arra.length ; i --)
		{
			System.out.println(arra[i]);
		    arra1[i] = arra[i];
		}
		
		System.out.println(Arrays.toString(arra1));

	}

}
