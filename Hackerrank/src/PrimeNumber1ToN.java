import java.util.Scanner;
 
public class PrimeNumber1ToN {
 
    private static Scanner scanner = new Scanner( System.in );
 
    public static void main(String[] args) {
 
        System.out.println("Enter max number: ");
 
        String PrimeNumbers = "";
        int maxNumber = scanner.nextInt();
 
        System.out.println("List of the prime number between 1 - " + maxNumber);
 
        for (int num = 2; num <= maxNumber; num++)
        {
            
                if ( num % 2 == 1)
                {
                	
                	 PrimeNumbers = PrimeNumbers + num + " "; //System.out.println(num + " is not a prime " ); 
                	
                }
            
              
    }
        System.out.println(PrimeNumbers);
}}