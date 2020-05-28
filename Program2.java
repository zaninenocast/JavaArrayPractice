/* Write a java program to sum values of an array */
public class Program2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5,6,7};
		int sum = 0;
		
		for (int i=0 ; i <= array.length ; i++) {
		 sum += i;
		 System.out.println(sum);
		 
		}
		
System.out.println("sum is "+sum);
	}

}
