package pl.sdacademy.immutability;

interface BookCollection {
    void addBook(Book book);

    Book findBookByTitle(String title);

    void printAllBooks();
}