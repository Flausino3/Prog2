import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DictReader {
    public ArrayList<String> dict;
    private String filename;

    /**
     * Create a DictReader instance from a file.
     */
    public DictReader(String filename) {
        loadDictionary(filename);
        this.filename = filename;
    }

    /**
     * Return the dictionary as a list of words.
     */
    public ArrayList<String> getDictionary() {
        return dict;
    }

    /**
     * Accept a new dictionary and save it under the same name. Use the new
     * one as our dictionary from now on.
     */
    public void save(ArrayList<String> dictionary) {
        try {
            FileWriter out = new FileWriter(filename);
            for (String word : dictionary) {
                out.write(word);
                out.write("\n");
            }
            out.close();
            dict = dictionary;
        } catch (IOException exc) {
            System.out.println("Error writing dictionary file: " + exc);
        }
    }

    /**
     * Load the dictionary from disk and store it in the 'dict' field.
     */
    private void loadDictionary(String filename) {
        dict = new ArrayList<String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String word = in.readLine();
            while (word != null) {
                dict.add(word);
                word = in.readLine();
            }
            in.close();
        } catch (IOException exc) {
            System.out.println("Error reading dictionary file: " + exc);
        }
    }
}
