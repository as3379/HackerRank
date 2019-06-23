package Sum;

public class SumofConsecutive {

// Kadane's Algorithm
		
		public static void main (String [] args)
		{
			int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
			int max_so_far = 0, max_ending_here = 0;  
			int size = arr.length;
	  
    for (int i = 0; i < size; i++)  
    {  
        max_ending_here = max_ending_here + arr[i]; 
        if (max_ending_here < 0)  
            max_ending_here = 0;  
          
        /* Do not compare for all 
           elements. Compare only  
           when max_ending_here > 0 */
        else if (max_so_far < max_ending_here)  
            max_so_far = max_ending_here;  
          
    }  
    System.out.println( max_so_far);  
}  
}
