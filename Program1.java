import java.util.Arrays;

/* Question -1 
 * Write a program to sort a numeric array and a string array*/

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] numberArray = {256 , 653 ,969 ,536 , 9696 ,254 ,256  };
     String[] stringArray = { "mahadev","Krishna","Sita","sabri","ambema","Sai"};
    		 
     System.out.println("This is original number array"+Arrays.toString(numberArray));
     Arrays.sort(numberArray);
     System.out.println("This is Sorted Array"+Arrays.toString(numberArray));
     System.out.println("This is original String Array"+Arrays.toString(stringArray));
     Arrays.sort(stringArray);
     System.out.println("This is sorted String Array"+Arrays.toString(stringArray));
     
	}

}
