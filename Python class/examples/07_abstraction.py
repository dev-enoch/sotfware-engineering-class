# 7. ABSTRACTION
# Python uses the 'abc' module to define abstract base classes.

from abc import ABC, abstractmethod

# --- Abstract Class ---
class Vehicle(ABC):
    def __init__(self, brand, year):
        self.brand = brand
        self.year = year

    @abstractmethod
    def start_engine(self):
        pass # No implementation here

    def display_info(self):
        print(f"Brand: {self.brand} | Year: {self.year}")

class ElectricCar(Vehicle):
    def start_engine(self):
        print(f"{self.brand} hums silently.")

# --- Simulating Interfaces ---
# Since Python supports Multiple Inheritance, 
# we don't strictly need 'interfaces'. We just inherit from multiple classes.

class Printable(ABC):
    @abstractmethod
    def print_content(self):
        pass

class Saveable(ABC):
    @abstractmethod
    def save(self, filename):
        pass

class Document(Printable, Saveable):
    def __init__(self, title, content):
        self.title = title
        self.content = content

    def print_content(self):
        print(f"Printing: {self.title}\n{self.content}")

    def save(self, filename):
        print(f"Saved {self.title} to {filename}")

if __name__ == "__main__":
    print("===== Abstract Class Demo =====")
    tesla = ElectricCar("Tesla", 2023)
    tesla.display_info()
    tesla.start_engine()

    print("\n===== Multiple Inheritance (Interface) Demo =====")
    doc = Document("Python Notes", "Python uses multiple inheritance.")
    doc.print_content()
    doc.save("notes.txt")
