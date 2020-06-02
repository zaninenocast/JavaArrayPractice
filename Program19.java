
import java.util.Scanner;

/* Write a java program to add two matrices of the same size  */
public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int m,n;
         Scanner scer = new Scanner(System.in);
         System.out.println("Input number of row of matrix ");
         m = scer.nextInt();
         System.out.println("Input number of column of matrix ");
         n = scer.nextInt();
         
         int array1[][] = new int [m] [n];
         int array2[][] = new int [m] [n];
         int sum[][] = new int[m][n];
         
         System.out.println("Enter elements of first matrix");
         for (int i = 0 ; i < m ; i ++)
        	
         {
        	 
        	 
        	 for (int j = 0 ; j < n ;j ++)
        	 {
       
        		 array1[i][j] = scer.nextInt();
        		 
        		 
        	 }
        	 
         }
         System.out.println("Enter elements of second matrix");
         for (int i = 0 ; i < m ; i ++)
        	
         {
        	 
        	 
        	 for (int j = 0 ; j < n ;j ++)
        	 {
       
        		 array2[i][j] = scer.nextInt();
        	
        	 }
        	 
         }
       
         System.out.println("*****/////*******");
         for (int i = 0 ; i <  m ; i ++)
         {
        	 for (int j = 0 ; j < n ; j ++)
        	 {
        		  sum[i][j] = array1[i][j] + array2 [i][j];
        	 }
        		 
        		 
         }
	System.out.println("Sum of matrix is ");
	  for (int i = 0 ; i < m ; i++)
	  {
		  for (int j = 0 ; j < n ; j ++)
		  {
			  System.out.print(sum[i][j]+"\t");
		  }
		  System.out.println();
	  }
	}

	
}
