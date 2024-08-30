/**
 * public class PointsAndRectangles
 *  
 * Author:  Evan Kniffen
 * Date:    09/15/2023
 * Course:  AP CSA
 * Period:  1
 *  
 * Summary of file:
 *       Instantiates points, dimensions, and a rectangle based on user-inputted doubles. 
 */
import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Dimension;
import java.util.Scanner;
public class PointsAndRectangles
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Enter the x coordinate: ");
      int x = kb.nextInt();
      
      System.out.print("Enter the y coordinate: ");
      int y = kb.nextInt();
      
      //Instantiate a Point object p.
      System.out.print("Enter the length: ");
      int l = kb.nextInt();
      
      System.out.print("Enter the width: ");
      int w = kb.nextInt();
      
      Point p = new Point(x,y);
      Dimension d = new Dimension(l,w);
      Rectangle r = new Rectangle(p, d);
      //Instantiate a Dimension object d.
      //Instantiate a Rectangle object r.
      System.out.println(p);
      System.out.println(d);
      System.out.println(r);
   }
}
