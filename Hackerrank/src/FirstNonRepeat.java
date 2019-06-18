import java.util.HashMap;

public class FirstNonRepeat {

	public static void main (String[] args)
	{
		String S = "WWELCOMe";
		String S1 = S.toLowerCase();
		int i = 0;
		//char c = S1.charAt(i);
		int n = S1.length();
		HashMap <Character, Integer> hm = new HashMap <Character, Integer> ();
		
		char c;
		for (i=0; i<n; i++)
		{
			c=S1.charAt(i);
			if(hm.containsKey(c))
			{
				hm.put(  c ,  hm.get(c) +1 );
				
			}
			
			else
			{
				hm.put(  c ,  1 );
			}
		}
		
		
		for (i=0; i<n; i++)
		{
			c=S1.charAt(i);
			if( hm.get(c)  == 1 )
			{
				System.out.print(c);
				break;
			
		}
		
		}
		
	}
}
