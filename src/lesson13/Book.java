package lesson13;

import java.util.Objects;

public class Book {


    private String name;


    private Author author;
    private int publishYear;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;

    }


    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(name, book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", " + author +
                ", publishYear=" + publishYear +
                '}';
    }
}
