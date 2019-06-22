import java.sql.Array;
import java.util.Arrays;

public class DuplicateArrays 

{ 
	public static void main(String args[]) 
{ 
		//String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 
		int names[] = {1, 5, 9, 1, 4, 9, 6, 5, 7};
		
	    
		
		//int n = arr.length;
	    // First solution : finding duplicates using brute force method 
System.out.println("Finding duplicate elements in array using brute force method"); 
removeDuplicates(names);
}

public static void removeDuplicates(int []names){
	int [] duplicate = new int [0];
	int index =0;
	
	for (int i = 0; i < names.length; i++) 
{ 
	for (int j = i + 1; j < names.length; j++) 
{ 
	if (names[i]==names[j]  ) 

{ 
		//int[] duplicate = new int [i];
		duplicate[index++] = names[i];
		//System.out.println(duplicate[]); 
		//break;
		

} 
	
	
} }
	

}}
