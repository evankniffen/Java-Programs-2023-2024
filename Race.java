import java.util.Scanner;
public class Race 
{
	private static Scanner kb = new Scanner(System.in);
	private static DotRacer [] racers;
   static int racerCount;
	
	public static void main(String[] args) 
	{
		System.out.println("Let's see who has the fastest DotRacer!\n");
      System.out.println("How many racers in today's race?");
		racerCount = kb.nextInt();
      racers = new DotRacer[racerCount];
      System.out.println("Enter the name of each of the racers: ");
      for (int i = 0; i < racerCount; i++) {
         racers[i] = makeRacer();
      }
		System.out.println("\nHow many moves in today's race?");
		int moves = kb.nextInt();
		race(moves);
		printRaceResults();
	}
	
	public static DotRacer makeRacer()
	{
		System.out.print("Racer name? ");
      String name = kb.next();
		DotRacer racer = new DotRacer(name); 
		return racer;
	}
	
	public static void race(int moves)
	{
		for(int x = 0; x < moves; x++)
		{
         for (DotRacer r : racers) {
            r.move();
         }  
		}
	}
	
	public static void printRaceResults()
	{
		String winner = racers[0].getName();
      int max = racers[0].getPosition();
      for (DotRacer x : racers) {
         System.out.println(x.getName() + " is at position: " + x.getPosition());
            if (x.getPosition() > max) {
               max = x.getPosition();
               winner = x.getName();
            }
      } 
		System.out.println("\nThe winner is " + winner + "!");
	}
}
