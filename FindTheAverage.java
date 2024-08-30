/**
 * public class FindTheAverage
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

public class FindTheAverage
{
  public static void main(String[] args)
  {
    Scanner ek = new Scanner(System.in);

    System.out.println("Enter four values:");
    System.out.print("Value 1: ");
    double val1 = ek.nextDouble();
    System.out.print("Value 2: ");
    double val2 = ek.nextDouble();
    val1 += val2;
    System.out.print("Value 3: ");
    double val3 = ek.nextDouble();
    val1 += val3;
    System.out.print("Value 4: ");
    double val4 = ek.nextDouble(); 
    val1 += val4;
    val1 /= 4;   
  
    System.out.println("Average = " + val1);
    
  }
}