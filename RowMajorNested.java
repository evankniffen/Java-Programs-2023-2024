import java.util.*;
import java.io.*;

public class RowMajorNested {
   public static void main (String [] args) throws InterruptedException{
      // This is a demo of the row-major nested for loop
      int [][] grid = {{2,6,7,4,3},
                       {9,8,5,1,0},
                       {4,8,2,3,5},
                       {2,99,5,6,4}};
      for (int r = 0; r < grid.length; r++) {
         for (int c = 0; c < grid[r].length; c++) {
            System.out.print("["+r+"]["+c+"] = "+grid[r][c]+" ");
            Thread.sleep(1000); // Will pause for one second
         }
         System.out.println();
      }               
   }
}