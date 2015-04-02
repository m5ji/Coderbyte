package Coderbyte;
import java.util.*; 
import java.io.*;

/*
 Using the Java language, 
 have the function OverlappingRectangles(strArr) 
 read the strArr parameter being passed which will represent two rectangles 
 on a Cartesian coordinate plane and will contain 8 coordinates 
 with the first 4 making up rectangle 1 and the last 4 making up rectangle 2. 
 It will be in the following format: 
 ["(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"] 
 Your program should determine the area of the space where the two rectangles overlap, 
 and then output the number of times this overlapping region can fit into 
 the first rectangle. 
 */

class Function_twentythree {  
	int x1_1 = 0;
	int x1_2 = 0;
	int y1_1 = 0;
	int y1_2 = 0;
	int x2_1 = 0;
	int y2_1 = 0;
	String[] strarr;
	boolean assigned = false;
	int num = 0;
	int area1 = 0;
	int tmp = 0;
	int index_x = 1;
	int index_y = 3;
  int MultipleBrackets(String str) { 
	  str = str.substring(2, str.lastIndexOf(")") + 1);
	  strarr = str.split("\\),");
	  for(int i = 0; i < 4; i++)
	  {
		  //Check if it's negative
		  if(Character.getNumericValue(strarr[i].toCharArray()[1]) == -1)
			  index_x = 2;
		  if(Character.getNumericValue(strarr[i].toCharArray()[3]) == -1)
			  index_y = 4;
		  
		  //first x & y values
		  if(assigned == false)
		  {
			  if(index_x == 2)
				  x1_1 = -Character.getNumericValue(strarr[i].toCharArray()[index_x]);
			  else
				  x1_1 = Character.getNumericValue(strarr[i].toCharArray()[index_x]);
			  if(index_y == 4)
				  y1_1 = -Character.getNumericValue(strarr[i].toCharArray()[index_y]);
			  else
				  y1_1 = Character.getNumericValue(strarr[i].toCharArray()[index_y]);
			  
			  assigned = true;
		  }
		  
		  //second x value
		  else if(x1_1 != Character.getNumericValue(strarr[i].toCharArray()[index_x]) 
				  && assigned == true)
		  {
			  if(index_x == 2)
				  x1_2 = -Character.getNumericValue(strarr[i].toCharArray()[index_x]);
			  else
				  x1_2 = Character.getNumericValue(strarr[i].toCharArray()[index_x]);
		  }
		  
		  //second y value
		  else if(y1_1 != Character.getNumericValue(strarr[i].toCharArray()[index_y]) 
				  && assigned == true)
		  {
			  if(index_y == 4)
				  y1_2 = -Character.getNumericValue(strarr[i].toCharArray()[index_y]);
			  else
				  y1_2 = Character.getNumericValue(strarr[i].toCharArray()[index_y]);
		  }
		  
		  index_x = 1;
		  index_y = 3;
	  }
	  
	  //switch
	  if(x1_2 < x1_1)
	  {
		  tmp = x1_1;
		  x1_1 = x1_2;
		  x1_2 = tmp;
	  }
	  if(y1_2 < y1_1)
	  {
		  tmp = y1_1;
		  y1_1 = y1_2;
		  y1_2 = tmp;
	  }
	  
	  area1 = (x1_2 - x1_1) * (y1_2 - y1_1);
	  
	  for(int j = 4; j < strarr.length; j++)
	  {
		  //Check if it's negative
		  if(Character.getNumericValue(strarr[j].toCharArray()[1]) == -1)
			  index_x = 2;
		  else if(Character.getNumericValue(strarr[j].toCharArray()[3]) == -1)
			  index_y = 4;
		  
		  //x axis
		  if(index_x == 2)
		  {
			  if(x1_2 > -Character.getNumericValue(strarr[j].toCharArray()[index_x])
					  && x1_1 <= -Character.getNumericValue(strarr[j].toCharArray()[index_x]))
			  {
				  x2_1 = -Character.getNumericValue(strarr[j].toCharArray()[index_x]);
			  }
		  }
		  else
			  if(x1_2 > Character.getNumericValue(strarr[j].toCharArray()[index_x])
					  && x1_1 <= Character.getNumericValue(strarr[j].toCharArray()[index_x]))
			  {
				  x2_1 = Character.getNumericValue(strarr[j].toCharArray()[index_x]);
			  }
		  
		  //y axis
		  if(index_y == 4)
		  {
			  if(y1_2 > -Character.getNumericValue(strarr[j].toCharArray()[index_y])
					  && y1_1 <= -Character.getNumericValue(strarr[j].toCharArray()[index_y]))
			  {
				  y2_1 = -Character.getNumericValue(strarr[j].toCharArray()[index_y]);
			  }
		  }
		  else
			  if(y1_2 > Character.getNumericValue(strarr[j].toCharArray()[index_y])
					  && y1_1 <= Character.getNumericValue(strarr[j].toCharArray()[index_y]))
			  {
				  y2_1 = Character.getNumericValue(strarr[j].toCharArray()[index_y]);
			  }
		  
		  index_x = 1;
		  index_y = 3;
	  }
	  
	  num = area1 / ((x1_2 - x2_1) * (y1_2 - y2_1));
    return num;
    
  } 
  
  public static void main (String[] args) {  
	//input format example: ["(0,0),(2,2),(2,0),(0,2),(1,0),(1,2),(6,0),(6,2)"]
    Scanner  s = new Scanner(System.in);
    Function_twentythree c = new Function_twentythree();
    System.out.print(c.MultipleBrackets(s.nextLine())); 
  }   
  
}