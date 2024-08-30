/**
 * public class ClassHealthQuizRevisited
 *  
 * Author:  Evan Kniffen
 * Date:    10/29/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Assesses my Computer Science class health. 

 */
 import java.util.Scanner;

 public class ClassHealthQuizRevisited
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = kb.next();
      String lastName = kb.next();
      System.out.println("For each of the following questions, enter y or n.");
      System.out.print("Do you sleep 8 hours a day? ");
      String a1 = kb.next();
      System.out.print("Do you exercise daily? ");
      String a2 = kb.next();
      System.out.print("Do you eat three meals a day? ");
      String a3 = kb.next();
      System.out.print("Do you shower daily? ");
      String a4 = kb.next();
      System.out.print("Do you feel well right now? ");
      String a5 = kb.next();
      int score = 0;
      if (a1.equals("y"))
         score++;
      if (a2.equals("y"))
         score++;
      if (a3.equals("y"))
         score++;
      if (a4.equals("y"))
         score++;
      if (a5.equals("y"))
         score++;
      System.out.println(name+" "+lastName+", your score is a "+score+".");
      if (score > 3)
         System.out.println("You are very healthy!");
      else if (score > 1)
         System.out.println("You could be healthier!");
      else
         System.out.println("You are very unhealthy!");
      }
   }