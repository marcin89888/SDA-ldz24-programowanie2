package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
@Getter
class Book {

    @Builder.Default
    int amount = 3;
    @Builder.Default
    private UUID id = UUID.randomUUID();     //losowanie unikatowego identyfikatora obiektu
    private String title;
    private String author;
    private int yearPublished;
    private int numberOfPages;
    private double price;
    private Genre genre;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id.equals(book.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    BookShortInfo toBookShortInfo() {
        return BookShortInfo.builder()
                .title(this.title)
                .author(this.author)
                .yearPublished(this.yearPublished)
                .id(this.id)
                .build();
    }

}