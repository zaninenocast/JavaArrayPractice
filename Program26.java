/* Write a Java program to move all 0's to the end of an array. 
 * Maintain the relative order of the other (non-zero) array elements.*/ 

	import java.util.Arrays;

	public class Program26 {
	public static void main(String[] args) {
	int[] a = { 0, 1, 2, 4, 0, 5, 7, 8 };
	int[] b = new int[a.length];
	int j = 0;
	for (int i = 0; i < a.length; i++) {
	if (a[i] != 0) {
	b[j++] = a[i];
	}
	}
	for (int i = 0; i < a.length; i++) {
	if (a[i] == 0) {
	b[j++] = a[i];
	}
	}
	System.out.println(Arrays.toString(b));

	}
	}

