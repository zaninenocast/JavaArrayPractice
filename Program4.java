/* Write a java program to calculate the average value of array element*/
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {20,30,25,35,-16,60,-100};
		
		int sum = 0;
		for (int i = 0 ; i < array.length ; i++)
		{
		 sum = sum +array[i]; 
		}
       double avrg = (sum / array.length);
       System.out.println("average is "+avrg);
	}

}
