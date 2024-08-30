/**
 * public class RoundNegatives
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

public class RoundNegatives
{
  public static void main(String[] args)
  {
    Scanner ek = new Scanner(System.in);
    double num;
    System.out.print("Enter a negative decimal number: ");
    num = ek.nextDouble();
    int roundedNum = (int)(num - 0.5);
  
    System.out.println(num+" rounded to a whole number is " + roundedNum);
    
  }
}