package StringManipulation;
import java.util.*;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class StringPalindrome {

	public static void main(String[] args) {
		
		//String S = "malyalam";
		//char[] A = S.toCharArray();
		String original, reverse = ""; // Objects of String class
	      Scanner scan = new Scanner(System.in);
	     
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = scan.nextLine();
	     
	      int length = original.length();
	     
	      for (int i = length - 1; i >= 0; i--)
	      {
	         reverse = reverse + original.charAt(i);
	      }
	      System.out.println("The reverse of this String is " + reverse);
	      
	         
	      if (original.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	         
	      //Collections.sort(original);
}}
