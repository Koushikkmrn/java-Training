package Day12;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Programming";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        System.out.println(sb);
    }
}