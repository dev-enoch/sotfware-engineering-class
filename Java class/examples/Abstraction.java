// ---------------------------------------------------------------------------
// ABSTRACTION
// Abstraction means hiding complex implementation details and showing only
// the essential features to the user.
//
// "What it does" is visible; "how it does it" is hidden.
//
// Java provides two mechanisms for abstraction:
//   1. ABSTRACT CLASSES  — use keyword 'abstract'; can have abstract AND
//                           concrete methods; supports partial implementation.
//   2. INTERFACES        — use keyword 'interface'; all methods are implicitly
//                           abstract (before Java 8); a class can implement
//                           MULTIPLE interfaces (solves multiple inheritance).
// ---------------------------------------------------------------------------

// ===== 1. ABSTRACT CLASS EXAMPLE =====

// Cannot be instantiated directly — it is just a blueprint
abstract class Vehicle {
    String brand;
    int    year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year  = year;
    }

    // Abstract method — no body here; every subclass MUST provide one
    abstract void startEngine();

    // Concrete method — shared by all vehicles, no need to override
    void displayInfo() {
        System.out.println("Brand: " + brand + " | Year: " + year);
    }

    void stopEngine() {
        System.out.println(brand + "'s engine has stopped.");
    }
}

class ElectricCar extends Vehicle {

    int batteryPercent;

    ElectricCar(String brand, int year, int batteryPercent) {
        super(brand, year);
        this.batteryPercent = batteryPercent;
    }

    @Override
    void startEngine() {
        // EVs have no combustion engine — this shows HOW this specific car starts
        System.out.println(brand + " hums silently. (Battery: " + batteryPercent + "%)");
    }
}

class DieselTruck extends Vehicle {

    int horsePower;

    DieselTruck(String brand, int year, int horsePower) {
        super(brand, year);
        this.horsePower = horsePower;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " roars to life! (" + horsePower + " HP diesel engine)");
    }
}

// ===== 2. INTERFACE EXAMPLE =====

// An interface is a 100% abstract contract
interface Printable {
    void print(); // implicitly public and abstract
}

interface Saveable {
    void save(String filename);
}

// A class can implement MULTIPLE interfaces
class Document implements Printable, Saveable {

    String title;
    String content;

    Document(String title, String content) {
        this.title   = title;
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("--- Printing Document ---");
        System.out.println("Title:   " + title);
        System.out.println("Content: " + content);
        System.out.println("-------------------------");
    }

    @Override
    public void save(String filename) {
        System.out.println("Document \"" + title + "\" saved as " + filename);
    }
}

// Another class implementing Printable differently
class Photo implements Printable {

    String fileName;
    String resolution;

    Photo(String fileName, String resolution) {
        this.fileName   = fileName;
        this.resolution = resolution;
    }

    @Override
    public void print() {
        System.out.println("Printing photo: " + fileName + " at " + resolution);
    }
}

// ===== MAIN =====
public class Abstraction {
    public static void main(String[] args) {

        // --- Abstract class ---
        System.out.println("===== Abstract Class: Vehicle =====\n");

        // Vehicle v = new Vehicle(...); // COMPILE ERROR — cannot instantiate abstract class!

        Vehicle ev    = new ElectricCar("Tesla",   2023, 87);
        Vehicle truck = new DieselTruck("Volvo",   2021, 400);

        ev.displayInfo();
        ev.startEngine(); // calls ElectricCar's version
        ev.stopEngine();
        System.out.println();

        truck.displayInfo();
        truck.startEngine(); // calls DieselTruck's version
        truck.stopEngine();

        // --- Interfaces ---
        System.out.println("\n===== Interface: Printable & Saveable =====\n");

        Document doc = new Document("Java Notes", "Abstraction hides details.");
        doc.print();
        doc.save("java_notes.txt");

        System.out.println();
        Photo photo = new Photo("sunset.jpg", "4K");
        photo.print();

        // Interface as a reference type (similar to abstract class polymorphism)
        System.out.println("\n===== Interface as Reference Type =====\n");

        Printable[] printables = { doc, photo };
        for (Printable p : printables) {
            p.print(); // each object prints in its own way
            System.out.println();
        }
    }
}
