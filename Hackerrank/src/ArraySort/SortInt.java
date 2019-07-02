package ArraySort;
import java.io.*; 
import java.util.*; 
  
public class SortInt { 
      
          
    // function for sorting array 
  
    // Driver code 
    public static void main(String args[]) 
    { 
    	int arr []  = {45,12,85,32,89,39,69,44,42,1,6,8};
    	int n = arr.length;
    	int temp;
    	   for (int i = 0; i < n; i++) 
           {
               for (int j = i + 1; j < n; j++) 
               {
            	   
            	   //replace ">" with "<" to sort elements in descending order
                   if (arr[i] > arr[j]) 
                   {
                       temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                      // System.out.print(arr[i] + ",");
                   }
               }
           }
//           System.out.print("Ascending Order:");
//           for (int i = 0; i < n - 1; i++) 
//           {
               System.out.print(Arrays.toString(arr));
    }}