import java.util.Arrays;

public class DistinctArray{ 

	public static void  main (String[] args) {
    int arr[] = {1, 5, 9, 1, 4, 9, 6, 5, 9, 7};
    int n = arr.length;
    
	 Arrays.sort(arr);
	 
	 
	
		    int i=0;
		    		while(i<arr.length) {
		    			
		    			if(arr[i]!=arr[i+1])
		    			{
		    				System.out.println(arr[i]);
		    				
		    			}
		    			
		    			i++;
		    		}
					//return -1;
					}}
		    		
//		    		public static void main(String[] args) 
//		    		{ 
//		    		    int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}; 
//		    		    //int n = sizeof(arr)/sizeof(arr[0]); 
//		    		    Distinctelements(arr); 
//		    		    //return 0; 
//		    		
//		    		}}
//		    // Traverse the sorted array 
//		    for (int i=0; i<n; i++) 
//		    { 
//		       // Move the index ahead while there are duplicates 
//		       while (i < n-1 && arr[i] == arr[i+1]) 
//		          i++; 
//		  
//		       // print last occurrence of the current element 
//		       cout << arr[i] << " "; 
//		    } 
//		
//		
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
