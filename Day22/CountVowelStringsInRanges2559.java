import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelStringsInRanges2559 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for (int i = 0; i < n; i++) {
            String w = words[i];
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);
            prefix[i + 1] = prefix[i] + ((vowels.contains(first) && vowels.contains(last)) ? 1 : 0);
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            result[i] = prefix[r + 1] - prefix[l];
        }
        return result;
    }

    public static void main(String[] args) {
        CountVowelStringsInRanges2559 sol = new CountVowelStringsInRanges2559();
        System.out.println(Arrays.toString(sol.vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}})));
    }
}
