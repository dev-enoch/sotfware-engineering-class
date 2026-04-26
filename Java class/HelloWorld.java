public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("First Java program");

        int age = 25; // Declare integers (initialised)
        int duration; // Declare integers (uninitialised)
        boolean isStudent = true; // Declare boolean (initialised)
        String name = "Alice Benson"; // Declare string (initialised)
        // This is a single line comment
        
        /* This is a multi-line comment 
            Thhis second line of the comment
        */

        System.out.println("Age: " + age);
        duration = age * 2;
        System.out.println("Duration: " + duration);
        System.out.println("Is student: " + isStudent);
        System.out.println("Name: " + name);
        System.out.println("Fullname: " + name);
    }
}