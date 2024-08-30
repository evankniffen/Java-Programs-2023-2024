/**
 * public class AddOneTakeOne
 *  
 * Author:  Evan Kniffen
 * Date:    09/04/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Finds the average of four user-inputted doubles. 
 */
import java.util.Scanner;

public class AddOneTakeOne
{
  public static void main(String[] args)
  {
    Scanner ek = new Scanner(System.in);
    int num, numPlusOne, numMinusOne;
    System.out.print("Enter a number: ");
    num = ek.nextInt();
    num++;
    numPlusOne = num;
    num--;
    num--;
    numMinusOne = num;
    num++;   
  
    System.out.println(numMinusOne+ " "+num+" "+numPlusOne);
    
  }
}