package Day7;

class Book {

    String title = "Java";

    Book() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        Book b = new Book();
        System.out.println(b.title);
    }
}