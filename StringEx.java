
import java.util.Scanner;

class StringArray 
{
	public static void main(String[] args) 
	{
		Scanner goa = new Scanner(System.in);
		String cities[] = new String[5];
		
		for(int i=0;i<5;i=i+1) {
			System.out.println("Enter the city name ");
			cities[i] = goa.next();
		}
		
	}
}