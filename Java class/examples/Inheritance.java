// ---------------------------------------------------------------------------
// INHERITANCE
// Inheritance lets a child class (subclass) acquire the fields and methods
// of a parent class (superclass). This promotes code reuse.
//
// Keyword: 'extends'
// A child class can:
//   • Use all non-private members from the parent
//   • Add its own new fields and methods
//   • Override parent methods to change behaviour
// ---------------------------------------------------------------------------

// ---- PARENT class ----
class Animal {
    String name;
    int    age;

    Animal(String name, int age) {
        this.name = name;
        this.age  = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }

    void displayInfo() {
        System.out.println("Name: " + name + " | Age: " + age + " years");
    }
}

// ---- CHILD class 1: Dog extends Animal ----
class Dog extends Animal {

    String breed; // extra field unique to Dog

    Dog(String name, int age, String breed) {
        super(name, age); // calls the Animal constructor — must be first line
        this.breed = breed;
    }

    // New method added by Dog
    void fetch() {
        System.out.println(name + " fetches the ball!");
    }

    // Override the parent's displayInfo() to add breed
    @Override
    void displayInfo() {
        super.displayInfo();                          // call parent version first
        System.out.println("Breed: " + breed);       // then add Dog-specific info
    }
}

// ---- CHILD class 2: Cat extends Animal ----
class Cat extends Animal {

    boolean isIndoor;

    Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    void purr() {
        System.out.println(name + " purrs contentedly.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor cat: " + isIndoor);
    }
}

// ---- GRANDCHILD class: GoldenRetriever extends Dog ----
// Inheritance can go multiple levels deep
class GoldenRetriever extends Dog {

    GoldenRetriever(String name, int age) {
        super(name, age, "Golden Retriever");
    }

    void guide() {
        System.out.println(name + " is guiding its owner safely.");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        System.out.println("===== Parent: Animal =====\n");
        Animal genericAnimal = new Animal("Generic Animal", 3);
        genericAnimal.displayInfo();
        genericAnimal.eat();
        genericAnimal.sleep();

        System.out.println("\n===== Child: Dog =====\n");
        Dog dog = new Dog("Rex", 4, "German Shepherd");
        dog.displayInfo();   // overridden version
        dog.eat();           // inherited from Animal
        dog.sleep();         // inherited from Animal
        dog.fetch();         // Dog's own method

        System.out.println("\n===== Child: Cat =====\n");
        Cat cat = new Cat("Whiskers", 2, true);
        cat.displayInfo();
        cat.eat();
        cat.purr();

        System.out.println("\n===== Grandchild: GoldenRetriever =====\n");
        GoldenRetriever buddy = new GoldenRetriever("Buddy", 5);
        buddy.displayInfo(); // uses Dog's displayInfo (which uses Animal's)
        buddy.eat();         // from Animal
        buddy.fetch();       // from Dog
        buddy.guide();       // own method

        // A child object can be treated as its parent type (IS-A relationship)
        System.out.println("\n===== IS-A Relationship =====\n");
        Animal a = new Dog("Fido", 3, "Labrador"); // Dog IS-A Animal
        a.displayInfo();
        a.eat();
        // a.fetch(); // compile error — Animal reference doesn't know about fetch()
    }
}
