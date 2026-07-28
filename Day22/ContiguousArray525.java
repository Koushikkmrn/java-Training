import java.util.HashMap;
import java.util.Map;

public class ContiguousArray525 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        ContiguousArray525 sol = new ContiguousArray525();
        System.out.println(sol.findMaxLength(new int[]{0, 1, 0}));
    }
}
