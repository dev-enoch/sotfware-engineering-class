// ---------------------------------------------------------------------------
// POLYMORPHISM
// "Poly" = many, "morph" = form.
// Polymorphism means one thing can take many forms.
//
// Java supports two types:
//   1. COMPILE-TIME polymorphism → Method OVERLOADING
//      Same method name, different parameters (resolved at compile time)
//
//   2. RUNTIME polymorphism     → Method OVERRIDING
//      Child class redefines a parent method (resolved at runtime)
// ---------------------------------------------------------------------------

// ---- Base class for runtime polymorphism ----
class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // This method will be overridden by each subclass
    double area() {
        return 0;
    }

    void describe() {
        System.out.println(color + " shape with area = " + area());
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void describe() {
        System.out.printf("Circle   | color=%-6s radius=%.1f  area=%.2f%n",
                color, radius, area());
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(String color, double width, double height) {
        super(color);
        this.width  = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    void describe() {
        System.out.printf("Rectangle| color=%-6s w=%.1f h=%.1f  area=%.2f%n",
                color, width, height, area());
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(String color, double base, double height) {
        super(color);
        this.base   = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    void describe() {
        System.out.printf("Triangle | color=%-6s b=%.1f  h=%.1f   area=%.2f%n",
                color, base, height, area());
    }
}

// ---- Class demonstrating METHOD OVERLOADING ----
class Calculator {

    // Same method name 'add', but different parameter types/counts
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {        // 3 integers
        return a + b + c;
    }

    double add(double a, double b) {      // two doubles
        return a + b;
    }

    String add(String a, String b) {      // two Strings — concatenation
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // ----- 1. COMPILE-TIME: Method Overloading -----
        System.out.println("===== Compile-Time Polymorphism (Overloading) =====\n");

        Calculator calc = new Calculator();
        System.out.println("add(3, 4)           = " + calc.add(3, 4));
        System.out.println("add(1, 2, 3)        = " + calc.add(1, 2, 3));
        System.out.println("add(2.5, 3.7)       = " + calc.add(2.5, 3.7));
        System.out.println("add(\"Hello \", \"World\") = " + calc.add("Hello ", "World"));

        // ----- 2. RUNTIME: Method Overriding -----
        System.out.println("\n===== Runtime Polymorphism (Overriding) =====\n");

        // All stored as the parent type 'Shape' — the actual type decides which method runs
        Shape[] shapes = {
            new Circle("Red",   5),
            new Rectangle("Blue", 4, 6),
            new Triangle("Green", 3, 8),
            new Circle("Yellow", 2.5),
            new Rectangle("Purple", 7, 3)
        };

        // The same call s.describe() produces DIFFERENT output depending on the real type
        for (Shape s : shapes) {
            s.describe(); // Java decides AT RUNTIME which describe() to call
        }

        // ----- Demonstrating that the runtime type matters -----
        System.out.println("\n===== area() called on Shape references =====\n");
        Shape s1 = new Circle("Red", 4);
        Shape s2 = new Rectangle("Blue", 5, 3);
        System.out.println("s1 area: " + String.format("%.2f", s1.area())); // Circle's area()
        System.out.println("s2 area: " + String.format("%.2f", s2.area())); // Rectangle's area()
    }
}
