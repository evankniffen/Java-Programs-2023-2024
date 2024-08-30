/**
 * class ListOfStates
 *  
 * Author1:  Evan Kniffen
 * Date:     02/21/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints a user-inputted array based on a list of states.
 *   
 *   
 *
 */ 
 import java.util.*;
 
 public class ListOfStates {
   public static void main(String [] args) {
      Scanner kb = new Scanner(System.in);
      ArrayList<String> states = new ArrayList<String>();
      boolean control = true;
      
      System.out.print("Enter the name of a state or \"Stop\" to quit: ");
      
      while(control) {
         String state = kb.next();
         
         if (state.equals("Stop")) {
            control = false;
            System.out.println();
         }
         else {
            states.add(state);
            System.out.print("Next state or \"Stop\": ");
         }      
      }
      
      for (String i : states) {
         if (states.indexOf(i) == states.size() - 1) {
            System.out.println(i);
         }
         else {
            System.out.print(i + " -> ");
         }
      }
   }
 }