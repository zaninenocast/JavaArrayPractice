/* Write a Java program to find common elements 
 * from three sorted (in non-decreasing order) arrays.*/
public class Program25 {
      static void common_element(int[] one , int[] two , int[] three)
      {
    	 for (int i = 0; i < one.length ; i ++)
    	 {
    		 for (int j = 0 ; j < two.length ; j++)
    		 {
    			 if (one[i] == two[j])
    			 {
    				 for (int k = 0 ; k < three.length ; k++)
    				 {
    					 if (two[j] == three[k])
    					 {
    						 System.out.println(three[k]);
    					 }
    				 }
    					 
    			 }
    				 
    		 }
    	 }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a1 = {2,3,4};
        int [] a2 = {4,5,6};
        int []a3 = {4,3,2,1};
        Program25 array = new Program25();
        array.common_element(a1, a2, a3);
	}

}
