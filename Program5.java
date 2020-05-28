

/* Write a java program to test if an array contains a specific value */
public class Program5 {
	public static boolean contains(int[] arr , int item )
	{
	for (int n :arr)
	{
		if(item == n) {
			return true;
		}
	}
	return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(contains(array , 11));
		System.out.println(contains(array , 5));
		
	}

}
