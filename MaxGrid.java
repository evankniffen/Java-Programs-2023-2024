/**
 * Primary java class: MaxGrid
 *  
 * Author:  Evan Kniffen
 * Date:    03/28/2024
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     Utlizes Traversals to find the max of all the elements in a user-inputted grid.
 *
 */
 import java.util.*;
 import java.io.*;
 
 public class MaxGrid {
   public static void main (String [] args) throws IOException {
      Scanner f = new Scanner(new File("2DArrIntB.dat"));
      int[][] arr = new int[f.nextInt()][f.nextInt()];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[0].length; c++) {
            arr[r][c] = f.nextInt();
         }
      }
      Traversals.rowMajorTraversalForEach(arr);
      System.out.println("The maximum value is " + Traversals.maxGrid(arr));
      
      f.close();
   }
 }