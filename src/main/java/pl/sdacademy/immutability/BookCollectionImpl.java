package pl.sdacademy.immutability;

import java.util.ArrayList;
import java.util.List;

class BookCollectionImpl implements BookCollection {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookByTitle(String title) {
        for (Book book : books)
            if (book.getTitle().equals(title)) {
                return book;
            }
        throw new RuntimeException("Nie znaleziono książki!");
    }

    @Override
    public void printAllBooks() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Book book : books) {
            stringBuilder.append(book.getTitle()).append("\t");
        }
        System.out.println(stringBuilder.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Book book : books) {
            stringBuilder.append(book.getTitle()).append("\t");
        }
        return stringBuilder.toString();
    }
}