import java.util.Arrays;

/* Write a java Program to find second largest element in an array */
public class Program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] array = {12,23,32,43,12,56,54,76,45}; 
         System.out.println(Arrays.toString(array));
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));
         
         System.out.println(array.length);
         
       int index = array.length -1;
        System.out.println("index is "+index);
        if (array[index] == array[array.length-1]) {
        	System.out.println(array[index]);
        	index --;
        	
        }
        System.out.println(+array[index]);
	}

}
