package Coderbyte;
import java.util.*; 
import java.io.*;

/*Using the Java language, have the function CaesarCipher(str,num) take the str parameter and perform a Caesar Cipher shift on it using the num parameter as the shifting number. 
 * A Caesar Cipher works by shifting each letter in the string N places down in the alphabet (in this case N will be num). 
 * Punctuation, spaces, and capitalization should remain intact. 
 * For example if the string is "Caesar Cipher" and num is 2 the output should be "Ecguct Ekrjgt". 
 */
class Function_nine {  
	char arr[];
	int ascii = 0;
  String CaesarCipher(String str, int num) { 
  
    arr = str.toCharArray();
    for(int i = 0; i < arr.length; i++)
    {
    	//shifting each letter in the string num places down in the alphabet
    	if((int)arr[i] != 32)//ASCII code for a whitespace is 32
    	{
    		//Convert a character into ASCII value
    		ascii = (int)arr[i] + num;
    		arr[i] = (char)ascii;
    	}
    }
    return String.valueOf(arr);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    Function_nine c = new Function_nine();
    System.out.print(c.CaesarCipher(s.nextLine(), Integer.valueOf(a.nextLine()))); 
  }   
  
}