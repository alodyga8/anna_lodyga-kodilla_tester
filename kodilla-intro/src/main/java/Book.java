public class Book {

    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }

    public static void main(String[] args) {
    Book book = Book.of("Henryk Sienkiewicz", "W pustyni i w puszczy");
        System.out.println("Author: " + book.author + ", Title: " + book.title);
    }
}