import java.util.Arrays;

/* Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.*/
public class Program33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int [] array = {20,20,30,40,50,50,50,50};
           
           System.out.println(Arrays.toString(array));
           System.out.println(check(array));
	}
           public static int check(int[] array) {
        	   int index = 1;
           for (int i = 1; i < array.length ; i ++)
           {
        	   if (array[i] != array[index-1])
        	   {
        		   array[index++] = array[i];
        	   }
            
           }
           return index;
}
}