
public class TwoDimensionalArray 
{

	public static void main(String[] args) 
	{
		int marks[][] = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		int i=0;
		//displaying the first row
		
		for (int j =0; j<4; j++)
		{
			System.out.print(marks[0][j]+"   ");
			i++;
		}
		
		System.out.println(  );

		//displaying the second row
		
		for (int j =0; j<4; j++)
		{
			System.out.print(marks[1][j] +"   ");
			i++;
		}
		
		System.out.println(  );

		//displaying the third row
		
		for (int j =0; j<4; j++)
		{
			System.out.print(marks[2][j]+"   ");
			i++;
		}
		
		System.out.println(  );

	}

}


//for(int i=0;i<4;i++)
   //{
// for (int j =0; j<4; j++)
//{
	//System.out.print(marks[i][j]+"   ");
	//i++;
//}
  // //throws the cursor to the next line  
//System.out.println();  