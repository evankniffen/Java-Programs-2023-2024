/**
 * class name LargestAndSmallest
 *  
 * Author1:  Evan Kniffen
 * Date:     02/21/2024
 * Course:   AP CSA
 * Period:   1
 *
 * Summary of file:
 *   Prints a list form a file.
 *   
 *
 */
import java.util.*;
import java.io.*;
public class LargestAndSmallest {
   public static void main (String [] args) throws IOException{
      Scanner f = new Scanner (new File("numbers.dat"));
      ArrayList<Integer> nums = new ArrayList<>();
      while (f.hasNext()) {
         nums.add(f.nextInt());
      }
      for (Integer d : nums) {
         System.out.print(d + " ");
      }
      System.out.println();
      System.out.println("Largest number is " + getMax(nums));
      System.out.println("Smallest number is " + getMin(nums));
      f.close();
   }
   public static int getMax(ArrayList<Integer> list) {
      int max = list.get(0);
      for (Integer i : list) {
         if (i > max) {
            max = i;
         }
      }
      return max;
   }
   public static int getMin(ArrayList<Integer> list) {
      int min = list.get(0);
      for (Integer j : list) {
         if (j < min) {
            min = j;
         }
      }
      return min;   
   }
}