import java.util.Scanner;

//Java Program to count the total number of characters in a string

public class TotalCharacters 
{

	public static void main(String[] args) 
	{
	  Scanner sha = new Scanner(System.in);
	  System.out.println(" Enter the Statement");
	  String stmt = sha.nextLine();
	  int count = 0;
	  
	  for(int i=0;i<stmt.length();i++)
	  {
		  if (stmt.charAt(i) ==' ')
		  count++;
	  } 
			System.out.println("Total number of characters" +count)  ;
	  
	  for(int i = 0; i < stmt.length(); i++) {    
          if(stmt.charAt(i) != ' ')    
              count++;    
      }    
		System.out.println("Total number of characters" + count);
	
	
	
	}

	}


