public class Operators {
    // An operator performs an operation on one or more values (operands).
    // Java has several categories of operators.

    public static void main(String[] args) {

        // ----- 1. ARITHMETIC OPERATORS -----
        // Used for mathematical calculations: + - * / % ++ --
        System.out.println("===== Arithmetic Operators =====");

        int a = 20, b = 6;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b  = " + (a + b));   // Addition
        System.out.println("a - b  = " + (a - b));   // Subtraction
        System.out.println("a * b  = " + (a * b));   // Multiplication
        System.out.println("a / b  = " + (a / b));   // Division (integer — drops remainder)
        System.out.println("a % b  = " + (a % b));   // Modulus (remainder)

        int counter = 5;
        System.out.println("counter++ = " + counter++); // post-increment: use THEN add
        System.out.println("After:      " + counter);
        System.out.println("++counter = " + ++counter); // pre-increment: add THEN use
        System.out.println("counter-- = " + counter--); // post-decrement
        System.out.println("After:      " + counter);

        // ----- 2. ASSIGNMENT OPERATORS -----
        // Assign (and optionally modify) a variable's value.
        System.out.println("\n===== Assignment Operators =====");

        int x = 10;
        System.out.println("x = 10  → " + x);
        x += 5;  System.out.println("x += 5  → " + x);  // x = x + 5
        x -= 3;  System.out.println("x -= 3  → " + x);  // x = x - 3
        x *= 2;  System.out.println("x *= 2  → " + x);  // x = x * 2
        x /= 4;  System.out.println("x /= 4  → " + x);  // x = x / 4
        x %= 3;  System.out.println("x %= 3  → " + x);  // x = x % 3

        // ----- 3. COMPARISON (RELATIONAL) OPERATORS -----
        // Compare two values; always return true or false.
        System.out.println("\n===== Comparison Operators =====");

        int p = 10, q = 20;
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("p == q  : " + (p == q)); // equal to
        System.out.println("p != q  : " + (p != q)); // not equal to
        System.out.println("p >  q  : " + (p >  q)); // greater than
        System.out.println("p <  q  : " + (p <  q)); // less than
        System.out.println("p >= q  : " + (p >= q)); // greater than or equal
        System.out.println("p <= q  : " + (p <= q)); // less than or equal

        // ----- 4. LOGICAL OPERATORS -----
        // Combine boolean expressions: && || !
        System.out.println("\n===== Logical Operators =====");

        boolean isSunny = true;
        boolean isWarm  = false;

        System.out.println("isSunny = " + isSunny + ", isWarm = " + isWarm);
        System.out.println("isSunny && isWarm : " + (isSunny && isWarm)); // AND — both must be true
        System.out.println("isSunny || isWarm : " + (isSunny || isWarm)); // OR  — at least one true
        System.out.println("!isSunny          : " + (!isSunny));           // NOT — flips the value

        // ----- 5. STRING CONCATENATION OPERATOR -----
        System.out.println("\n===== String Concatenation =====");

        String firstName = "Java";
        int version = 17;
        System.out.println("Language: " + firstName + " " + version);

        // ----- 6. TERNARY OPERATOR -----
        // Compact if-else: condition ? valueIfTrue : valueIfFalse
        System.out.println("\n===== Ternary Operator =====");

        int score = 75;
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Score: " + score + " → " + result);

        int num1 = 42, num2 = 19;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Max of " + num1 + " and " + num2 + " is: " + max);
    }
}
