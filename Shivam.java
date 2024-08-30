import java.io.*;
import java.util.*;

public class Shivam {
   public static void main (String [] args) throws IOException{
      Scanner f = new Scanner(new File("shivam.dat"));
      int fnum = f.nextInt();
      f.nextLine();
      ArrayList<String> list = new ArrayList<String>();
      while(f.hasNextLine()) {
         list.add(f.nextLine()); 
      }
      System.out.println(list);
      for (int i = 0; i < fnum; i++) {
         String s = list.get(i);
         int a,b,c;
         if(s.substring(5,6).equals("x")) {
            a=1;
         }
         else {
            char ex = 'x';
            int indexOfX = s.indexOf(ex,5);
            a=Integer.parseInt(s.substring(5,indexOfX));
         }
         String bstr;
         if(s.substring(s.length()-1).equals("x")) {
            c=0;
            System.out.print("c at index " + i + " is 0");
            if(s.substring(s.length() - 2).equals("^2")) {
               b=0;
               System.out.print("b at index " + i + " is 0");
            }
            else { 
               bstr = s.substring(s.length() - 5);
            }
         }
      }
      f.close();
   }
}