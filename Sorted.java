import java.util.*;
public class Sorted 
{
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter 8 whole numbers: ");
		for(int x = 0; x <= 7; x++)
			list.add(kb.nextInt());
		if(isSorted(list))
			System.out.print("Sorted");
		else
			System.out.print("Not Sorted");
	}
	
	public static boolean isSorted(ArrayList<Integer> list)
	{
      boolean sort = true;
		for(int next = 0; next < list.size() - 1; next++) {
         int smallest = next;
         for(int i = next + 1; i < list.size(); i++) {
            if(list.get(i) < list.get(smallest)) {
               sort = false;
               break;
            }              
         }  
      } 
      return sort;
	}
}

