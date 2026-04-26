// ---------------------------------------------------------------------------
// OBJECTS IN JAVA
// An object is an instance of a class.
// A class is a blueprint that defines attributes (fields) and behaviors (methods).
// ---------------------------------------------------------------------------

// ---- Blueprint: Car class ----
class Car {
    // Fields (attributes) — describe what a Car has
    String brand;
    String color;
    int year;
    double speed; // current speed in km/h

    // Constructor — special method that runs when an object is created
    // It has the same name as the class and no return type.
    Car(String brand, String color, int year) {
        this.brand = brand; // 'this' refers to the current object
        this.color = color;
        this.year  = year;
        this.speed = 0;     // every new car starts at rest
    }

    // Methods (behaviors) — describe what a Car can do
    void accelerate(double amount) {
        speed += amount;
        System.out.println(brand + " accelerates to " + speed + " km/h");
    }

    void brake(double amount) {
        speed = Math.max(0, speed - amount); // speed cannot go below 0
        System.out.println(brand + " slows down to " + speed + " km/h");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + " | Color: " + color
                + " | Year: " + year + " | Speed: " + speed + " km/h");
    }
}

// ---- Blueprint: Person class ----
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    void greet() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

// ---- Main class ----
public class Objects {
    public static void main(String[] args) {

        System.out.println("===== Creating and Using Objects =====\n");

        // Create objects using the 'new' keyword + constructor
        Car car1 = new Car("Toyota", "Red",   2022);
        Car car2 = new Car("Honda",  "Blue",  2020);

        // Call methods on each object
        car1.displayInfo();
        car1.accelerate(60);
        car1.accelerate(40);
        car1.brake(30);
        System.out.println();

        car2.displayInfo();
        car2.accelerate(80);
        System.out.println();

        // Access fields directly (since they are not private here)
        System.out.println("car1 brand: " + car1.brand);
        System.out.println("car2 year:  " + car2.year);

        System.out.println("\n===== Person Objects =====\n");

        Person p1 = new Person("Enoch", 20);
        Person p2 = new Person("Alice", 25);

        p1.greet();
        p2.greet();

        // Each object is independent — changing one does not affect the other
        p1.age = 21;
        System.out.println("\nAfter updating p1's age:");
        p1.greet();
        p2.greet(); // p2 is unchanged
    }
}
