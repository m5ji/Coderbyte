package Coderbyte;
import java.util.*; 
import java.io.*;

/*
 Using the Java language, 
 have the function ThreeFiveMultiples(num) 
 return the sum of all the multiples of 3 and 5 that are below num. 
 For example: if num is 10, the multiples of 3 and 5 that are below 10 
 are 3, 5, 6, and 9, and adding them up you get 23, 
 so your program should return 23. 
 The integer being passed will be between 1 and 100. 
 */

class Function_twenty {  
	boolean three = false;
	boolean five = false;
	int count = 1;
	int sum = 0;
  int ThreeFiveMultiples(int num) { 
  
    while(three == false || five == false)
    {
    	if(3 * count < num)
    		sum += 3 * count;
    	else
    		three = true;
    	if(5 * count < num)
    		sum += 5 * count;
    	else 
    		five = true;
    	count++;
    }
       
    return sum;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_twenty c = new Function_twenty();
    System.out.print(c.ThreeFiveMultiples(Integer.valueOf(s.nextLine()))); 
  }   
  
}

