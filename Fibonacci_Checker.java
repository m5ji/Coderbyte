package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function FibonacciChecker(num) return the string yes 
if the number given is part of the Fibonacci sequence. 
This sequence is defined by: Fn = Fn-1 + Fn-2, 
which means to find Fn you add the previous two numbers up. 
The first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc. 
If num is not in the Fibonacci sequence, return the string no. 
 */
class Function_twentytwo {  
	int a = 0;
	int b = 1;
	int c = 0;
  boolean FibonacciChecker(int num) {
	  while(num > c)
	  {
		  c = a + b;
		  a = b;
		  b = c;
	  }
	  if (c == num)
		  return true;
	  else
		  return false;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_twentytwo c = new Function_twentytwo();
    System.out.print(c.FibonacciChecker(Integer.valueOf(s.nextLine()))); 
  }   
  
}