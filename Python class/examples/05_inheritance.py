# 5. INHERITANCE
# Python defines inheritance by passing the parent class in parentheses.

class Animal:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def eat(self):
        print(f"{self.name} is eating.")

    def sleep(self):
        print(f"{self.name} is sleeping.")

    def display_info(self):
        print(f"Name: {self.name} | Age: {self.age} years")

class Dog(Animal):
    def __init__(self, name, age, breed):
        super().__init__(name, age) # Call parent constructor
        self.breed = breed

    def fetch(self):
        print(f"{self.name} fetches the ball!")

    # Override parent method
    def display_info(self):
        super().display_info()
        print(f"Breed: {self.breed}")

class Cat(Animal):
    def __init__(self, name, age, is_indoor):
        super().__init__(name, age)
        self.is_indoor = is_indoor

    def purr(self):
        print(f"{self.name} purrs contentedly.")

    def display_info(self):
        super().display_info()
        print(f"Indoor cat: {self.is_indoor}")

if __name__ == "__main__":
    print("===== Dog Object =====")
    rex = Dog("Rex", 4, "German Shepherd")
    rex.display_info()
    rex.eat()
    rex.fetch()

    print("\n===== Cat Object =====")
    whiskers = Cat("Whiskers", 2, True)
    whiskers.display_info()
    whiskers.purr()
