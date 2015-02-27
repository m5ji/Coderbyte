package Coderbyte;
import java.util.*; 
import java.io.*;

class Function_two {  
	int prime_num = 2;
	int counter = 2;
  int PrimeMover(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       while(num > 0)
       {
    	   while(counter < prime_num)
    	   {
    		   if(prime_num % counter == 0)
    		   {
    			   prime_num++;
    			   counter = 2;
    		   }
    		   counter++;
    	   }
    	   num--;
    	   counter = 2;
    	   if(num !=0)
    		   prime_num++;
       }
    return prime_num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_two c = new Function_two();
    System.out.print(c.PrimeMover(Integer.parseInt(s.nextLine()))); 
  }   
  
}








  