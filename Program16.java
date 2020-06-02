import java.util.Arrays;

/* Write a  java program to remove duplicate elements from an array*/
public class Program16 {
	static void unique_array(int[] My_Array)
	{
		System.out.println("Original array:");
		
		
		for (int i = 0; i < My_Array.length ; i++)
		{
		     System.out.println(My_Array[i]+"\t");
			
		}
		
		
		int no_unique_elements = My_Array.length;
		
		for (int i = 0 ; i < no_unique_elements ; i ++)
		{
			for (int j = i + 1 ; j <  no_unique_elements ; j++ )
			{
				if (My_Array[i] == My_Array[j])
				{
					
					
					My_Array[j] = My_Array[no_unique_elements -1];
					
					no_unique_elements --;
					
					
					j--;
				}
						
			}
		}
		int[] array1 = Arrays.copyOf(My_Array , no_unique_elements);
		System.out.println("array1");
		for (int element: array1) 
		{
			
			System.out.println(element);
		}
		System.out.println("My Array");
		for (int element : My_Array)
		{
			
			System.out.println(element);
		}
		
			System.out.println("No unique array "+no_unique_elements);
		
		
		System.out.println();
		
		System.out.println("Arrays with unique values :");
		
		for (int i = 0 ; i < array1.length ; i++)
		{
			System.out.println(array1[i]+"\t");
		}
		
		System.out.println();
		
		
		System.out.println("---------------------------------");
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		unique_array(new int[] {0,3,-2,4,3,2});
	
	}

}
