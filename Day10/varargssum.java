package Day10;

public class varargssum {

    static int sum(int... num) {
        int total = 0;

        for (int i : num)
            total += i;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }
}