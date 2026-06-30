
public class Strings {
    public static void main(String[] args) {
        String name = "Chittu Kumar";

        // Length of string
        System.out.println("Length: " + name.length());

        // Upper case and lower case
        System.out.println("Upper case: " + name.toUpperCase());
        System.out.println("Lower case: " + name.toLowerCase());

        // Accessing a character
        System.out.println("First character: " + name.charAt(0));

        // Substring
        System.out.println("Substring: " + name.substring(0, 6));

        // Checking if string contains a word
        System.out.println("Contains 'Kumar': " + name.contains("Kumar"));

        // Concatenation
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        // Comparing strings
        String a = "Java";
        String b = "java";
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(b): " + a.equalsIgnoreCase(b));
    }
}
