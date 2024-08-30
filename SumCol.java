/**
 * Primary java class: SumCol
 *  
 * Author:  Evan Kniffen
 * Date:    03/26/2024
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     Utlizes Traversals to produce the sum of all the elemnt in a user-inputted column.
 *
 */
import java.util.*;
import java.io.*;
public class SumCol {
   public static void main (String [] args) throws IOException {
      Scanner f = new Scanner(new File("2DArrInt.dat"));
      int[][] arr = new int[f.nextInt()][f.nextInt()];
      
      for(int r = 0; r < arr.length; r++) {
         for(int c = 0; c < arr[0].length; c++) {
            arr[r][c] = f.nextInt();
         }
      }
      Traversals.rowMajorTraversalForEach(arr);
      System.out.println();
      
      Scanner kb = new Scanner(System.in);
      boolean temp = false; 
      while (!temp) {
         System.out.print("Enter a column number ==> ");
         int col = kb.nextInt();
         if(col < 0 || col >= arr[0].length) {
            System.out.println("Invalid column number. Try again.");
            }
         else {
            System.out.println("The sum of the values in column " + col + " is " + Traversals.sumCol(col,arr));
            temp = true;
            }
      } 
   }
}