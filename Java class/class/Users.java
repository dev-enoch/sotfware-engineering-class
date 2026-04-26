class User {
    String username;
    private String password;

    User(String username, String password) {
        this.username = username;
        this.setPassword(password);
    }

    private void setPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Password must be more than 6 characters");
        } else {
            this.password = password;
        }
    }

    public void login(String inputpassword) {
        if (this.password.equals(inputpassword)) {
            System.out.println("User logged in.");
        } else {
            System.out.println("Incorrect password.");
        }
    }
}

public class Users {
    public static void main(String[] args) {
        User u1 = new User("Musa", "123456");
        u1.login("123456");
    }
}