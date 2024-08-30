import java.util.ArrayList;
import java.util.Scanner;
public class ListOfNumbers3 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<Double>();
		System.out.print("Number? ");
		numbers.add(kb.nextDouble());
		System.out.print("Number? ");
		numbers.add(kb.nextDouble());
		System.out.print("Number? ");
		numbers.add(kb.nextDouble());
		order(numbers);
		System.out.print(numbers);
	}
	
	public static ArrayList<Double> order(ArrayList<Double> list)
	{
		double min = list.get(0);
      double max = list.get(0);
      double med = list.get(0);
      
      for (Double j : list) {
         if (j > max) {
            max = j;
         }
         if (j < min) {
            min = j;
         }
         if (j < max && j > min) {
            med = j;
         }
      }
      list.set(0, min);
      list.set(1, med);
      list.set(2, max);
      
      return list; 		
	}
}

