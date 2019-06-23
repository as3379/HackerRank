package ArrayRemoveDuplicates;



import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
 
public class LinkedHash
	{
     public static void main(String[] args)
	    {
       // Get the ArrayList with duplicate values.
       ArrayList<Integer> Original = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
    	
         
        System.out.println(Original);
        
      //Create a LinkedHashSet from this ArrayList. This will remove the duplicates
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Original);
        
        //Convert this LinkedHashSet back to Arraylist. 
       ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);
        
        //Since I'm passing Original into HashSet you dont have to convert it to array
        System.out.println(listWithoutDuplicates);
    
    	    Set<Integer> duplicates = new LinkedHashSet<>();
    	    Set<Integer> uniques = new HashSet<>();
    	    
    	    //System.out.println("Duplicate uniques : "+ uniques);

    	    for(Integer t : Original) {
    	        if(!uniques.add(t)) {
    	            duplicates.add(t);
    	        }
    	    }
    		
    		System.out.println("Duplicate Elements : "+ duplicates);
    	}}
     
        	
   /*
     
     System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
	    }*/
     