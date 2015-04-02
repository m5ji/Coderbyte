package Coderbyte;
import java.util.*; 
import java.io.*;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

/*
 Using the Java language, 
 have the function DistinctList(arr) take the array of numbers stored in arr 
 and determine the total number of duplicate entries. 
 For example if the input is [1, 2, 2, 2, 3] 
 then your program should output 2 
 because there are two duplicates of one of the elements. 
 */

class Function_twentyfive {  
	HashMap<Integer, Integer> mymap = new HashMap();
	List<Integer> mylist = new ArrayList();
	int duplicate_num = 0;
	boolean negative = false;
	Iterator<Integer> myiterator;
	
  int DistinctList(char[] arr) {
	  //Store input integers into a list
	  for(int a = 0; a < arr.length; a++)
	  {
		  if(arr[a] != ',')
		  {
			  if(arr[a] == '-')
				  negative = true;
			  else  if(negative == true)
				  mylist.add(-Character.getNumericValue(arr[a]));
			  else
				  mylist.add(Character.getNumericValue(arr[a]));
		  }
	  }
	  
	  for(int i = 0; i < mylist.toArray().length; i++)
	  {
		  if(mymap.get((Integer)mylist.toArray()[i]) == null)
			  mymap.put((Integer)mylist.toArray()[i], 0);
		  else
			  mymap.replace((Integer)mylist.toArray()[i]
					  , mymap.get((Integer)mylist.toArray()[i]) + 1);
	  }
	  
	  //Iterator must be stored to use hasNext(), and next()
	  myiterator = mymap.values().iterator();
	  while(myiterator.hasNext())
	  {
		  duplicate_num += myiterator.next();
	  }
    return duplicate_num;
    
  } 
  
  public static void main (String[] args) {   
	  //input format ex:1,2,2,-2,3
    Scanner  s = new Scanner(System.in);
    Function_twentyfive c = new Function_twentyfive();
    System.out.print(c.DistinctList(s.nextLine().toCharArray())); 
  }   
  
}