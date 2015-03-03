package Coderbyte;
import java.util.*; 
import java.io.*;
import java.text.*;

/*Using the Java language, have the function FormattedDivision(num1,num2) take both parameters being passed, 
divide num1 by num2, and return the result as a string with properly formatted commas and 4 significant digits after the decimal place. 
For example: if num1 is 123456789 and num2 is 10000 the output should be "12,345.6789". 
The output must contain a number in the one's place even if it is a zero. */

class Function_twelve {  
	
	//4 significant digits after the decimal place.
	//The output must contain a number in the one's place even if it is a zero.
	DecimalFormat mydecimal = new DecimalFormat("#.0000");
	double result = 0;
  String FormattedDivision(int num1, int num2) { 
       
	  result = (double)num1/num2;
	  
	  //4 significant digits after the decimal place
    return mydecimal.format(result);
  } 
  
  public static void main (String[] args) {      
	  System.out.print("num1 & num2\n");
    Scanner  s = new Scanner(System.in);
	  Scanner d = new Scanner(System.in);
    Function_twelve c = new Function_twelve();
    System.out.print(c.FormattedDivision(Integer.valueOf(s.nextLine()), Integer.valueOf(d.nextLine()))); 
  }   
  
}