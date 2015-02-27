package Coderbyte;
import java.util.*; 
import java.io.*;

/*Using the Java language, have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number of integers needed to make the contents of arr consecutive from the lowest number to the highest number. 
For example: If arr contains [4, 8, 6] then the output should be 2 because two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8. Negative numbers may be entered as parameters and no array will have less than 2 elements.*/ 
class Function_eleven {  
	int counter = 0;
	int num_integers = 0;
	int min = 0;
	int max = 0;
	List<Integer> mylist = new ArrayList();
	
	int minimum(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			if(min > arr[i] || min == 0)
				min = arr[i];
		return min;
	}
	
	int maximum(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			if(max < arr[i])
				max = arr[i];
		return max;
	}
	
  int Consecutive(int[] arr) { 
  
	  for(int i = 0; i < arr.length; i++)
	  {
		  mylist.add(arr[i]);
	  }
	  num_integers = minimum(arr);
	  for(int j = 0; j < maximum(arr) - minimum(arr); j++)
	  {
		  if(!mylist.contains(num_integers))
			  counter++;
		  num_integers++;
	  }
	  return counter;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_eleven c = new Function_eleven();
    
    String arr[];
	int int_arr[];
    //Input format must be n,n,n,n,...
    arr = s.nextLine().split(",");
    int_arr = new int[arr.length];
    for(int i = 0; i < arr.length; i++)
    	int_arr[i] = Integer.valueOf(arr[i]);
    System.out.print(c.Consecutive(int_arr)); 
  }   
  
}