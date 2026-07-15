public class SubarraySumsDivisibleByK974 {
    public int subarraysDivByK(int[] nums, int k) {
        int[] count = new int[k];
        count[0] = 1;
        int sum = 0, result = 0;
        for (int num : nums) {
            sum += num;
            int mod = ((sum % k) + k) % k;
            result += count[mod];
            count[mod]++;
        }
        return result;
    }

    public static void main(String[] args) {
        SubarraySumsDivisibleByK974 sol = new SubarraySumsDivisibleByK974();
        System.out.println(sol.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }
}
