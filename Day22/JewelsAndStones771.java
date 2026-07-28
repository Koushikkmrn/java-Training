import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (char c : stones.toCharArray()) {
            if (set.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones771 sol = new JewelsAndStones771();
        System.out.println(sol.numJewelsInStones("aA", "aAAbbbb"));
    }
}
