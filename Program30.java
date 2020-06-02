/* Write a Java program to check if an array of integers without 0 and -1. */
public class Program30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array  = {2,3,4,5,6,7};
        for (int i  = 0 ; i < array.length ; i ++)
        {
        	if (array[i]==0 || array[i]==1)
        	{
        		System.out.println("this array is having 0 or 1");
        	}
        	else 
        	{
        		System.out.println("true");
        	}
        }
        	
        	
	}

}
