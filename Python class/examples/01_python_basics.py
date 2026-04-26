# 1. PYTHON BASICS (DataTypes & Variables)
# In Java, you must declare types (int, double, char).
# In Python, types are dynamic and inferred.

print("===== 1. Variables & Basic Types =====")

# Integers (Java's byte, short, int, long are all 'int' in Python)
age = 20
population = 1_000_000
print(f"int: {age}, {population}")

# Floats (Java's float and double are both 'float' in Python)
pi = 3.141592653589793
temperature = 36.6
print(f"float: {pi}, {temperature}")

# Strings (Java's char and String are both 'str' in Python)
letter = 'J'  # Single or double quotes both work
name = "Enoch"
print(f"str: {letter}, {name}")

# Booleans (Note the capitalization: True/False)
is_python_fun = True
is_raining = False
print(f"bool: {is_python_fun}, {is_raining}")

print("\n===== 2. Reference Types (Lists/Arrays) =====")

# Lists (Python's equivalent to Java's Arrays/ArrayList)
scores = [85, 90, 78, 95, 88]
print(f"List: {scores}")
print("Iterating through list:")
for score in scores:
    print(score, end=" ")
print()

print("\n===== 3. Type Casting =====")

# Widening (Automatic)
my_int = 42
my_float = float(my_int) # Explicit in Python, though often implicit in ops
print(f"int to float: {my_float}")

# Narrowing (Manual)
price = 9.99
truncated_price = int(price) # Equivalent to (int) in Java
print(f"float to int: {truncated_price}")

print("\n===== 4. Constants =====")
# Python doesn't have a 'final' keyword. 
# We use UPPER_CASE by convention to show something shouldn't change.
TAX_RATE = 0.15
print(f"Constant (by convention): {TAX_RATE}")
