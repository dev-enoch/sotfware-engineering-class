package StudentManagementSystem;

public class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        setName(name);
        setAge(age);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive number.");
        }
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Score: " + score;
    }
}
