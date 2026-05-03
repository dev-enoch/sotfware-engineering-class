class Animal:
    def __init__(self, name, age, breed, animal_type):
        self.name = name
        self.animal_type = animal_type
        self.__age = age
        self.__breed = breed

    @property
    def age(self):
        return "The " + self.animal_type + " is " + str(self.__age) + " years old!"

    @age.setter
    def age(self, age):
        if age >= 1:
            self.__age = age
        else:
            print("Invalid age provided")

if __name__ == "__main__":
    animal1 = Animal("Jack", 2, "German Sheperd", "Dog")

    print(f"Details: {animal1.age}")
    animal1.age = 0