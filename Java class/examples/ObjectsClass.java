class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void sing() {
        System.out.println(this.name + " is singing!");
     }
}

public class ObjectsClass {
    public static void main(String[] args) {
        
        Person ahmed = new Person("Ahmed", 14);
        ahmed.sing();

        Person amina = new Person("Amina", 19);
        amina.sing();
    }
}