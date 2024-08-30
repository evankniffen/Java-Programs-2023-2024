/**
 * Primary java class: WorkingWithRectangles
 *  
 * Author:  Evan Kniffen
 * Date:    9/18/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Helps use rectangle methods and overloaded constructors.
 *
 */
import java.awt.Rectangle;
import java.util.Scanner;
public class WorkingWithRectangles
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Enter the width: ");
      int w = kb.nextInt();
      System.out.print("Enter the height: ");
      int h = kb.nextInt();
      Rectangle r1 = new Rectangle(w, h);
      System.out.println("Width = "+ r1.getWidth());
      System.out.println("Height = "+ r1.getHeight());
      double area = r1.getWidth() * r1.getHeight();
      System.out.println("Area = " + area);  
      Rectangle r2 = new Rectangle();
      r2.setSize(3,2);
      System.out.println("x = "+ r2.getX());
      System.out.println("y = "+ r2.getY());
      r2.setLocation(1,3);
      System.out.println("x = "+ r2.getX());
      System.out.println("y = "+ r2.getY());
      System.out.println(r2.contains(1,3));
   }
}
