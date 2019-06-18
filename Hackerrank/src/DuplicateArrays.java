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
for (int i = 0; i < names.length; i++) 
{ 
	for (int j = i + 1; j < names.length; j++) 
{ 
	if (names[i]==names[j]  ) 

{ 
		System.out.println(names[i]); 
		//break;

} 
	
} }

}}
