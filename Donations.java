/**
 * class Donations
 *  
 * Author1:  Evan Kniffen
 * Date:     2/28/24
 * Course:   Computer Science I AP
 *  
 * Summary of file: prints a list of donors names and the dollar amount each has donated sorted in descending (most to least) order
 *   
 *   
 *
 */ 
import java.io.*;
import java.util.*;


public class Donations {
   static class Donor {
      private String name;
      private double account;
         
      public Donor(String n, double a) {
         name = n;
         account = a;
      }
      public double getAccount() {
         return this.account;
      }
      public String getName() {
         return this.name;
      }
      public void setAcount(double acc) {
         this.account = acc;
      }
      public void setName(String nm) {
         this.name = nm;
      }
      public String toString() {
         return this.getName() + " " + this.getAccount();
      }
   }
   public static void main (String [] args) throws IOException {
      Scanner f = new Scanner(new File("donors.dat"));
      ArrayList<Donor> donors = new ArrayList<>();
      while(f.hasNext()) {
         Donor d = new Donor(f.next(), f.nextDouble());
         donors.add(d);
      }
      for(int next = 0; next < donors.size() - 1; next++) {
         int max  = next;
         for(int i = next + 1; i < donors.size(); i++) {
            if(donors.get(i).getAccount() > donors.get(max).getAccount()) {
               max = i;
            }
         }
         Donor temp = donors.get(next);
         donors.set(next, donors.get(max));
         donors.set(max, temp);
      }
      for(Donor k : donors) {
         System.out.println(k);
      }
      
   }
}
