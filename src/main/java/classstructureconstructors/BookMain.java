package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("John Doe","Something");
        book.register("1999");

        System.out.println(book.getAuthor() + ": " + book.getTitle() +" "+ book.getRegNumber());
    }
}
