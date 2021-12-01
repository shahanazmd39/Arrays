
public class DimensionalArray1 
{

	public static void main(String[] args) 
	{
		String cities[] = {"Hyderabad","Vizag","Manuguru","Khammam"};
		
		//string by string printing
		for(int i=0; i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
   
		//character by character printing
		for(int i=0; i<cities.length;i++)
		{
			
		//Each cities [i] is working like a string
			for(int j=0; j<cities[i].length();j++)
			{
			System.out.print(cities[i].charAt(j)+" , ");
		    }
			System.out.println();
	     }

	}
}
