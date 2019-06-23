package ArrayRemoveDuplicates;
import java.util.*; 
  
public class UsingArrayList { 
  
    // Function to remove duplicates from an ArrayList 

    // Driver code 
    public static void main(String args[]) 
    { 
  
        // Get the ArrayList with duplicate values 
        ArrayList<Integer> list = new ArrayList<>(Arrays .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
        int n = list.size();
  
        // Print the Arraylist 
        System.out.println("ArrayList with duplicate" + list); 
        
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
        
        // Traverse through the first list 
        for (Integer element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            }
        // Remove duplicates 
        
  
        // Print the ArrayList with duplicates removed 
       
    } 
        
        System.out.println("ArrayList with duplicates removed: "
                + newList); 
        
        
        Set<Integer> duplicates = new HashSet();
	    Set<Integer> uniques = new HashSet<>();
	    
	    //System.out.println("Duplicate uniques : "+ uniques);

	    for(Integer t : list) {
	        if(!uniques.add(t)) {
	            duplicates.add(t);
	        }
	    }
		
		System.out.println("Duplicate Elements : "+ duplicates);
	}}