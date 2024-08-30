/**

 * public class WrappersDelight
 *  
 * Author:  Evan Kniffen
 * Date:    09/25/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Returns a set of numbers using Integer and Double class constructors. 

 */
 public class WrappersDelight
   {
   public static void main(String [] args)
      {
      int num1 = 14;
      Integer num2 = new Integer(8);
      double num3 = 2.5;
      Double num4 = new Double(num3 + num2);
      num2 = 5;
      num3 = num2 + num1 + num4.doubleValue();
      num1 = num2 + (int)num4.doubleValue();
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(num3);
      System.out.println(num4);
      }
   }
      