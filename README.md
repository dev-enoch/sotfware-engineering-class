# sotfware-engineering-class

Teaching material from a software engineering class: Java first, then Python, covering the same concepts in the same order so students see the ideas twice in two languages.

## Contents

### Java class

- `intro.java`, `HelloWorld.java`: first programs
- `examples/`: data types, variables, operators, objects, encapsulation, inheritance, polymorphism, abstraction, interfaces and printable types
- `class/`: design examples with vehicles, cars, books, ebooks, a bank and a rechargeable device
- `StudentManagementSystem/`: a small console project with separate `Student` and `Main` classes
- `INTRODUCTION TO JAVA.pptx` and the solved mini project notes

### Python class

- `INTRODUCTION_TO_PYTHON.md`: written introduction
- `examples/01_python_basics.py` through `07_abstraction.py`, mirroring the Java sequence so students can compare the two

## Running the examples

Java:

```bash
cd "Java class"
javac examples/Objects.java
java examples.Objects
```

Or for a single file at the root:

```bash
cd "Java class"
javac intro.java
java intro
```

Python:

```bash
cd "Python class"
python examples/01_python_basics.py
```

## Notes

1. Compiled `.class` files are committed alongside sources. They are not needed to read the material and are worth adding to `.gitignore`.
2. Class names are matched to file names, so keep that pairing if you edit a file.
3. The folder name spells "sotfware". Renaming it breaks any links already shared with students, so it was left as it is.

## Author

Enoch Philip Dibal, https://devenoch.cv
