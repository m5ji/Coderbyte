package Coderbyte;
import java.util.*; 
import java.io.*;

/*Using the Java language, have the function LetterCount(str) take the str parameter being passed and return the first word with the greatest number of repeated letters. 
 For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with repeating letters return -1. 
 Words will be separated by spaces. */

class Function_eight {  
	String arr[];
	char char_arr[];
	char alphabet;
	int counter = 0;
	int index = 0;
	int tmp = 0;
	int highest = 0;
	//key & value must be objects
	//HashMap<key, value>
	HashMap<Character, Integer> mymap = new HashMap<Character, Integer>();
  String LetterCount(String str) { 
	  
    arr = str.split(" ");
    for(int i = 0; i < arr.length; i++)
    {
    	char_arr = arr[i].toLowerCase().toCharArray();
    	for(int j = 0; j < char_arr.length; j++)
    	{
    		//[alphabet, counter]
    		if(mymap.get(char_arr[j]) != null)
    			mymap.replace(char_arr[j], mymap.get(char_arr[j]) + 1);
    		else
    			mymap.put(char_arr[j], 1);
    		
    		//Find the highest number of repeated letters of a word
    		if(tmp < mymap.get(char_arr[j]))
    			tmp = mymap.get(char_arr[j]);
    	}
    	
    	//Compare the highest numbers of different words
    	if(highest < tmp)
    	{
    		highest = tmp;
    		index = i;
    	}
    	mymap.clear();
    	
    }
   
    if(highest == 1)
    	return "-1";
       
    return arr[index];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function_eight c = new Function_eight();
    System.out.print(c.LetterCount(s.nextLine())); 
  }   
  
}