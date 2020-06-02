/* Write a java Program to find the common elements between two arrays.(String values)*/
public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Array1 = {"komal","jatyani"};
		String[] Array2 = {"Priya", "jatyani"};
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
