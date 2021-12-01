//Java Program to count the total number of vowels and consonants in a string

import java.util.Scanner;

public class VowelsConsonants 
{

	public static void main(String[] args) 
	{
		Scanner sha = new Scanner(System.in);
        System.out.println("Enter a statement");
        String str = sha.nextLine();
        int vcount =0;
        int ccount =0;
        int i=0;
        for( i=0;i<str.length();i++)
        {
        	if(str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u')
        	{
        		vcount++;
            }
        	else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                  
                ccount++;    
            }    
        }
        System.out.println(" the number of vowels in a string is:" + vcount);
        System.out.println(" the number of consonants in a string is:" + ccount);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.valueOf(7));
	}
	
}


