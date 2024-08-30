/**
 * public class AverageRounded
 *  
 * Author:  Evan Kniffen
 * Date:    09/04/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Rounds a set of numbers to the nearest whole number. 
 */
import java.util.Scanner;

public class AverageRounded
{
  public static void main(String[] args)
  {
    Scanner ek = new Scanner(System.in);
    double num1, num2, num3;
    System.out.print("Number 1? ");
    num1 = ek.nextDouble();
    System.out.print("Number 2? ");
    num2 = ek.nextDouble();
    num1 += num2;
    System.out.print("Number 3? ");
    num3 = ek.nextDouble();
    num1 += num3;
    int avg = (int)((num1 / 3) + 0.5);
    System.out.print("Average = "+ avg);
    
    }
}