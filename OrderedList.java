/**
 * class OrderedList
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints a sorted list.
 *   
 *   
 *
 */
import java.util.*;
import java.io.*;
public class OrderedList 
{
	public static void main(String[] args) throws IOException
	{
		Scanner f = new Scanner(new File("file1.dat"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(f.hasNext())
		{
			int num = f.nextInt();
         if (list.isEmpty()) {
            list.add(num);
         } 
         else {
            boolean added = false;
            for (int i = 0; i < list.size(); i++) {
               if (num < list.get(i)) {
                  list.add(i, num);
                  added = true;
                  break;
               }
               }
            if (!added) {
               list.add(num);
            }
            }
         } 
         System.out.println(list);  
		}
		
	}
