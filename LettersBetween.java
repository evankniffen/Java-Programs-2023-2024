/**
 * class WeekDays
 *  
 * Author1:  Evan Kniffen
 * Date:     01/30/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  translates the days of the week using loops
 *   
 *   
 *
 */
import java.util.*;
public class LettersBetween 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.print("Enter your word: ");
		String s = kb.next();
		for(int i = 0; i < s.length(); i++)
			list.add(s.substring(i, i + 1));
		System.out.print("Enter a letter: ");
		String letter = kb.next();
	   int length = lastIndexOf(list, letter) - indexOf(list, letter) - 1;

      if (length >= 0)
		   System.out.print("There are " + length + " letters between\nthe first and last occurrence of " + letter);
      else if (indexOf(list, letter) >= 0 && length < 0) {
         System.out.print(letter + " only appears one time in " + s);
      }
      else if (indexOf(list, letter) <= -1) {
         System.out.print(letter + " is not present in " + s);
      }
		kb.close();
	}
	
	public static int indexOf(ArrayList<String> list, String target)
	{
		int index = -1;
      for(int i = 0; i < list.size(); i++) {
         if (list.get(i).equals(target)) {
            index = i;
            break;
         }
      }
		return index;
	}
	
	public static int lastIndexOf(ArrayList<String> list, String target)
	{
		int index = -1;
      for(int i = 0; i < list.size(); i++) {
         if (list.get(i).equals(target)) {
            index = i;
         }
      }
		return index;
		 
	}
}
