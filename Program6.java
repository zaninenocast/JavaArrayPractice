/* Write a java program to find the index of an arry element*/ 
public class Program6 {
	 static int findIndex(int[] arra ,int t)
	 {
		 if (arra == null)
			 return -1;
	
	 int i = 0;
	 while(i < arra.length)
	 {
		 if (arra[i]== t)
		 {
			 return i;
		 }
		 else
		 {
			 i = i+1;
		 }
	 }
	 return -1;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] array = {1,2,3,4,5,6,7,8,9};
      System.out.println(findIndex(array,6));     
	}

}
