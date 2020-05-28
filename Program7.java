import java.util.Arrays;

/* Write a program to remove a specific elemnet from an array*/
public class Program7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9};
        int removeIndex = 2;
		for (int i= removeIndex; i < a.length -1 ; i++)
		{
			a[i]= a[i+1];
			
			
		}
		System.out.println(Arrays.toString(a));
	}

}
