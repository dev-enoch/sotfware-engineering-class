# 4. ENCAPSULATION
# Python uses properties to wrap attributes. 
# Private variables are marked with double underscores (e.g., __balance).

class BankAccount:
    def __init__(self, owner, account_number, initial_balance):
        self.owner = owner
        self.__account_number = account_number # Private
        self.__balance = initial_balance if initial_balance >= 0 else 0

    @property
    def balance(self):
        return self.__balance

    @property
    def account_number(self):
        # Masking similar to the Java example
        return "****" + self.__account_number[-4:]

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"Deposited ${amount}. New balance: ${self.__balance}")
        else:
            print("Error: Deposit amount must be positive.")

    def withdraw(self, amount):
        if amount <= 0:
            print("Error: Withdrawal amount must be positive.")
        elif amount > self.__balance:
            print(f"Error: Insufficient funds. Balance: ${self.__balance}")
        else:
            self.__balance -= amount
            print(f"Withdrew ${amount}. New balance: ${self.__balance}")

class Student:
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade # Uses the setter below

    @property
    def grade(self):
        return self._grade

    @grade.setter
    def grade(self, value):
        if 0 <= value <= 100:
            self._grade = value
        else:
            print("Error: Grade must be between 0 and 100.")
            if not hasattr(self, '_grade'): self._grade = 0 # Ensure it exists

    def get_letter_grade(self):
        if self.grade >= 90: return "A"
        if self.grade >= 80: return "B"
        if self.grade >= 70: return "C"
        if self.grade >= 60: return "D"
        return "F"

if __name__ == "__main__":
    print("===== BankAccount Demo =====")
    acc = BankAccount("Enoch", "123456789", 500)
    print(f"Account: {acc.account_number}")
    acc.deposit(200)
    acc.withdraw(1000) # Fails 

    print("\n===== Student Demo =====")
    s = Student("Alice", 88)
    print(f"{s.name} Grade: {s.get_letter_grade()}")
    s.grade = 150 # Fails validation
