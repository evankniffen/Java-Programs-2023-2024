/**
 * public class Names
 *  
 * Author:  Evan Kniffen
 * Date:    09/25/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns a set of substrings based on two given names. 

 */
 import java.util.Scanner;

 public class Names
   {
   public static void main(String [] args)
      {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter first name ==>");
      String first = kb.next();
      System.out.print("Enter last name ==>");
      String last = new String(kb.next());
      System.out.println(first+" "+last);
      System.out.println(first.length() +last.length());
      System.out.println(first.substring(0,1) + last.substring(0,1));
      System.out.println(first.compareTo(last));
      System.out.println(last.indexOf(first.charAt(first.length() - 1)));
      System.out.println(first.indexOf(last.charAt(last.length() - 1)));
      int mid1 = first.length() / 2;
      int mid2 = last.length() / 2;
      System.out.print(first.substring(0,mid1) + last.substring(mid2));
      System.out.println(" "+ last.substring(0,mid2) + first.substring(mid1));
        
      }
   }
