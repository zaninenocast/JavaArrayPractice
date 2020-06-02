import java.util.ArrayList;

/*  Write a java program to convert an arraylist to array*/ 
public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("komal");
		list.add("jatyani");
		list.add("Priya");
		list.add("Jatyani");
		String[] array =  new String[list.size()];
		list.toArray(array);
		for (String m : array)
		{
		System.out.println(m);
		}
		

	}

}
