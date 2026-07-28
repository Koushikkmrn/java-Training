import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> charMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (charMap.containsKey(c)) {
                if (!charMap.get(c).equals(w)) {
                    return false;
                }
            } else {
                charMap.put(c, w);
            }
            if (wordMap.containsKey(w)) {
                if (wordMap.get(w) != c) {
                    return false;
                }
            } else {
                wordMap.put(w, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern290 sol = new WordPattern290();
        System.out.println(sol.wordPattern("abba", "dog cat cat dog"));
    }
}
