
import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner sha =new Scanner(System.in);
	      System.out.println("Enter a statement");
	      String str = sha.nextLine();
	      int count = 0;
	      for( int i=0; i<str.length();i++)
		  {
	        if(str.charAt(i) == ' ')
	        {
	        	count++;
	        }
		  }
	     System.out.println(" space is occured "+count+" times");
	     System.out.println(" So there are"+(count+1)+" words");
	     
	}

}
