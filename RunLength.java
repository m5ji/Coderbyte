package Coderbyte;
import java.util.*; 
import java.io.*;

class Function_one {
	int counter = 0;
	int count_alphabet = 1;
	int index = 0;
	char tmp = ' ';
  String RunLength(String str) { 
  
       char array[] = str.toCharArray();
       char new_str[] = new char[array.length * 2];
       while(counter < array.length)
       {
    	   if (tmp != array[counter])
    	   {
    		   if(tmp != ' ')
    		   {
    			   new_str[index] = Character.forDigit(count_alphabet, 10);//int to char
    			   index++;
    			   new_str[index] = tmp;
    			   index++;
    		   }
    		   count_alphabet = 1;
    		   tmp = array[counter];
    	   }
    	   else
    		   count_alphabet++;
    	   counter++;
       }
       //For the last alphabet & number
       new_str[index] = Character.forDigit(count_alphabet, 10);
	   index++;
	   new_str[index] = tmp;
	   index++;
	   
	   //default
	   index = 0;
       counter = 0;
    //char array to string
    return new String(new_str);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_one c = new Function_one();
    System.out.print(c.RunLength(s.nextLine())); 
  }   
  
}