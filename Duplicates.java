/**
 * class Duplicates
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints the duplicate values in two lists.
 *   
 *   
 *
 */
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Duplicates {
	public static void main(String[] args) throws IOException {
		Scanner f1 = new Scanner(new File("file1.dat"));
		Scanner f2 = new Scanner(new File("file2.dat"));
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while(f1.hasNext())
			list1.add(f1.nextInt());
		while(f2.hasNext())
			list2.add(f2.nextInt());
		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.println("Duplicates: " + duplicates(list1,list2));
		f1.close();
		f2.close();
	}
	
	public static ArrayList<Integer> duplicates(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		ArrayList<Integer> dupes = new ArrayList<>();
      for (Integer i : list1) {
         for (Integer j : list2) {
            if (i.equals(j)) {
               dupes.add(i);
            }
         }
      }
      return dupes;
	}

}

