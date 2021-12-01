import java.util.Scanner;

public class IntArray1 {

	public static void main(String[] args)
	{
		//syntax to declare array in java
		//datatype arrayName[] = {val1,val2,val3...............}
		//int marks[] = {25,35,45,55,65,75,85};
		//System.out.println(marks[5]);
		
		

		//for(int i = 0 ;i<marks.length;i++)
		//{
			//System.out.println(marks[i]);
		//}
		
		//instantiate of an array in java
		//pushing elements in an array
		//int marks[] = new int[4];
		//marks[0]=10;
		//marks[1]=20;
		//marks[2]=30;
		//marks[3]=40;
		
		//display elements in an array
		//for(int i = 0 ;i<marks.length;i++)
			//{
			//System.out.println(marks[i]);
			//}
		
		
		//read from user
		Scanner scan = new Scanner(System.in);
		int  marks[] = new int[5];
		
		//pushing elements in an array
		for(int i = 0 ;i<marks.length;i++)
		   {
			System.out.println("Enter a value");
			marks[i] = scan.nextInt();
			}
				
		//display elements in an array
			for(int i = 0 ;i<marks.length;i++)
				{
				System.out.println(marks[i]);
			   }
			 // sum of the numbers
			int sum = 0;
			for(int i = 0 ;i<marks.length;i++)
			{
			System.out.println(marks[i]);
			sum = sum +marks[i];
		   }
			System.out.println("sum of the numbers is" + sum);
			
			float avg = sum/5f;
			System.out.println("avg of the numbers" + avg);
			
	}
	

}
