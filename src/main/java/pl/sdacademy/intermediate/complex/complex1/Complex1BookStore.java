package pl.sdacademy.intermediate.complex.complex1;

import java.util.List;

public class Complex1BookStore {

    public static void main(String[] args) {

        BookFilterCriteria bookFilterCriteria = BookFilterCriteria.builder()
                .titlePart("Potter")
                .pagesRange(new IntRange(300, 700))
                .build();

        BookStore bookStore = new BookStore();

        List<Book> foundBooks = bookStore.findBooks(bookFilterCriteria);

        foundBooks.forEach(System.out::println);


    }
}
