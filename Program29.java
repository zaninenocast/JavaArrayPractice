/*  Write a Java program to compute the average value of an array 
 * of integers except the largest and smallest values.*/ 
public class Program29 {

	public static void main(String[] args) {
	      int[] a = {1,2,3,4,5,6,7};
	      int min = a[0];
	      int max = a [0];
	      int sum = a[0];
   for (int i = 1 ; i < a.length ; i ++)
   {
	   sum += a[i];
	   if (a[i] > max)
	   {
		   max = a[i];
	   }
	   else if (a[i] < min)
	   {
		   min = a[i];
	   }
   }
   float avrg = ((sum-min- max)/(a.length - 2));
   System.out.println(avrg);
	}

}
