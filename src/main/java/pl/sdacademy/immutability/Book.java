package pl.sdacademy.immutability;

import java.util.Objects;

class Book {
    private int id;
    private String title;
    private String author;
    private Price price;

    Book(int id, String title, String author, Price price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, price);
    }
}