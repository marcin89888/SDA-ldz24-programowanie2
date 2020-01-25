package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
class BookShortInfo {

    private String title;
    private String author;
    private int yearPublished;
    private UUID id;


}
