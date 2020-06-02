/*Write a Java program to check if the sum of all the 10's in the array is exactly 30.
 *  Return false if the condition does not satisfy, otherwise true. */

import java.util.*; 
 
 public class Program31 {
 public static void main(String[] args)
 {
    int[] array_nums = {10, 77, 10, 54, -11, 10};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int search_num = 10;
    int fixed_sum = 30;
	
	System.out.println("Result: "+result(array_nums, search_num, fixed_sum));
    }	
  
  public static boolean result(int[] numbers, int search_num, int fixed_sum) {
   int temp_sum = 0;
   for (int number : numbers) {
      if (number == search_num) {
        temp_sum += search_num;
      }

      if (temp_sum > fixed_sum) {
        break;
      }
    }
    return temp_sum == fixed_sum;
  }  
}
