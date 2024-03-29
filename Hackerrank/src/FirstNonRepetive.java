import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class FirstNonRepetive {
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
             System.out.println(" Please enter the input string :" );
     Scanner in = new Scanner (System.in);
     String s=in.nextLine();
    	//String s = new String("Ashritha");
        String s1 = s.toUpperCase();
        char c=firstNonRepeatedCharacter(s1);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
    	
    	/* About LinkedHashMap: https://www.geeksforgeeks.org/linkedhashmap-class-java-examples/
    	A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
    	It contains only unique elements (See this for details)..
    	It may have one null key and multiple null values (See this for details).
    	It is same as HashMap with additional feature that it maintains insertion order. */
    	
    	LinkedHashMap<Character,Integer>  hm = new LinkedHashMap<Character ,Integer>();
        
    	int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        
        
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(hm.containsKey(c))
            {
            	
            	
                // increment count corresponding to c
            	hm.put(  c ,  hm.get(c) +1 );
            }
            else
            {
            	hm.put( c , 1 ) ;
            }
            
            System.out.println(hm);
        }
        // Search characterhashtable in in order of string str
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( hm.get(c)  == 1 )
            return c;
        }
return null ;
    }
} 