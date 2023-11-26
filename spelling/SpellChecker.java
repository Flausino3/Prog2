import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class SpellChecker {
    private int numberOfWords = 0;
    DictReader dictReader = new DictReader(
            "words.txt");

    public int numberOfWords() {
        for (int i = 0; i <= dictReader.dict.size(); i++) {
            numberOfWords++;
        }
        return numberOfWords;
    }

    public boolean isKnownWord(String word) {

        for (String isKnown : dictReader.dict) {
            if (word.equals(isKnown)) {
                return true;
            }
        }
        return false;
    }

    public boolean allKnown(ArrayList<String> words) {
        int cont = 0;

        for (String aux : dictReader.dict) {
            for (String word : words) {
                if (word.equals(aux)) {
                    cont++;
                }
            }
        }
        if (cont == words.size()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> wordsStartingWith(String prefix) {

        ArrayList<String> wordsStartingWithPrefix = new ArrayList<>();
        prefix = prefix.toLowerCase();

        for (String aux : dictReader.dict) {
            if (aux.toLowerCase().startsWith(prefix)) {
                wordsStartingWithPrefix.add(aux);
            }
        }
        System.out.println("Words who starts with \"" + prefix + "\":" + wordsStartingWithPrefix);

        return wordsStartingWithPrefix;
    }

    public ArrayList<String> wordsContaining(String text) {

        ArrayList<String> wordsContainingText = new ArrayList<>();
        text = text.toLowerCase();

        for (String aux : dictReader.dict) {
            if (aux.toLowerCase().contains(text)) {
                wordsContainingText.add(aux);
            }
        }
        System.out.println("Words who contains the word \"" + text + "\":" + wordsContainingText);

        return wordsContainingText;
    }

    public void insert(String newWord) {

        boolean exist = false;

        for (String aux : dictReader.dict) {
            if (aux.equals(newWord)) {
                exist = true;
            }
        }
        if (exist == false) {
            dictReader.dict.add(newWord);
            Collections.sort(dictReader.dict);
            save(dictReader.dict);
        }
    }

    public boolean remove(String newWord) {

        boolean exist = false;

        for (String aux : dictReader.dict) {
            if (aux.equals(newWord)) {
                exist = true;
            }
        }
        if (exist == true) {
            dictReader.dict.remove(newWord);
            save(dictReader.dict);
            return true;
        }

        return false;
    }

    public void save(ArrayList<String> dictionary) {
        try {
            FileWriter out = new FileWriter("words.txt");
            for (String word : dictionary) {
                out.write(word);
                out.write("\n");
            }
            out.close();
            dictReader.dict = dictionary;
        } catch (IOException exc) {
            System.out.println("Error writing dictionary file: " + exc);
        }
    }

    public boolean isPalindrome(String word) {

        boolean exist = false;
        String palindromeTest = "";

        for (String aux : dictReader.dict) {
            if (aux.equals(word)) {
                exist = true;
            }
        }
        if (exist == true) {
            for (int i = word.length() - 1; i >= 0; i--) {
                palindromeTest = palindromeTest + word.charAt(i);
            }
            if (word.equals(palindromeTest)) {
                // System.out.println("Thats a palindrome");
                return true;
            }
        }

        return false;
    }

    public ArrayList<String> anagrams(String word) {

        ArrayList<String> anagramsList = new ArrayList<>();
        word = word.toLowerCase();
        char[] wordSplit = word.toCharArray();
        Arrays.sort(wordSplit);
        String sortedWord = new String(wordSplit);

        for (String aux : dictReader.dict) {
            char[] auxSplit = aux.toCharArray();
            Arrays.sort(auxSplit);
            String sortedAux = new String(auxSplit).toLowerCase();
            if (sortedAux.equals(sortedWord)) {
                anagramsList.add(aux);
            }
        }
        System.out.println("words that are an anagram of \"" + word + "\":" + anagramsList);

        return anagramsList;
    }

    public ArrayList<String> difference(ArrayList<String> dictionary) {

        ArrayList<String> differenceList = new ArrayList<>();

        for (String word : dictReader.dict) {
            if (!dictionary.contains(word)) {
                differenceList.add(word);
            }
        }
        for (String word : dictionary) {
            if (!dictReader.dict.contains(word)) {
                differenceList.add(word);
            }
        }
        System.out.println("words outside the intersection:" + differenceList);

        return differenceList;
    }

    public int distance(String word1, String word2) {

        if (!dictReader.dict.contains(word1) || !dictReader.dict.contains(word2)) {
            System.out.println("These words are not at the dictionary");
            return -1;
        }

        int[][] levenshteinDistance = new int[word1.length() + 1][word2.length() + 1];

        for (int i = 0; i <= word1.length(); i++) {
            levenshteinDistance[i][0] = i;
        }
        for (int j = 0; j <= word2.length(); j++) {
            levenshteinDistance[0][j] = j;
        }

        for (int i = 1; i <= word1.length(); i++) {
            for (int j = 1; j <= word2.length(); j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    levenshteinDistance[i][j] = levenshteinDistance[i - 1][j - 1];
                } else {
                    levenshteinDistance[i][j] = 1 + Math.min(
                            levenshteinDistance[i - 1][j],
                            Math.min(levenshteinDistance[i][j - 1], levenshteinDistance[i - 1][j - 1]));
                }
            }
        }
        return levenshteinDistance[word1.length()][word2.length()];
    }
}
