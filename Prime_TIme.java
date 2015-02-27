package Coderbyte;

import java.util.*; 
import java.io.*;

class Function {  
  int counter = 2;
  boolean PrimeTime(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    while(counter < num)
    {
      if(num % counter == 0)
      {
        counter = 2;
        return false;
      }
      counter++;
    }
    counter = 2;
    return true;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PrimeTime(Integer.parseInt(s.nextLine()))); 
  }   
  
}