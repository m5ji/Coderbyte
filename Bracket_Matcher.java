package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function BracketMatcher(str) take the str parameter being passed 
and return 1 if the brackets are correctly matched and each one is accounted for. 
Otherwise return 0. 
For example: if str is "(hello (world))", 
then the output should be 1, 
but if str is "((hello (world))" the the output should be 0 
because the brackets do not correctly match up. 
Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1. 
*/

class Function_eightteen {  
	char[] char_arr;
	int match = 0;
  boolean BracketMatcher(String str) { 
       
	  char_arr = str.toCharArray();
	  for(int i = 0; i < char_arr.length; i++)
	  {
		  if(char_arr[i] == '(')
			  match++;
		  else if(char_arr[i] == ')')
			  match--;
	  }
	  if(match == 0)
		  return true;
	  else
		  return false;
    
  } 
  
  public static void main (String[] args) {      
    Scanner  s = new Scanner(System.in);
    Function_eightteen c = new Function_eightteen();
    System.out.print(c.BracketMatcher(s.nextLine())); 
  }   
  
}
