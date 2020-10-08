//import necessary classes
import java.lang.Math;
import java.util.Arrays;
import java.util.Random;

/**
* This program generates 10 random numbers and determines.
* the min and max number
*
* @author  Ben Falsetto
* @version 1.0
* @since   2020-09-30
*/
public class Minmax {
  
  /**
   * This function gets the min value.
  */
  public static int getmin(int[] intArray)  {
    //declare variables
    int min = 100;
    
    //loop through each number
    for (int i = 0; i < intArray.length; i++)  {
      int val = intArray[i];
      
      //check if the current number is smaller than the
      //previous smallest
      if (val < min)  {
        min = val;
      }
    }
    //return the minimum value
    return min;
  }
  
  /**
   * This function gets the max value.
  */
  public static int getmax(int[] intArray)  {
    //declare variables
    int max = 0;
    
    //loop through each number
    for (int i = 0; i < intArray.length; i++)  {
      int val = intArray[i];
      
      //check if the current number is larger than the
      //previous largest
      if (val > max)  {
        max = val;
      }
    }
    //return the minimum value
    return max;
  }
  
  /**
   * Main section of code.
  */
  public static void main(String[] args) {
    
    //declare variables
    int[] intArray = new int[10];
    
    //generate 10 random numbers and assign to an int array
    for (int i = 0; i <= 9; i++)  {
      int randVal = (int) (1 + (Math.random() * 99));
      intArray[i] = randVal;
      System.out.print(randVal + " ");
    }
    
    //call getmin()
    int min = getmin(intArray);
    
    //call getmax()
    int max = getmax(intArray);
    
    //display the info to the user
    System.out.println("");
    System.out.println("Min number: " + min);
    System.out.println("Max number: " + max);
  }
}