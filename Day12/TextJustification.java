package Day12;

public class TextJustification {

    public static void main(String[] args) {

        String[] words = {
                "This","is","Java","Programming"
        };

        int width = 20;

        StringBuilder line = new StringBuilder();

        for (String word : words) {

            if (line.length() + word.length() + 1 > width) {

                System.out.println(line);

                line = new StringBuilder();
            }

            if (line.length() != 0)
                line.append(" ");

            line.append(word);
        }

        if (line.length() > 0)
            System.out.println(line);
    }
}