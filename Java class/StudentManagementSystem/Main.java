package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Score");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentScore();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }

    private static void addStudent() {
        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter score: ");
            double score = Double.parseDouble(scanner.nextLine());

            Student student = new Student(name, age, score);
            students.add(student);
            System.out.println("Student added successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Age and Score must be numeric.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student List ---");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
    }

    private static void updateStudentScore() {
        if (students.isEmpty()) {
            System.out.println("No student records to update.");
            return;
        }

        viewAllStudents();
        System.out.print("Enter the student number to update: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < students.size()) {
                System.out.print("Enter new score: ");
                double newScore = Double.parseDouble(scanner.nextLine());
                students.get(index).setScore(newScore);
                System.out.println("Score updated successfully!");
            } else {
                System.out.println("Invalid student number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
