package Coderbyte;

import java.util.*; 
import java.io.*;

class Function_four {  
	int tmp = 1;
	int divider = 2;
  int Division(int num1, int num2) { 
  
       while(divider < num1 && divider < num2)
       {
    	   if(num1 % divider == 0 && num2 % divider == 0)
    		   tmp = divider;
    	   divider++;
       }
    return tmp;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    Function_four c = new Function_four();
    System.out.print(c.Division(Integer.parseInt(s.nextLine()), Integer.parseInt(a.nextLine()))); 
  }   
  
}








  