package pl.sdacademy.immutability;

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
}