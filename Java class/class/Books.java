abstract class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    abstract void printBook();
}

interface Readable {
    void read();
}

interface Downloadable {
    void download();
}

class EBook extends Book implements Readable, Downloadable {
    double bookSize;

    EBook(String title, double bookSize) {
        super(title);
        this.bookSize = bookSize;
    }

    @Override
    void printBook() {
        System.out.println("Book title: " + title + ", size: " + bookSize + "kb");
    }

    @Override
    public void read() {
        System.out.println("Reading book with title: " + title);
    }

    @Override
    public void download() {
        System.out.println("Downloading book titled: " + title);
    }
}

class PhysicalBook extends Book {
    int numberOfPages;

    PhysicalBook(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    @Override
    void printBook() {
        System.out.println("Title: " + title + ", Number of pages: " + numberOfPages);
    }
}



public class Books {
    public static void main(String[] args) {
        EBook e1 = new EBook("Ebook 1", 1.9);
        PhysicalBook p1 = new PhysicalBook("Book 2", 45);

        e1.printBook();
        e1.read();
        e1.download();
        
        p1.printBook();
    }
}