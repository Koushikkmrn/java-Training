public class FindTheHighestAltitude1732 {
    public int largestAltitude(int[] gain) {
        int max = 0, cur = 0;
        for (int g : gain) {
            cur += g;
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        FindTheHighestAltitude1732 sol = new FindTheHighestAltitude1732();
        System.out.println(sol.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}
