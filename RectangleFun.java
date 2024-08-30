/**
 * public class RectangleFun
 *  
 * Author:  Evan Kniffen
 * Date:    09/15/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *      Finds the perimeter and new location of a rectangle using methods. 
 *
 */
import java.awt.Rectangle;
import java.util.Scanner;
public class RectangleFun
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("Width: ");
      int w = kb.nextInt();
      System.out.print("Height: ");
      int h = kb.nextInt();
      System.out.print("X: ");
      int x = kb.nextInt();
      System.out.print("Y: ");
      int y = kb.nextInt();
      
      Rectangle rect = new Rectangle(x,y,w,h);
      
      int perimeter = 2 * (w + h);
      System.out.println("Perimeter = " +perimeter);
      double x1 = rect.getX() - 4.0;
      double y1 = rect.getY() + 2.0;
      rect.setLocation((int)x1, (int)y1);
      System.out.print("New location is ("+rect.getX()+", "+ rect.getY()+")"); 
      // Move the rectangle 2 units up and 4 units to the left using a
      // Rectangle class method.
      // Print the new location.
   }
}
