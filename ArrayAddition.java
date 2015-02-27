package Coderbyte;

import java.util.*; 
import java.io.*;

class Function_six {  
	
	int total = 0;
	int size = 6;
	static int tmp = 0;
	static boolean current_statement = false;

	//To find the largest number

public static	int largest(int arr[])
	{
	    for(int x = 0; x < arr.length; x++)
	    {
	        if(tmp < arr[x])
	            tmp = arr[x];
	    }
	    return tmp;
	}

 //Recursively find the combination equals the largest number in the array
public static void ArrayAddition(int arr[], int index, int lastindex, int total) {
	        if(index == lastindex)
	        {
	            for(int j = index; j < arr.length; j++)
	            {
	                total += arr[j];
	                if(total == largest(arr))
	                {
	                    total = 0;
	                    current_statement = true;
	                }
	                else
	                    total -= arr[j];
	            }
	            return;
	        }
	        
	        for(int a = index; a < arr.length; a++)
	        {
	            total += arr[a];
	            ArrayAddition(arr, a + 1, lastindex, total);
	            total -= arr[a];
	        }
	}

  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_six c = new Function_six();
    int A[] = {3,5,-1,8,12};
    
    for(int i = 1; i < A.length; i++)
    	ArrayAddition(A, 0, i, 0);
    System.out.print(current_statement);
  }   
  
}