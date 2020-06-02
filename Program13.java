/* Write a java program to find the duplicate values of n array of string values.*/ 
public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String[] arra = {"Komal jatyani","abc","dcs","Komal jatyani"};
          for (int i = 0 ; i < arra.length ;  i++)
          {
        	  for (int j = i+1 ; j < arra.length ; j ++)
        	  {
        		  if (arra[i].equals(arra[j] ) && (i != j))
        			  
        		  {
        			  System.out.println(arra[j]);
        		  }
        	  }
          }
         
	}

}
