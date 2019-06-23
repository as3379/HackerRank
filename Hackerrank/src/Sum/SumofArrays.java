package Sum;

public class SumofArrays {
	
	public static void main (String [] args)
	{
		int arr [] = {1, 0, 4 , 5, 12};
		int n = arr.length;
		int i,sum = 0;
		
		{
			
			for (i=0; i<n; i++)
			{
				sum = sum + arr[i];
			}
		 System.out.print(sum);
		 }
	}

}
