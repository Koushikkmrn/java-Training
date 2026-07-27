package Day12;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        System.out.println("Append : " + sb);

        sb.insert(4, " Core");
        System.out.println("Insert : " + sb);

        sb.replace(0, 4, "Advanced");
        System.out.println("Replace : " + sb);

        sb.delete(9, 14);
        System.out.println("Delete : " + sb);

        sb.reverse();
        System.out.println("Reverse : " + sb);
    }
}