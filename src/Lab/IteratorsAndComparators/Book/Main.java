package Lab.IteratorsAndComparators.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        for (Book book : books) {
            System.out.println(book.getTitle() /* ", " + book.getYear()+", " + book.getAuthors()*/);
        }
        int[] n = {3, 2, 3, 4, 5, 6, 7, 8, 23};

        books.stream().filter(e -> e.getYear() >= 2002 || e.getTitle().equals("Animal Farm")).forEach(System.out::println);
    }
}
