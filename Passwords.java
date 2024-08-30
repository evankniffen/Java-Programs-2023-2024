/**
 * public class Passwords
 *  
 * Author:  Evan Kniffen
 * Date:    09/29/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns a radomized 8 character password deriving from 3 strings and containing 2 numbers. 
 */
public class Passwords
{
   public static void main(String[] args)
   {  
      String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lower = "abcdefghijklmnopqrstuvwxyz" ;
      String evan = "evankniffen";
      int random1 = (int)(Math.random() * 11);
      int random2 = (int)(Math.random() * 11);
      int random3 = (int)(Math.random() * 26);
      int random4 = (int)(Math.random() * 26);
      int random5 = (int)(Math.random() * 10);
      int random6 = (int)(Math.random() * 10);
      int random7 = (int)(Math.random() * 26);
      int random8 = (int)(Math.random() * 26);
      System.out.print(evan.substring(random1, random1 + 1) + evan.substring(random2, random2 + 1) + lower.substring(random3, random3 + 1) + lower.substring(random4, random4 + 1) + random5 + random6 + upper.substring(random7, random7 + 1) + upper.substring(random8, random8 + 1));
   }
}