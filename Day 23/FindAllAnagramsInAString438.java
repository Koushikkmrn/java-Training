import java.util.*;

public class FindAllAnagramsInAString438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] need = new int[26];
        int[] window = new int[26];
        for (char c : p.toCharArray()) need[c - 'a']++;
        int pLen = p.length();
        for (int i = 0; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            if (i >= pLen) window[s.charAt(i - pLen) - 'a']--;
            if (i >= pLen - 1 && Arrays.equals(need, window)) result.add(i - pLen + 1);
        }
        return result;
    }
}
