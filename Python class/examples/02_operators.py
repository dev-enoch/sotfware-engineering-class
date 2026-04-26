# 2. OPERATORS
# Key difference: Python uses words (and, or, not) instead of symbols (&&, ||, !).

print("===== Arithmetic Operators =====")
a, b = 20, 6
print(f"a = {a}, b = {b}")
print(f"a + b = {a + b}")
print(f"a - b = {a - b}")
print(f"a * b = {a * b}")
print(f"a / b = {a / b}")  # NOTE: In Python, / always gives a float!
print(f"a // b = {a // b}") # Floor division (like Java's int / int)
print(f"a % b = {a % b}")
print(f"a ** b = {a ** b}") # Exponentiation (not in basic Java)

# NOTE: Python does NOT have ++ or -- operators.
counter = 5
counter += 1
print(f"Counter incremented: {counter}")

print("\n===== Assignment Operators =====")
x = 10
x += 5; print(f"x += 5 -> {x}")
x *= 2; print(f"x *= 2 -> {x}")

print("\n===== Comparison Operators =====")
p, q = 10, 20
print(f"p == q: {p == q}")
print(f"p != q: {p != q}")
print(f"p > q:  {p > q}")

print("\n===== Logical Operators =====")
is_sunny = True
is_warm = False
print(f"is_sunny and is_warm: {is_sunny and is_warm}") # &&
print(f"is_sunny or is_warm:  {is_sunny or is_warm}")  # ||
print(f"not is_sunny:         {not is_sunny}")         # !

print("\n===== Ternary Operator =====")
# Java: (condition) ? trueVal : falseVal
# Python: trueVal if condition else falseVal
score = 75
result = "Pass" if score >= 60 else "Fail"
print(f"Score {score} -> {result}")
