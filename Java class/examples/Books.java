class Book {
    String title;
    int numberofpages; 

    Book(String title, int numberofpages) {
        this.title = title;
        this.numberofpages = numberofpages;
    }

    void printBook() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Number of Pages: " + this.numberofpages);
    }
}

public class Books {
    public static void main(String[] args) {
        Book b1 = new Book("Chaos", 237);
        Book b2 = new Book("Test Book", 47);

        b1.printBook();
        b2.printBook();
    }
}