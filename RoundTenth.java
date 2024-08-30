/**
 * public class RoundTenth
 *  
 * Author:  Evan Kniffen
 * Date:    09/04/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Rounds a number to the tenths place. 
 */
import java.util.Scanner;

public class RoundTenth
{
  public static void main(String[] args)
  {
    Scanner ek = new Scanner(System.in);
    double num;
    System.out.print("Decimal number? ");
    num = ek.nextDouble();
    double finalNum = (int)num + ((int)(((num-(int)num) * 10) + 0.5) / 10.0);
    System.out.println(num+" rounded to the nearest tenth is " + finalNum);
  }
}