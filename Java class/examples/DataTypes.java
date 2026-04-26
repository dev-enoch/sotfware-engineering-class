public class DataTypes {
    // Java has two categories of data types:
    //   1. Primitive types  — built-in, store raw values
    //   2. Reference types  — store references to objects (e.g. String, arrays)

    public static void main(String[] args) {

        System.out.println("===== Primitive Data Types =====\n");

        // --- byte ---
        // Size: 8 bits | Range: -128 to 127
        byte smallNumber = 100;
        System.out.println("byte:   " + smallNumber);

        // --- short ---
        // Size: 16 bits | Range: -32,768 to 32,767
        short shortNumber = 30000;
        System.out.println("short:  " + shortNumber);

        // --- int ---
        // Size: 32 bits | Range: -2,147,483,648 to 2,147,483,647 (most common for whole numbers)
        int population = 1_000_000; // underscores improve readability
        System.out.println("int:    " + population);

        // --- long ---
        // Size: 64 bits | Use 'L' suffix for long literals
        long distanceToSun = 149_600_000_000L;
        System.out.println("long:   " + distanceToSun);

        // --- float ---
        // Size: 32 bits | Use 'f' suffix | ~6-7 decimal digits of precision
        float temperature = 36.6f;
        System.out.println("float:  " + temperature);

        // --- double ---
        // Size: 64 bits | Default for decimals | ~15 decimal digits of precision
        double pi = 3.141592653589793;
        System.out.println("double: " + pi);

        // --- char ---
        // Size: 16 bits | Stores a single Unicode character (use single quotes)
        char letter = 'J';
        char symbol = '@';
        System.out.println("char:   " + letter + " " + symbol);

        // --- boolean ---
        // Stores only true or false
        boolean isJavaFun = true;
        boolean isRaining = false;
        System.out.println("boolean: " + isJavaFun + ", " + isRaining);

        // ----- REFERENCE / NON-PRIMITIVE TYPES -----
        System.out.println("\n===== Reference Data Types =====\n");

        // --- String ---
        // Not a primitive — it is a class. Use double quotes.
        String firstName = "Enoch";
        String lastName  = "Java";
        String fullName  = firstName + " " + lastName; // concatenation
        System.out.println("String: " + fullName);
        System.out.println("Length of name: " + fullName.length()); // String method
        System.out.println("Uppercase: " + fullName.toLowerCase());

        // --- Array ---
        // Stores multiple values of the same type
        int[] scores = {85, 90, 78, 95, 88};
        System.out.println("\nArray of scores:");
        // System.out.print(scores)
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        // ----- TYPE CASTING -----
        System.out.println("\n===== Type Casting =====\n");

        // Widening (automatic) — smaller type → larger type, no data loss
        int myInt = 42;
        double myDouble = myInt; // int automatically becomes double
        System.out.println("Widening  int → double: " + myDouble);

        // Narrowing (manual) — larger type → smaller type, possible data loss
        double price = 9.99;
        int truncatedPrice = (int) price; // decimal part is cut off
        System.out.println("Narrowing double → int: " + truncatedPrice);
    }
}
