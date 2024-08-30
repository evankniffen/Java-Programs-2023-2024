/**
 * Primary java class: ReferenceTester
 *  
 * Author:  Evan Kniffen
 * Date:    10/13/2023
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     tests the output of multiple boolean expressions.
 *
 */

public class ReferenceTester
{
   public static void main(String [] args)
   {
        String name1 = "Pat";
        String name2 = "Pat";
        String name3 = new String("Pat");
        String name4 = name1;
        
        System.out.println(name1 == name2); // false
        System.out.println(name1 == name3); // false
        System.out.println(name1 == name4); // true
    }
}