import java.util.*;
import java.io.*;

public class FileCheck {
   public static void main (String [] args) throws IOException{
      Scanner f1 = new Scanner(new File("time1.txt"));
      Scanner f2 = new Scanner(new File("time2.txt"));
      ArrayList<String> file1 = new ArrayList<String>();
      ArrayList<String> file2 = new ArrayList<String>();
      
      while (f1.hasNext())
         file1.add(f1.next());
      while (f2.hasNext()) 
         file2.add(f2.next());
         
      if(file1.size() != file2.size()) 
         System.out.print("The files do not match.");
      
      else {
         for(int i = 0; i < file1.size(); i++) {
            if(!file1.get(i).equals(file2.get(i))) {
               System.out.print("The files do not match.");
               return;
            }
         }
         System.out.print("The files are an exact match.");
      } 
      f1.close();
      f2.close(); 
   }
}