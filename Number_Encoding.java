package Coderbyte;
import java.util.*; 
import java.io.*;

/*
 Using the Java language, 
 have the function NumberEncoding(str) take the str parameter 
 and encode the message according to the following rule: 
 encode every letter into its corresponding numbered position in the alphabet. 
 Symbols and spaces will also be used in the input. 
 For example: if str is "af5c a#!" then your program should return 1653 1#!. 
 */

class Function_twentysix {  
	HashMap<Character, Integer> mymap = new HashMap();
	int count = 1;
	char[] arr;
	String encrypted = "";
  String NumberEncoding(String str) { 
	  for(int i = 97; i <= 122; i++)
	  {
		  mymap.put((char)i, count);
		  count++;
	  }
	  arr = str.toCharArray();
	  
	  for(int j = 0; j < arr.length; j++)
	  {
		  if(mymap.get(arr[j]) != null)
			  encrypted += mymap.get(arr[j]).toString();
		  else
			  encrypted += arr[j];
	  }
    return encrypted;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_twentysix c = new Function_twentysix();
    System.out.print(c.NumberEncoding(s.nextLine())); 
  }   
  
}