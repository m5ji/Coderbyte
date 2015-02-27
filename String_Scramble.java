package Coderbyte;

import java.util.*; 
import java.io.*;

class Function_five {  
	char array1[];
	char array2[];
	boolean found = false;
  boolean StringScramble(String str1, String str2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	  array1 = str1.toCharArray();
	  array2 = str2.toCharArray();
	  for(int i = 0; i < array1.length; i++)
	  {
		  for(int j = 0; j < array2.length; j++)
		  {
			  if(array1[i] == array2[j])
			  {
				  array2[j] = ' ';
				  found = true;
			  }
		  }
		  
		  if(found == false)
			  return false;
		  found = false;
	  }
    return true;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Scanner  a = new Scanner(System.in);
    Function_five c = new Function_five();
    System.out.print(c.StringScramble(s.nextLine(), a.nextLine())); 
  }   
  
}