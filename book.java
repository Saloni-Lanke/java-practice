class Book {

    String title;
    String author;

    Book(String title, String author) {

        this.title = title;
        this.author = author;

    }

    void display() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);

    }

}

public class BookExample {

    public static void main(String[] args) {

        Book b = new Book("Java Basics", "James");

        b.display();

    }

}
