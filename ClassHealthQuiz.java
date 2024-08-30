/**
 * public class ClassHealthQuiz
 *  
 * Author:  Evan Kniffen
 * Date:    10/27/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Assesses my Computer Science class health. 

 */
 import java.util.Scanner;

 public class ClassHealthQuiz
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
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
      if (a1.equals("yes"))
         score++;
      if (a2.equals("yes"))
         score++;
      if (a3.equals("yes"))
         score++;
      if (a4.equals("yes"))
         score++;
      if (a5.equals("yes"))
         score++;
      System.out.println("Your score is a "+score+"/5.");
      if (score > 3)
         System.out.println("You are very healthy!");
      else if (score > 1)
         System.out.println("You could be healthier!");
      else
         System.out.println("You are very unhealthy!");
      }
   }