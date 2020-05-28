import java.util.Arrays;

/* Write a java Program to insert a element (specific position )into an array*/ 
public class program9 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5,6};
		int indexPosition = 2;
		int newValue = 4 ; 
		
		System.out.println(Arrays.toString(a));
		for (int i = a.length -1 ; i > indexPosition  ; i --)
		{
			a[i] = a[i-1];
		}
		a[indexPosition]= newValue;
		System.out.println(Arrays.toString(a));
	}

}
