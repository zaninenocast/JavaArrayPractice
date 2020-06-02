/*Write a java program to find the duplicate values of an array of integer value
*/
public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arra= {1,2,3,4,5,6,3};
		System.out.println("duplicate elements are-");
		for (int i = 0 ; i < arra.length ; i ++)
          {
                  for (int j=i+1; j < arra.length ; j ++ )
                  {
                	  if (arra[i]== arra[j] && i!=j)
                	  {
                		  System.out.println(arra[j]+"   ");
                	  }
                  }
          }

	}

}
