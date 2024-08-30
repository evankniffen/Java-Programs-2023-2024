/**
 * Primary java class: GradePoint
 *  
 * Author:  Evan Kniffen
 * Date:    11/5/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Prints the user's GPA based on 7 letter grades.
 *
 */

import java.util.Scanner;

public class GradePoint
{
     public static void main (String [] args)
     {
        Scanner kb = new Scanner(System.in);
        
        int i = 0;
        double gradeSum = 0;
        System.out.println("Enter seven letter grades (A,B,C,D or F)");

        while (true) {
            String grade = kb.next();

            if (grade.equals("A"))
               gradeSum += 4.0;
            
            else if (grade.equals("B"))
               gradeSum += 3.0;
            
            else if (grade.equals("C"))
               gradeSum += 2.0;
               
            else if (grade.equals("D"))
               gradeSum += 1.0;
               
            i++;
        }

        System.out.println("GPA = " + ((int)((((gradeSum / 7) * 100) + .5))) / 100.0);
     }
}