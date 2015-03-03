package Coderbyte;
import java.util.*; 
import java.io.*;

/*Using the Java language, 
have the function CountingMinutes(str) take the str parameter being passed which will be two times 
(each properly formatted with a colon and am or pm) 
separated by a hyphen and return the total number of minutes between the two times. 
The time will be in a 12 hour clock format. 
For example: if str is 9:00am-10:00am then the output should be 60. 
If str is 1:00pm-11:00am the output should be 1320. */

class Function_thirteen {  
	String[] times;
	int hour = 0;
	int mins = 0;
	String[] arr;
	char[] char_arr;
	int diff = 0;
  String CountingMinutes(String str) { 
       
	  times = str.split("-");
	  for(int i = 0; i < times.length; i++)
	  {
		  
		  arr = times[i].split(":");
		  hour = Integer.valueOf(arr[0]);
		  char_arr = arr[1].toCharArray();
		  mins = Integer.valueOf(String.valueOf(char_arr[0])) * 10 
				  + Integer.valueOf(String.valueOf(char_arr[1]));
		  if(char_arr[2] == 'p')
			  hour += 12;
		  
		  if(i != times.length - 1)
			  diff -= hour*60 + mins;
		  else
			  diff += hour*60 + mins;
	  }
	  
	  if(diff < 0)
		  diff += 24*60;
	  
    return String.valueOf(diff);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_thirteen c = new Function_thirteen();
    System.out.print(c.CountingMinutes(s.nextLine())); 
  }   
  
}