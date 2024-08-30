/**
 * Primary java class: TopGrade
 *  
 * Author:  Evan Kniffen
 * Date:    11/13/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       A program that allows the user to enter a list of kids and their grades; prints the top grade.
 *
 */
import java.util.Scanner;

public class TopGrade
{
   public static void main (String [] args)
   {
   Scanner kb = new Scanner(System.in); 
   System.out.print("How many students? ");
   int stuNum = kb.nextInt();
   int max = 0; 
   String winner = "";

   for(int i = 0; i < stuNum; i++)
   {
      System.out.print("Name? ");
      String name = kb.next();
      System.out.print("Grade? ");
      int grade = kb.nextInt();

      if (grade > max)
      {
         max = grade;
         winner = name; 
         }
      }
      System.out.print(winner + " " + max);
   }
}