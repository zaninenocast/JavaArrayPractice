/* Write a java program to find all pairs of element in an array whose sum is equal to a specified number .*/
public class Program22 {
static void pairs_value(int[] array , int num)
{
	System.out.println("Pirs of elemnt ad their sum");
	for (int i = 0 ; i < array.length ; i++)
	{
		for (int j = i +1 ; j < array.length ; j ++)
		{
			if (array[i]+ array[j] == num)
			{
				System.out.println(array[i]+"+"+array[j]+"="+num);
			}
				
		}
			
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Program22 value = new Program22();
		int[] arr = {2,7,4,-5,11,5,20};
		int number = 15;
		value.pairs_value(arr, number);
	}

}
