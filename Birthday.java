/**
 * Primary java class: Birthday
 *  
 * Author:  Evan Kniffen
 * Date:    10/31/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Prints the day of the week based on an user inputted day.
 *
 */
 
import java.util.Scanner;

public class Birthday
{
     public static void main (String [] args)
     {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the birth year: ");
        int year = kb.nextInt();
        System.out.print("Enter the month [1 - 12]: ");
        int month = kb.nextInt();
        System.out.print("Enter the day of the month [1 - 31]: ");
        int day = kb.nextInt();
        int total = 0;
        String yearStr = String.valueOf(year);
        Integer lastDig = Integer.valueOf(yearStr.substring(2,4));
        Integer firstDig = Integer.valueOf(yearStr.substring(0,2));
        System.out.println(lastDig);
        total += (lastDig / 4);
        System.out.println(total);
        total += lastDig;
        System.out.println(total);
        total = (total % 7);
        System.out.println(total);

        if (firstDig == 17)
           total += 4;
        else if (firstDig == 18)
           total += 2;
        else if (firstDig == 19)
           total += 0;
        else if (firstDig == 20)
           total += 6;
        
        total += day;
        System.out.println(total);

        if (month == 1)
           total += 1;
        else if (month == 2)
           total +=4;
        else if (month == 3)
           total +=4;
        else if (month == 4)
           total +=0;
        else if (month == 5)
           total +=2;
        else if (month == 6)
           total +=5;
        else if (month == 7)
           total +=0;
        else if (month == 8)
           total +=3;
        else if (month == 9)
           total +=6;
        else if (month == 10)
           total++;
        else if (month == 11)
           total +=4;
        else if (month == 12)
           total +=6;  
         System.out.println(total);  
         
        if (month == 1 || month == 2)
        {
        if (year % 4 == 0)
        {
           if (lastDig == 0)
           {
              if (year % 400 == 0)
                 total--;
              }
           else
              total--;
        }
        }
        
        System.out.println(total);
        
        int week = total % 7;
        String dow = "";
         
        if (week == 1)
           dow = "Sunday";
        else if (week == 2)
           dow = "Monday";
        else if (week == 3)
           dow = "Tuesday";
        else if (week == 4)
           dow = "Wednesday";
        else if (week == 5)
           dow = "Thursday";
        else if (week == 6)
           dow = "Friday";
        else if (week == 0)
           dow = "Saturday";
           
        System.out.println("Your birthday, "+month+"/"+day+"/"+year+" was on a "+dow+".");
            
     }
} 
  