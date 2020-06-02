/* Write a Java program to check if an array of integers contains two specified elements 65 and 77.*/
public class Program32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {43,34,67,87,56,98,65,23,21,77};
		for (int i = 0 ; i < array.length ; i ++)
		{
			if (array[i] == 65 || array[i] == 77)
			{
			System.out.println("having 65 n 77");
			}
		}
       
	}

}
