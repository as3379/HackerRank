
public class TriangleorNot {

	
	public static int CheckTriangle(int a, int b, int c)
	{
		
		
		if ((a+b > c) || (b+c > a) || (c+ a> b)  )
				{
			
			System.out.println("ABC is a Trianle");
				}
		
		else
			{
			
			System.out.println("ABC is not a Trianle");
			}
		return 0;
		
	}
	
	public static void main (String [] args)

{
		//int a = 10, b= 15, c= 25;
		TriangleorNot ck= new TriangleorNot();
		
		ck.CheckTriangle(0, 0, 0);
}}
