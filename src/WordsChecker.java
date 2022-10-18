import java.util.HashSet;
import java.util.Set;

public class WordsChecker{
    protected String text;
    public Set<String> wordSet;

    public WordsChecker(String text) {
        this.text = text;
        wordSet = new HashSet<>();
        String [] parts = this.text.split("\\P{IsAlphabetic}+");
        for (String part : parts) {
            wordSet.add(part);
        }
    }


    public boolean hasWord(String word){
        boolean result = wordSet.contains(word);
        if (result) {
            return true;
        }
        return false;
    }
}
