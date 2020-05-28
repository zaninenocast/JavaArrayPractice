

/* Write a java program to find the maximum and minimum value of an array*/
public class Program10 {
	
	
	public static void main(String[] args) {
		 int[] arra = {1,2,3,4,5,6,7,-3,23};
		 int min = arra[0];
		  int max = arra[0];
		 for (int i = 1 ; i < arra.length ; i ++)
		 {
			 if (arra[i] < min)
			 {
				 min = arra[i] ;
			 }
			if (arra[i] > max)
			 {
				 max = arra[i] ;
			 } 			 
			 
		 }
		 System.out.println(max);
         System.out.println(min);		 
	}

}
