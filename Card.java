 /*
 * 
 * File: Cards.java
 * Purpose: 
 * Author: Neehar Shah 
 * Last Updated by: Mingu Jee
 * Date: 2015-01-28
 * 
 */

// Import Scanner from java.util
package Coderbyte;
import java.util.Scanner;

class Cards
{
    
    public static int count = 0;
    public static char [] temp1;
   
    static boolean first = true;
    
    public static int fact(int a)
    {
        if (a == 0 || a == 1)
        {       
            return 1;
        }
        return a * fact(a - 1);
    }
    

    public static void swap (char [] cardSwap, int index1, int index2)
    {
        char temp = cardSwap[index1];
        cardSwap[index1] = cardSwap[index2];
        cardSwap[index2] = temp;
    }
    

    public static void DeleteChar (char [] cardDelete, int length)
    {
        char [] temp = new char[length - 1];
        
        for (int i = 1; i < length; i++)
        {
            temp[i - 1] = cardDelete[i];
        }
        
        cardDelete = new char [temp.length];
        cardDelete = temp;
        System.out.println (cardDelete);
        System.out.println (cardDelete.length);
    }
    
   
    public static void shift (char [] cardShift, int length)
    {
        char temp = cardShift[0];
        
        for (int i = 0; i < length - 1; i++)
        {
            cardShift[i] = cardShift[i + 1];
        }
        
        cardShift[length - 1] = temp;
    }
    

    public static String Display(StringBuffer displayComma)
    {
        String display;
        
        display = "{" + displayComma.charAt(0);
            
        for (int i = 1; i < displayComma.length(); i++)
        {
            display += ", " + displayComma.charAt(i);
        }
        
        display += "}  ";
        
        return display;
    }
    

    public static void NoOrderNoRepetition(char [] cardValue, StringBuffer output, int x, int y, int count, int index)
    {
    	//Default set, just for conevenience
    	if(first == true)
    	{
    		for(int a = 0; a < y; a++)
    			output.append('0');
    		first = false;
    	}
    	
    	if(index >= y - 1)
        {
               for(int j = count; j < x; j++)
               {
            	   output.setCharAt(index, cardValue[j]);
            	   System.out.print(Display(output));
               }
               return;
        }
    	
        for(int i = count; i < x; i++)
        {
        	output.setCharAt(index, cardValue[i]);
        	NoOrderNoRepetition(cardValue, output, x, y, i + 1, index + 1);
        }
    }
    

    public static void OrderImportantRepetitionAllowed(char [] cardValue, StringBuffer output, int x, int y)
    {
        if (y == 0)
        {
            System.out.print(Display(output));
            return;
        }

        for (int i = 0; i < x; i++)
        {
            output.append(cardValue[i]);
            OrderImportantRepetitionAllowed (cardValue, output, x, y - 1);
            output.deleteCharAt(output.length() - 1);
        }
    }
    

    public static void OrderImportantNoRepetition(char [] cardValue, StringBuffer output, int x, int y)
    {
        if (y == 0)
        {
            for (int i = x; i < cardValue.length; i++)
            {
                output.append(cardValue[i]);
            }

            System.out.print(Display(output));
            return;
        }
        
        for (int i = 0; i < x; i++)
        {
            swap (cardValue, i, x - 1);
            OrderImportantNoRepetition (cardValue, new StringBuffer(), x - 1, y - 1);
            swap (cardValue, i, x - 1);
        }
    }
    

    public static void NoOrderRepetitionAllowed(char [] cardValue, StringBuffer output, int x, int y)
    {
        
       if (y == 0)
       {
           System.out.print(Display(output));
           return;
       }
       
       
       for (int i = 0; i < x; i++)
       {
           output.append(cardValue[i]);
           if (count > x)
           {
               DeleteChar (cardValue, x);
               //x--;
               count = 0;
           }
           NoOrderRepetitionAllowed (cardValue, output, x - 1, y - 1);
           output.deleteCharAt (output.length() - 1);
           count++;
       }
    }
    
    public static void main(String [] args)
    {
        int numberOfOutcomes = 0;
        int selection = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many different cards are available?  ");
        int X = in.nextInt();
        System.out.print("How many envelopes are required?  ");
        int Y = in.nextInt();
        
        char [] cards = new char[X];
        if (Y > X)
        {
            System.out.println("Sorry, you cannot have more envelopes than cards. Please try again.");
            main(null);
        }
        else
        {
            for (int i = 1; i <= X; i++)
            {
                System.out.print("What is card number " + i + "?  ");
                cards[i - 1] = in.next().charAt(0);
            }
        }
        
        System.out.println("1. All combinations where order is not important and repetition is not allowed\n" +
                            "2. All permutations where order is important and repetition is allowed\n" + 
                            "3. All permutations where order is important and repetition is not allowed\n" +
                            "4. All combinations where order is not important and repetition is allowed\n");
        System.out.print("Which of the above would you like to compute? Please select a number from 1 to 4:  ");
        selection = in.nextInt();
        
        switch (selection)
        {
            case 1:
                numberOfOutcomes = fact(X)/(fact(X - Y) * fact(Y));
                System.out.println("There are a total of " + numberOfOutcomes + " combinations:");
                NoOrderNoRepetition (cards, new StringBuffer(), X, Y, count, count);
                break;
            case 2:
                numberOfOutcomes = (int)Math.pow (X, Y);
                System.out.println("There are a total of " + numberOfOutcomes + " permutations:");
                OrderImportantRepetitionAllowed (cards, new StringBuffer(), X, Y);
                break;
            case 3:
                numberOfOutcomes = fact(X)/fact(X - Y);
                System.out.println("There are a total of " + numberOfOutcomes + " permutations:");
                OrderImportantNoRepetition (cards, new StringBuffer(), X, Y);
                break;
            case 4:
                numberOfOutcomes = fact(X + Y - 1)/(fact(X - 1) * fact(Y));
                System.out.println("There are a total of " + numberOfOutcomes + " combinations:");
                NoOrderRepetitionAllowed (cards, new StringBuffer(), X, Y);
                break;
        }
    }
}