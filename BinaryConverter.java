package Coderbyte;

import java.util.*; 
import java.io.*;


/*Using the Java language, have the function BinaryConverter(str) return the decimal form of the binary value. 
 For example: if 101 is passed return 5, or if 1000 is passed return 8.*/

class Function_seven {  
	char arr[];
	int total = 0;
  String BinaryConverter(String str) { 
	  
       arr = str.toCharArray();
       for(int i = 0; i < arr.length ; i++)
       {
    	   if(arr[i] == '1')
    	   {
    		   total += Math.pow(2, arr.length - (i + 1));
    	   }
       }
    return Integer.toString(total);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_seven c = new Function_seven();
    System.out.print(c.BinaryConverter(s.nextLine())); 
  }   
  
}