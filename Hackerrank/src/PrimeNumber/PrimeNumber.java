package PrimeNumber;
import java.util.Scanner;

public class PrimeNumber{    
 private static Scanner scan;

public static void main(String args[]){    
  //int i,m=0,flag=0;      
  //int n=3;//it is the number to be checked    
  //m=n/2;  
	System.out.println("Enter the value you wanna check");
//  
scan = new Scanner(System.in);
int n = scan.nextInt();

	//int  n= 36;
  if(n==0||n==1){  
   System.out.println(n + " is a not prime number");      
  }
  
  else 
	  {
	      if(n%2==1){      
	     
		  System.out.println(n+ " is a prime number");      
	     //flag=1;      
	         
	    }      
	        
	  else 
	  { 
		  System.out.println(n+" is not prime number"); 
	  
	  } 
	  }}}
   //for(n=2;n<=2;n++){      
    