/**
 * class ListOfRectangles
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints the average value of a set of areas, given by length and width.
 *   
 *   
 *
 */ 
import java.io.*;
import java.util.*;

public class ListOfRectangles {
   public static void main (String [] args) throws IOException {
          Scanner f = new Scanner(new File("rectangle.dat"));
          ArrayList<Rectangle> rects = new ArrayList<>();
          
          while(f.hasNext()) {
             Rectangle rect = new Rectangle(f.nextDouble(),f.nextDouble());
             rects.add(rect);
          }
          double totArea = 0.0;
          int i = 0;
          while (i < rects.size()) {
             totArea += rects.get(i).area();
             i++;
          }
          System.out.println("\nAverage area = " + ((int) ((totArea / (rects.size())) * 100 + .5)) / 100.0);
          f.close();
       }
 }  