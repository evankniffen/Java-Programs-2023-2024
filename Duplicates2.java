/**
 * class Duplicates2
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints the duplicate names in two lists.
 *   
 *   
 *
 */
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Duplicates2 {
	public static void main(String[] args) throws IOException {
		Scanner f = new Scanner(new File("names.txt"));
		ArrayList<String> names = new ArrayList<String>();
		while(f.hasNext())
			names.add(f.next());    
      for(String n : names) {
         System.out.print(n + " ");
      }
      for(int i = 0; i < names.size(); i++) {
         for(int j = i + 1; j < names.size(); j++) {
            if(names.get(i).equals(names.get(j))) {
               names.remove(j);
               j--;  
            }
         }
      }
      System.out.println();
      for(String m : names) {
         System.out.print(m + " ");
      }
	}
}

