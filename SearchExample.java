import java.util.ArrayList;
import java.util.Scanner;
public class SearchExample
{
  public static void main(String[] args)
  {
    ArrayList<String> list = new ArrayList<String>();
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter a sentence: ");

     //We can use a Scanner object to store the sentence.
     //kb.nextLine() reads the entire sentence from the keyboard.

    Scanner sentence = new Scanner(kb.nextLine());

    //Now add all of the words in sentence to the ArrayList list.

    while(sentence.hasNext())
      list.add(sentence.next());

    //Prompt the user for the word to replace and its replacement.

    System.out.print("Which word would you like to replace? ");
    String target = kb.next();
    System.out.print("What is the new word? ");
    String replacement = kb.next();

    //Call the search method to find the index value of
    //the word to be replaced.

    int location = search(list,target);

    //if location is greater than -1 then the target word
    //is in the sentence and we replace it with the
    //replacement word.

    if(location >= 0)
        list.set(location, replacement);
    else    //The target word was not in the sentence.
        System.out.println(target + " is not in the sentence.");

    //Now, print the modified sentence.

    for(String s:list)
          System.out.print(s + " ");
    kb.close();
    sentence.close();
    }
public static int search(ArrayList<String> list, String target)
{
    int index = -1;
    for(int i = 0; i < list.size(); i++)
          if(list.get(i).equals(target))
         {
              index = i;
              break;
         }
    return index;
}
}