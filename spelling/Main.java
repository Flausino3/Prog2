import java.util.*;

public class Main {
    public static void main(String[] args) {

        SpellChecker spellChecker = new SpellChecker();
        // DictReader dic = new DictReader("teste.txt");

        System.out.println("Number of words:"+ spellChecker.numberOfWords()); // testing method numberOfWords
        System.out.println("isKnownWord 'a': "+ spellChecker.isKnownWord("a")); // testing method isKnownWord -->true
        System.out.println("isKnownWord 'adfsf': "+ spellChecker.isKnownWord("adfsf")); // testing method isKnownWord -->false

        ArrayList<String> foundListOfWords = new ArrayList<>(); 
        List<String> checkTheseWords = Arrays.asList("a", "aalii", "aardwolf"); //creating a list of words to check if they are in the dictionary
        foundListOfWords.addAll(checkTheseWords); // adding the list of words in foundListOfWords ArrayList
        boolean result = spellChecker.allKnown(foundListOfWords); // assigning boolean variable to return whether all words in the list are present in the dictionary
        System.out.println(result); // printing the result

        spellChecker.wordsStartingWith("aj"); 
        
        spellChecker.wordsContaining("jae");

        // spellChecker.insert("TestintThis");

        // spellChecker.remove("TestingThis");

        spellChecker.isPalindrome("arara");
        
        spellChecker.anagrams("married");

        // spellChecker.difference();

        int distance = spellChecker.distance("eqfjjfiq", "aa");
        System.out.println(distance);
        
    }
}
