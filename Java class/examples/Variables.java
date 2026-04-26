public class Variables {
    // A variable is a named container that stores a value in memory.
    // Every variable has a type, a name, and a value.

    // Class-level (static) variable - shared by all uses of this class
    static int globalCount = 0;

    public static void main(String[] args) {

        // ----- DECLARING AND INITIALIZING VARIABLES -----
        // Syntax: type variableName = value;

        int age = 20;               // stores a whole number
        double salary = 45000.75;   // stores a decimal number
        char grade = 'A';           // stores a single character
        boolean isEnrolled = true;  // stores true or false
        String name = "Enoch";      // stores text (String is not a primitive)

        System.out.println("===== Variables Demo =====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); 
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Enrolled: " + isEnrolled);

        // ----- CHANGING A VARIABLE'S VALUE -----
        age = 21; // reassign — only the value changes, not the type
        System.out.println("\nAfter birthday, age is now: " + age);

        // ----- LOCAL VARIABLES -----
        // Declared inside a method; only accessible within that method.
        int localScore = 95;
        System.out.println("Local score: " + localScore);

        // ----- CONSTANTS (final variables) -----
        // Use 'final' to make a variable whose value cannot change.
        final double TAX_RATE = 0.15;
        System.out.println("Tax rate (constant): " + TAX_RATE);
        // TAX_RATE = 0.20; // This would cause a compile error!

        // ----- MULTIPLE DECLARATIONS -----
        int x = 5, y = 10, z = 15;
        System.out.println("\nx=" + x + ", y=" + y + ", z=" + z);

        // ----- CLASS-LEVEL VARIABLE -----
        globalCount = 3;
        System.out.println("Global count: " + globalCount);
    }
}
