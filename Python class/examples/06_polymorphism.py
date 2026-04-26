# 6. POLYMORPHISM
# Runtime polymorphism (Overriding) works just like Java.
# Compile-time polymorphism (Overloading) is NOT supported natively like Java.
# Instead, we use default arguments or variable arguments.

import math

class Shape:
    def __init__(self, color):
        self.color = color
    
    def area(self):
        return 0
    
    def describe(self):
        print(f"{self.color} shape with area {self.area():.2f}")

class Circle(Shape):
    def __init__(self, color, radius):
        super().__init__(color)
        self.radius = radius
    
    def area(self):
        return math.pi * self.radius ** 2

class Rectangle(Shape):
    def __init__(self, color, width, height):
        super().__init__(color)
        self.width = width
        self.height = height
    
    def area(self):
        return self.width * self.height

# --- Simulating Overloading ---
class Calculator:
    # Instead of multiple 'add' methods, we use parameters that 
    # can handle different types or counts.
    def add(self, a, b, c=0):
        # This handles both 2 and 3 numbers!
        return a + b + c

if __name__ == "__main__":
    print("===== Runtime Polymorphism (Overriding) =====")
    shapes = [
        Circle("Red", 5),
        Rectangle("Blue", 4, 6)
    ]
    
    for s in shapes:
        s.describe() # Python calls the correct area() for each

    print("\n===== Simulating Overloading =====")
    calc = Calculator()
    print(f"2 numbers: {calc.add(5, 10)}")
    print(f"3 numbers: {calc.add(5, 10, 15)}")
