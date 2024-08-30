/**
 * Primary java class: StringReferences
 *  
 * Author:  Evan Kniffen
 * Date:    10/13/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     tests the output of multiple boolean expressions with Strings. 
 *
 */

public class StringReferences
{
   public static void main(String [] args)
   {   
      String word = "Hello";
      String word2 = "Hello";
      String sentence = null;
      String str = "hello";
      System.out.println(word == sentence); //false
      System.out.println(sentence == null); // true
      System.out.println(word == word2); // true
      System.out.println(word == str); // false
      System.out.println(word != null); // true
   }
}
