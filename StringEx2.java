
import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sha =new Scanner(System.in);
	      System.out.println("Enter a statement");
	      String str = sha.nextLine();
	      int count = 0;
	      for( int i=0; i<str.length();i++)
		  {
	        if(str.charAt(i) == 'a');
	        {
	        	count++;
	        }
		  }
	     System.out.println(" 'a' is occured "+count+" times");
	}

}
