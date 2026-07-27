package Day12;
public class CompareStrings {

    public static void main(String[] args) {

        String s = "Java";

        StringBuffer sb1 = new StringBuffer("Java");

        StringBuilder sb2 = new StringBuilder("Java");

        s = s + " Programming";

        sb1.append(" Programming");

        sb2.append(" Programming");

        System.out.println(s);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
