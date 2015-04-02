package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function StringReduction(str) take the str parameter being passed 
and return the smallest number you can get through the following reduction method. 
The method is: Only the letters a, b, and c will be given in str 
and you must take two different adjacent characters 
and replace it with the third. 
For example "ac" can be replaced with "b" but "aa" cannot be replaced with anything. 
This method is done repeatedly until the string cannot be further reduced, 
and the length of the resulting string is to be outputted. 
For example: if str is "cab", "ca" can be reduced to "b" 
and you get "bb" (you can also reduce it to "cc"). 
The reduction is done so the output should be 2. 
If str is "bcab", "bc" reduces to "a", 
so you have "aab", then "ab" reduces to "c", 
and the final string "ac" is reduced to "b" so the output should be 1. 
 */

class Function_nineteen {  
	char[] char_arr;
	char[] tmp;
  String StringReduction(String str) { 
	  char_arr = str.toCharArray();
	  for(int i = 1; i < char_arr.length; i++)
	  {
		  if(char_arr[i - 1] != char_arr[i])
		  {
			  if(char_arr[i - 1] != 'a' && char_arr[i] != 'a')
			  {
				  char_arr[i-1] = 'a';
				  shift(char_arr, i);
				  i--;
			  }
			  else if(char_arr[i - 1] != 'b' && char_arr[i] != 'b')
			  {
				  char_arr[i-1] = 'b';
				  shift(char_arr, i);
				  i--;
			  }
			  else if(char_arr[i - 1] != 'c' && char_arr[i] != 'c')
			  {
				  char_arr[i-1] = 'c';
				  shift(char_arr, i);
				  i--;
			  }
		  }
		  if(i == char_arr.length - 1)
		  {
			  if(char_arr != tmp)
			  {
				  i = 0;
				  tmp = char_arr;
			  }
			  else
				  return String.valueOf(char_arr);
		  }
	  }
    return String.valueOf(char_arr);
    
  }
  
  void shift(char[] char_arr, int index)
  {
	  this.char_arr = new char[char_arr.length - 1];
	  for(int i = index; i< this.char_arr.length; i++)
	  {
		  this.char_arr[i] = char_arr[i + 1];
	  }
	  for(int j = index - 1; j >= 0 ; j--)
	  {
		  this.char_arr[j] = char_arr[j];
	  }
  }
  
  public static void main (String[] args) {     
    Scanner  s = new Scanner(System.in);
    Function_nineteen c = new Function_nineteen();
    System.out.print(c.StringReduction(s.nextLine())); 
  }   
}