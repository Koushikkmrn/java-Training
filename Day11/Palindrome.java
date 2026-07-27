package Day11;
public class Palindrome {

    public static void main(String[] args) {

        String str = "madam";

        int left = 0;
        int right = str.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}