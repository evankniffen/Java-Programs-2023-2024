/**
 * class AddVowels
 *  
 * Author1:  Evan Kniffen
 * Date:     02/26/2024
 * Course:   AP CSA
 * Period:   1
 *  
 * Summary of file:  Prints a word with doubled vowels.
 *   
 *   
 *
 */
import java.util.*;
import java.io.*;

public class AddVowels {
   public static void main (String [] args) {
      Scanner kb = new Scanner(System.in);
      ArrayList<String> text = new ArrayList<String>();
      System.out.print("Enter a word: ");
      String word = kb.next();
      
      for(int i = 0; i < word.length(); i++) {
         text.add(word.substring(i,i+1));
      }
      ArrayList<String> vowels = new ArrayList<String>();
      vowels.add("a"); vowels.add("e"); vowels.add("i");
      vowels.add("o"); vowels.add("u");
      
      for(int j = 0; j < text.size(); j++) {
         for(String v : vowels) {
            if(text.get(j).equals(v)) {
               text.add(j, v);
               j++;
            }
         }
      }

      for(String s : text) {
         System.out.print(s);
      }
   }
}