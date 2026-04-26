class Student:
    def __init__(self, name: str, age: int, score: float):
        self.name = name  # These will call the setters below
        self.age = age
        self.score = score

    # In Python, we use @property for getters
    @property
    def name(self):
        return self._name

    # And @name.setter for setters
    @name.setter
    def name(self, value):
        if not value or not value.strip():
            raise ValueError("Name cannot be empty.")
        self._name = value

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        if value <= 0:
            raise ValueError("Age must be a positive number.")
        self._age = value

    @property
    def score(self):
        return self._score

    @score.setter
    def score(self, value):
        if not (0 <= value <= 100):
            raise ValueError("Score must be between 0 and 100.")
        self._score = value

    # Equivalent to Java's toString()
    def __str__(self):
        return f"Name: {self.name}, Age: {self.age}, Score: {self.score}"
