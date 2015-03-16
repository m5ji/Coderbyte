package Coderbyte;

import java.util.*; 
import java.io.*;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/*
Using the Java language, 
have the function PermutationStep(num) 
take the num parameter being passed 
and return the next number greater than num using the same digits. 
For example: if num is 123 return 132, if it's 12453 return 12534. 
If a number has no greater permutations, return -1 (ie. 999). 
*/

class Function_fourteen {  
	char[] num_arr; 
	char tmp_char;
	int tmp_int = 0;
	int index = 1;
	boolean first = false;
	int original_num = 0;
  int PermutationStep(int num) { 
	  	tmp_int = num;
       num_arr = String.valueOf(num).toCharArray();
       for(int i = num_arr.length - 2; i >= 0; i--)
       {
    	   for(int j = num_arr.length -1; j > num_arr.length - index - 1; j--)
           {
    		   //switch
        	   tmp_char = num_arr[j];
        	   num_arr[j] = num_arr[i];
        	   num_arr[i] = tmp_char;
        	   //check if the switched one higher than the original one
        	   if(Integer.valueOf(String.valueOf(num_arr)) > num && first == false)
        	   {
        		   first = true;
        		   original_num = num;
        		   return PermutationStep(Integer.valueOf(String.valueOf(num_arr)));
        	   }
        	   //To find one smaller than the first found value && higher than the original one
        	   else if(Integer.valueOf(String.valueOf(num_arr)) > original_num 
        			   && Integer.valueOf(String.valueOf(num_arr)) < num 
        			   && first == true)
        	   {
        		   return PermutationStep(Integer.valueOf(String.valueOf(num_arr)));
        	   }
        	   
        	   if(first == true)
        		   return num;
           }
    	   index++;
       }
    return num;
    
  } 
  
  public static void main (String[] args) {      
    Scanner  s = new Scanner(System.in);
    Function_fourteen c = new Function_fourteen();
    System.out.print(c.PermutationStep(Integer.valueOf(s.nextLine()))); 
  }   
  
}