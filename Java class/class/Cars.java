class Car {
    private String model;
    private String make;
    private int year;

    Car(String make, String model,  int year){
        this.model = model;
        this.make = make;
        this.setYear(year);
    }

    void displayInfo() {
        System.out.println("Make: " + make + ", model: " + model + ", year: " + year);
    }

    private void setYear(int year) {
        if (year <= 2000 && year >= 2025) {
            System.out.println("Year must be between 2000 - 2025");
            this.year = 2000;
        } else {
            this.year = year;
            
        }
    }

    public void getYear() {
        System.out.println("Year: " + year);
    }
}

interface Drivable {
    void drive();
}

interface Rechargeable {
    void charge();
}

class Tesla extends Car implements Drivable, Rechargeable {
    Tesla(String model, int year) {
        super("Tesla", model, year);
    }

    @Override
    public void drive() {
        System.out.println("Driving the ...");
    }

    @Override
    public void charge() {
        System.out.println("Charging....");
    }

    void driveself() {
        System.out.println("Car is self driving...");
    }

    @Override
    void displayInfo() {
        super.displayInfo();

        System.out.println("Car can self drive");
    }

}

public class Cars {
    public static void main(String[] args) {


        Car c1 = new Car("BMW", "M5", 1998);
        c1.displayInfo();

        c1.getYear();

    }
}