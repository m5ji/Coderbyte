package Coderbyte;
import java.util.*; 
import java.io.*;

/*
Using the Java language, 
have the function DashInsertII(str) insert dashes ('-') between each two odd numbers 
and insert asterisks ('*') between each two even numbers in str. 
For example: if str is 4546793 the output should be 454*67-9-3. 
Don't count zero as an odd or even number. 
*/

class Function_sixteen {  
	char[] num_arr;
	int tmp = 0;
  String DashInsertII(int num) { 
      num_arr = String.valueOf(num).toCharArray();
      for(int i = 1; i < num_arr.length; i++)
      {
    	  //Omit 0's
    	  if(num_arr[i] != '0' && num_arr[i-1] != '0')
    	  {
    		//insert asterisks ('*') between each two even numbers
        	  if(Integer.valueOf(num_arr[i]) % 2 == 0 
        			  && Integer.valueOf(num_arr[i - 1]) % 2 == 0)
        	  {
        		  shift(i, num_arr);
        		  num_arr[i] = '*';
        		  i++;
        	  }
        	  //insert dashes ('-') between each two odd numbers
        	  else if(Integer.valueOf(num_arr[i]) % 2 == 1 
        			  && Integer.valueOf(num_arr[i - 1]) % 2 == 1)
        	  {
        		  shift(i, num_arr);
        		  num_arr[i] = '-';
        		  i++;
        	  }
    	  }
      }
    return String.valueOf(num_arr);
    
  }
  
  void shift(int index, char[] num_arr)
  {
	  this.num_arr = new char[num_arr.length + 1];
	  for(int i = num_arr.length - 1; i >= index; i--)
	  {
		  this.num_arr[i + 1] = num_arr[i];
	  }
	  for(int j = 0; j < index; j++)
	  {
		  this.num_arr[j] = num_arr[j];
	  }
  }
  
  public static void main (String[] args) {     
    Scanner  s = new Scanner(System.in);
    Function_sixteen c = new Function_sixteen();
    System.out.print(c.DashInsertII(Integer.valueOf(s.nextLine()))); 
  }   
  
}