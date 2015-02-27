package Coderbyte;
import java.util.*; 
import java.io.*;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/*Using the Java language, 
 * have the function SimpleMode(arr) take the array of numbers stored in arr and return the number that appears most frequently (the mode). 
 * For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. 
 * If there is more than one mode return the one that appeared in the array first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). 
 * If there is no mode return -1. The array will not be empty. */

class Function_ten {  
	static HashMap<Integer, Integer> mymap = new HashMap();
	static int index = 0;
	static int highest = 0;
	static String[] arr;
	static int[] int_arr;
  static int SimpleMode(int[] arr) { 
	  for(int i = 0; i < arr.length; i++)
	  {
		  if(mymap.get(arr[i]) == null)
			  mymap.put(arr[i], 1);
		  else
			  mymap.replace(arr[i], mymap.get(arr[i]) + 1);
	  }
	  
	  //Find the number that appeared most frequently
	  for(int j = 0; j < arr.length; j++)
	  {
		  if(highest < mymap.get(arr[j]))
		  {
			  highest = mymap.get(arr[j]);
			  index = j;
		  }
	  }
	  
	  if(highest == 1)
		  return -1;
    return arr[index];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_ten c = new Function_ten();
    
    //Input format must be n,n,n,n,...
    arr = s.nextLine().split(",");
    int_arr = new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    	int_arr[i] = Integer.valueOf(arr[i]);
    
    System.out.print(c.SimpleMode(int_arr)); 
  }   
  
}