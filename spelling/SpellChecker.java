import java.util.*;

public class SpellChecker {
    private int numberOfWords = 0;
    DictReader dictReader = new DictReader("C:\\Users\\paulo\\OneDrive\\Área de Trabalho\\hh\\Prog2\\spelling\\words.txt");

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

        for (String test : dictReader.dict) {
            for (String word : words) {
                if (word.equals(test)) {
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
}
