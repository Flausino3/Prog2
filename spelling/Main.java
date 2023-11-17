import java.util.*;

public class Main {
    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker();

        System.out.println("Number of words:"+ spellChecker.numberOfWords()); // testing method numberOfWords
        System.out.println("isKnownWord 'a': "+ spellChecker.isKnownWord("a")); // testing method isKnownWord -->true
        System.out.println("isKnownWord 'adfsf': "+ spellChecker.isKnownWord("adfsf")); // testing method isKnownWord -->false

        ArrayList<String> foundListOfWords = new ArrayList<>(); // creating arrayList for receive one list of words to check
        List<String> checkTheseWords = Arrays.asList("a", "aalii", "aardwolf"); //creating a list of words to check if they are in the dictionary
        foundListOfWords.addAll(checkTheseWords); // adding the list of words in foundListOfWords ArrayList

        boolean result = spellChecker.allKnown(foundListOfWords);
        System.out.println(result);
        
    }
}
