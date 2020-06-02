/* Write  a program to test the equality of two arrays*/
public class Program23 {
static void equal(int[] array1 , int[] array2)
{
      boolean equals = true;
      if (array1.length == array2.length)
      {
    	  for (int i = 0 ; i < array1.length ; i ++)
    	  {
    		  if(array1[i] != array2[i])
    		  {
    			  equals = false;
    		  }
    		  else
    		  {
    			  equals = true;
    		  }
    			  
    	  }
      }
      if (equals)
      {
    	  System.out.println("Arrays rare equals");
      }
      else
      {
    	  System.out.println("not equal");
      }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] ara1 = {2,3,4,5,6,7};
      int[] ara2= {2,3,4,5,6,7};
      Program23 compare = new Program23();
      compare.equal(ara1,ara2);
      System.out.println(compare);
	}

}
