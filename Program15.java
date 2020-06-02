/* Write a java Program to find the common elements between two arrays of integer*/
public class Program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1 = {1,2};
        int[] Array2 = {2, 3};
		for (int i = 0 ; i < Array1.length ; i++)
		{
			for (int j = 0 ; j < Array2.length ; j++)
			{
				if (Array1[i]== Array2[j])
				{
					System.out.println(Array2[j]);
				}
			}
		}

	
	}

}
