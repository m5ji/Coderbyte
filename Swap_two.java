package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function SwapII(str) take the str parameter 
and swap the case of each character. 
Then, if a letter is between two numbers (without separation), 
switch the places of the two numbers. 
For example: if str is "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3.
*/

class Function_seventeen {  
	char[] char_arr;
	int first_index = 0;
	int second_index = 0;
	boolean first = false;
	boolean swapped = false;
	char tmp;
  String SwapII(String str) { 
       char_arr = str.toCharArray();
       
       for(int i = 0; i < char_arr.length; i++)
       {
    		 //swap the case of each character
        	   if(String.valueOf(char_arr[i]).matches("[a-z]") && swapped == false)
        	   {
        		   char_arr[i] = String.valueOf(char_arr[i]).toUpperCase().charAt(0);
        		   swapped = true;
        	   }
        	   if(String.valueOf(char_arr[i]).matches("[A-Z]") && swapped == false)
        	   {
        		   char_arr[i] = String.valueOf(char_arr[i]).toLowerCase().charAt(0);
        		   swapped = true;
        	   }
        		   
               //if a letter is between two numbers (without separation), 
               //switch the places of the two numbers
        	   if(String.valueOf(char_arr[i]).matches("[0-9]"))
        	   {
        		   if(first == false)
        		   {
        			   first_index = i;
        			   first = true;
        		   }
        		   else
        		   {
        			   second_index = i;
        			   //switch
        			   tmp = char_arr[first_index];
        			   char_arr[first_index] = char_arr[second_index];
        			   char_arr[second_index] = tmp;
        			   
        			   first = false;
        		   }
        			   
        	   }
        	   if(char_arr[i] == ' ')
        	   {
        		   if(first == true)
        		   {
        			   first_index = 0;
            		   first = false;
        		   }
        	   }
        	   swapped = false;
    	   
       }
    return String.valueOf(char_arr);
    
  } 
  
  public static void main (String[] args) {      
    Scanner  s = new Scanner(System.in);
    Function_seventeen c = new Function_seventeen();
    System.out.print(c.SwapII(s.nextLine())); 
  }   
  
}