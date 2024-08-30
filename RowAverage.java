/**
 * Primary java class: RowAverage
 *  
 * Author:  Evan Kniffen
 * Date:    03/28/2024
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     Utlizes Traversals to produce the average of all the elements in a user-inputted row.
 *
 */
 import java.util.*;
 import java.io.*;
 
 public class RowAverage {
   public static void main (String [] args) throws IOException {
      Scanner f = new Scanner(new File("2DArrInt.dat"));
      int[][] arr = new int[f.nextInt()][f.nextInt()];
      
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[0].length; c++) {
            arr[r][c] = f.nextInt();
         }
      }
      Traversals.rowMajorTraversalForEach(arr);
      System.out.println();
      Scanner kb = new Scanner(System.in);
      boolean temp = false; 
      while (!temp) {
         System.out.print("Enter a row number ==> ");
         int row = kb.nextInt();
         if(row < 0 || row >= arr.length) {
            System.out.println("Invalid row number. Try again.");
            }
         else {
            System.out.println("The average of the values in row " + row + " is " + Traversals.rowAvg(row,arr));
            temp = true;
            }
      } 
      f.close();
   }
 }