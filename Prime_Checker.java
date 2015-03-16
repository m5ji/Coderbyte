package Coderbyte;

import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function PrimeChecker(num) take num and return 1 
if any arrangement of num comes out to be a prime number, 
otherwise return 0. For example: if num is 910, 
the output should be 1 because 910 can be arranged into 109 or 019, both of which are primes. 
*/

class Function_fifteen {  
	
	char[] num_arr; 
	char tmp_char;
	int tmp_int = 0;
	int index = 2;
	boolean found = true;
	boolean first = false;
	int original_num = 0;
	
  boolean PrimeChecker(int num) { 
	  
	  //Check if num is prime
	  for(int a = 2; a < num; a++)
	  {
		  if(num % a != 0 && found == true)
			  found = true;
		  else
			  found = false;
	  }
	  
	  //Try a different arrangement of num
	  if(found == false)
	  {
	      num_arr = String.valueOf(num).toCharArray();
	    	  for(int i = 1; i < index; i++)
		      {
	    		  if(index <= num_arr.length)
	    	      {
	    			  for(int j = 0; j < i; j++)
			          {
			   		   if(first == false)
			   		   {
			   			   //switch
				       	   tmp_char = num_arr[j];
				       	   num_arr[j] = num_arr[i];
				       	   num_arr[i] = tmp_char;
				       	   
				       	   //To prevent repetition of i = 1 && j = 0
				       	   if(i == 1 && j == 0)
				       		   first = true;
				       	   else
				       		   first = false;
				       	   
				       	   found = true;
				       	   return PrimeChecker(Integer.valueOf(String.valueOf(num_arr)));
			   		   }
			          }
	    	      }
	    		  else
	    			  return found;
		   	   index++;
		   	   first = false;
		      }
	  }
   return found;
    
  } 
  
  public static void main (String[] args) {     
    Scanner  s = new Scanner(System.in);
    Function_fifteen c = new Function_fifteen();
    System.out.print(c.PrimeChecker(Integer.valueOf(s.nextLine()))); 
  }   
  
}