/**
 * Primary java class: ForAllEvens
 *  
 * Author:  Evan Kniffen
 * Date:    03/28/2024
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     Utlizes Traversals to find if all the elements in a user-inputted grid are even.
 *
 */
 import java.util.*;
 import java.io.*;
 
 public class ForAllEvens {
   public static void main (String [] args) throws IOException {
      Scanner f = new Scanner(new File("2DArrIntC.dat"));
      int[][] arr = new int[f.nextInt()][f.nextInt()];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[0].length; c++) {
            arr[r][c] = f.nextInt();
         } 
      }
      Traversals.rowMajorTraversalForEach(arr);
      Traversals.forAllEven(arr); 
   }
}