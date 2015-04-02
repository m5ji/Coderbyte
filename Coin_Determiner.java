package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function CoinDeterminer(num) take the input,
which will be an integer ranging from 1 to 250, 
and return an integer output that will specify the least number of coins, 
that when added, equal the input integer. 
Coins are based on a system as follows: 
there are coins representing the integers 1, 5, 7, 9, and 11. 
So for example: if num is 16, then the output should be 2 
because you can achieve the number 16 with the coins 9 and 7. 
If num is 25, then the output should be 3 
because you can achieve 25 with either 11, 9, and 5 coins or with 9, 9, and 7 coins. 
*/

class Function_twentyone {  
	int count = 0;
  int CoinDeterminer(int num) { 
       while(num > 0)
       {
    	   if(num - 11 >= 11 || num - 11 == 0)
    	   {
    		   num -= 11;
    		   count++;
    	   }
    	   else if(num - 9 >= 9 || num - 9 == 0)
    	   {
    		   num -= 9;
    		   count++;
    	   }
    	   else if(num -5 >= 5 || num - 5 == 0)
    	   {
    		   num -= 5;
    		   count++;
    	   }
    	   else if(num -1 >= 1 || num - 1 == 0)
    	   {
    		   num -= 1;
    		   count++;
    	   }
       }
    return count;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_twentyone c = new Function_twentyone();
    System.out.print(c.CoinDeterminer(Integer.valueOf(s.nextLine()))); 
  }   
  
}