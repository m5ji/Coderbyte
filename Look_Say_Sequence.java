package Coderbyte;
import java.util.*; 
import java.io.*;

/*
 Using the Java language, 
 have the function LookSaySequence(num) take the num parameter being passed 
 and return the next number in the sequence according to the following rule: 
 to generate the next number in a sequence read off the digits of the given number, 
 counting the number of digits in groups of the same digit. 
 For example, the sequence beginning with 1 would be: 1, 11, 21, 1211, ... 
 The 11 comes from there being "one 1" before it 
 and the 21 comes from there being "two 1's" before it. 
 So your program should return the next number in the sequence given num. 
 */

class Function_twentyfour {  
	char[] char_arr;
	List<Character> mylist = new ArrayList();
	int count = 1;
	char tmp;
	boolean first = false;
  String LookSaySequence(int num) { 
      char_arr = String.valueOf(num).toCharArray();
      
      for(int i = 0; i < char_arr.length; i++)
      {
    	  if(first == false)
    	  {
    		  first = true;
    		  tmp = char_arr[i];
    	  }
    	  else
    	  {
    		  if(tmp == char_arr[i])
    		  {
    			  count++;
    			  
    			  if(i == char_arr.length - 1)
    			  {
    				  mylist.add(String.valueOf(count).charAt(0));
    				  mylist.add(tmp);
    				  
    				  tmp = char_arr[i];
    				  count = 1;
    			  }
    		  }
    		  else
    		  {
    			  mylist.add(String.valueOf(count).charAt(0));
    			  mylist.add(tmp);
    			  
    			  tmp = char_arr[i];
    			  count = 1;
    		  }
    	  }
      }
    return mylist.toString();
    
  } 
  
  public static void main (String[] args) {     
    Scanner  s = new Scanner(System.in);
    Function_twentyfour c = new Function_twentyfour();
    System.out.print(c.LookSaySequence(Integer.valueOf(s.nextLine()))); 
  }   
  
}