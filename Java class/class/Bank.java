class BankAccount {
    private String accountName;
    private double balance;
    private String accountNumber;

    BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.setBalace(balance);
        this.accountNumber = accountNumber;
    }

    private void setBalace(double balance) {
        if ( balance < 0 ) {
            System.out.println("Balance cannot be Negative, defaulting to 0.");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void getDetails() {
        System.out.println("\n==========================");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("==========================\n");
    }

    public void deposit(double amount) {
        if (amount < 0 ) {
            System.out.println("Invalid amount, please enter a valid amount");
        } else {
            this.balance += amount;
            System.out.println("Amount deposited successfully, new balance is N" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0 ) {
            System.out.println("Cannot withdraw a negative amount!");
        } else if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("Amount withrwab successfully, new balance is N" + balance);
        }
    }

}


public class Bank {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Musa", -20, "1234567890");

        // b1.balance = 1000.00;

        System.out.println("Your balance is: " + b1.getBalance());
        b1.getDetails();

        b1.deposit(29.45);
        b1.withdraw(-65.10);
    }
}