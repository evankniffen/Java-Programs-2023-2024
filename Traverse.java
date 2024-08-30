public class Traverse {
   public static void rowMajorTraversalForEach(int[][] g) {
       for (int [] list : g) {
         for (int x : list) {
            System.out.printf("%3d",x);
         }
         System.out.println();
      }
   }
   public static void columnMajorTraversalNested(int[][] gr) {
      for (int c = 0; c < gr[0].length; c++) {
            for (int r = 0; r < gr.length; r++) {
               System.out.print("["+r+"]["+c+"] = "+gr[r][c]+" ");
            }
            System.out.println();
         }               
   }
   public static void rowMajorTraversalNested (int[][] gri) {
      for (int r = 0; r < gri.length; r++) {
         for (int c = 0; c < gri[r].length; c++) {
            System.out.print("["+r+"]["+c+"] = "+gri[r][c]+" ");
         }
         System.out.println();
      }
   }
}