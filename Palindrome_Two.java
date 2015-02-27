package Coderbyte;

import java.util.*; 
import java.io.*;

class Function_three {
	String edited_str;
	int count = 0;
	char char_array[];
  boolean PalindromeTwo(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	  edited_str = str.toLowerCase().replaceAll(" ", "").replaceAll("[\\W]", "");
	  char_array = edited_str.toCharArray();
	  
	  while(count < char_array.length/2)
	  {
		  if(char_array[count] != char_array[char_array.length - 1 - count])
		  {
			  return false;
		  }
		  count++;
	  }
	  return true;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_three c = new Function_three();
    System.out.print(c.PalindromeTwo(s.nextLine())); 
  }   
  
}