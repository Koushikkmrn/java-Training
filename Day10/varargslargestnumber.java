package Day10;

public class varargslargestnumber {

    static int largest(int... num) {
        int max = num[0];

        for (int i : num)
            if (i > max)
                max = i;

        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest(10, 80, 40, 25));
    }
}