// ---------------------------------------------------------------------------
// ENCAPSULATION
// Encapsulation means hiding internal data and only exposing it through
// controlled methods. This protects data from unintended modification.
//
// HOW TO ACHIEVE IT:
//   1. Declare fields as 'private'  (hide the data)
//   2. Provide public getter methods to READ the data
//   3. Provide public setter methods to WRITE the data (with validation)
// ---------------------------------------------------------------------------

class BankAccount {

    // Private fields — cannot be accessed directly from outside this class
    private String owner;
    private double balance;
    private String accountNumber;

    // Constructor
    BankAccount(String owner, String accountNumber, double initialBalance) {
        this.owner         = owner;
        this.accountNumber = accountNumber;
        // Use the setter so validation logic runs even during construction
        setBalance(initialBalance);
    }

    // ----- GETTERS -----
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        // Only show the last 4 digits for security
        return "****" + accountNumber.substring(accountNumber.length() - 4);
    }

    // ----- SETTERS (with validation) -----
    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        } else {
            System.out.println("Error: Owner name cannot be empty.");
        }
    }

    private void setBalance(double balance) { // private — only used internally
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // ----- BEHAVIOUR METHODS -----
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
        }
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner
                + " | Account: " + getAccountNumber()
                + " | Balance: $" + balance);
    }
}

// ---- Student class showing encapsulation of a grade ----
class Student {
    private String name;
    private int    grade; // must be 0-100

    Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName()  { return name; }
    public int    getGrade() { return grade; }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Error: Grade must be between 0 and 100.");
        }
    }

    public String getLetterGrade() {
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        System.out.println("===== Encapsulation — BankAccount =====\n");

        BankAccount account = new BankAccount("Enoch", "123456789", 500.00);
        account.displayInfo();

        account.deposit(200);
        account.withdraw(100);
        account.withdraw(1000); // should fail — insufficient funds
        account.deposit(-50);   // should fail — negative amount

        System.out.println("\nBalance via getter: $" + account.getBalance());
        // account.balance = 1000000; // COMPILE ERROR — balance is private!

        System.out.println("\n===== Encapsulation — Student =====\n");

        Student s1 = new Student("Alice", 88);
        System.out.println(s1.getName() + " scored " + s1.getGrade()
                + " → Letter grade: " + s1.getLetterGrade());

        s1.setGrade(95); // valid update
        System.out.println("After update: " + s1.getGrade()
                + " → " + s1.getLetterGrade());

        s1.setGrade(150); // invalid — rejected by setter
        s1.setGrade(-150); // invalid — rejected by setter
    }
}
