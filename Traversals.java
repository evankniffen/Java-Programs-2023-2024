/**
 * Primary java class: Traversals
 *  
 * Author:  Evan Kniffen
 * Date:    03/26/2024
 * Course:  APCSA
 * Period:  1
 *  
 * Summary of file:
 *     Holds all of the 2D Array travering methods.
 *
 */
 public class Traversals {
   public static void rowMajorTraversalForEach(int[][] g) {
      if (g==null) return;
       for (int [] list : g) {
         for (int x : list) {
            System.out.printf("%3d",x);
         }
         System.out.println();
      }
   }
   public static void columnMajorTraversalNested(int[][] gr) {
      if (gr==null) return;
      for (int c = 0; c < gr[0].length; c++) {
            for (int r = 0; r < gr.length; r++) {
               System.out.print("["+r+"]["+c+"] = "+gr[r][c]+" ");
            }
            System.out.println();
         }               
   }
   public static void rowMajorTraversalNested (int[][] gri) {
      if (gri==null) return;
      for (int r = 0; r < gri.length; r++) {
         for (int c = 0; c < gri[r].length; c++) {
            System.out.print("["+r+"]["+c+"] = "+gri[r][c]+" ");
         }
         System.out.println();
      }
   }
   public static int sumCol (int col, int[][] grid) {
      int sum = 0;
      for (int r = 0; r < grid.length; r++) {
         sum += grid[r][col];
      }
      return sum;
   }
   public static double rowAvg (int row, int[][] grid) {
      double sum = 0.0;
      for(int r : grid[row]) {
         sum += r;
      }  
      return sum / grid[row].length;
   }
   public static int maxGrid (int[][] grid) {
      int max = grid[0][0];
      for (int r = 0; r < grid.length; r++) {
         for (int c = 0; c < grid[0].length; c++) {
            if (grid[r][c] > max) {
               max = grid[r][c];
            }
         }
      }
      return max;
   }
   public static boolean allEven (int[] list) {
      boolean even = true; 
      for(int i : list) {
         if(i%2!=0) {
            even = false;
         }
      }
      return even; 
   }
   public static void forAllEven (int[][] grid) {
      System.out.println("Check for all even elements");
      for(int g = 0; g < grid.length; g++) {
          boolean temp = allEven(grid[g]);
          System.out.println("Search row " + g);
          if (!temp) {
             System.out.println("At least one element is odd.");
             break;
          }
          if (temp && g == grid.length - 1) {        
            System.out.println("All elements are even.");
          }  
      }
   }
   
}