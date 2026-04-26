# 3. OBJECTS
# In Python, 'self' is used instead of 'this', and it must be 
# the first parameter in every method.

class Car:
    def __init__(self, brand, color, year):
        self.brand = brand
        self.color = color
        self.year = year
        self.speed = 0

    def accelerate(self, amount):
        self.speed += amount
        print(f"{self.brand} accelerates to {self.speed} km/h")

    def brake(self, amount):
        self.speed = max(0, self.speed - amount)
        print(f"{self.brand} slows down to {self.speed} km/h")

    def display_info(self):
        print(f"Brand: {self.brand} | Color: {self.color} | Year: {self.year} | Speed: {self.speed} km/h")

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self):
        print(f"Hi, I'm {self.name} and I'm {self.age} years old.")

# Example from Books.java
class Book:
    def __init__(self, title, num_pages):
        self.title = title
        self.num_pages = num_pages

    def print_book(self):
        print(f"Book Title: {self.title}")
        print(f"Number of Pages: {self.num_pages}")

if __name__ == "__main__":
    print("===== Car Objects =====")
    car1 = Car("Toyota", "Red", 2022)
    car1.display_info()
    car1.accelerate(60)

    print("\n===== Person Objects =====")
    p1 = Person("Enoch", 20)
    p1.greet()

    print("\n===== Book Objects =====")
    b1 = Book("Chaos", 237)
    b1.print_book()
