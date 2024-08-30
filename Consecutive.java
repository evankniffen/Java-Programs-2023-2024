public class Consecutive
{
   public static void main(String[] args)
   {
      String str = "groom";
      String longest = "";
      int len = str.length()-1;
      boolean found = false;
      int count = 1; 
      int max = Integer.MIN_VALUE;
      String sub1 = "";
      String sub2 = "";
      String letter = "";
      while(!found) {
      for(int i = 0; i <= len - 2; i++) {
      // literally the only thing i changed about this code from the code
      // i submitted on the test is the "- 2" behind len in the for loop
      // boolean statement, but i got 15 pts taken off :(
         sub1 = str.substring(i, i + 1);
         sub2 = str.substring(i + 1, i + 2);
         if (sub1.equals(sub2)) {
            count++; 
            if (count > max) {
               max = count;
               letter = sub1;
            }
            }
         else  
            count = 1;
      } 
         found = true;
      }
      for (int j = 1; j <= max; j++) {
         longest += letter;
      }      
      System.out.print(longest);
   }
}