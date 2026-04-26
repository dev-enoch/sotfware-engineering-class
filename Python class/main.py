from student import Student

students = []

def add_student():
    try:
        name = input("Enter name: ")
        age = int(input("Enter age: "))
        score = float(input("Enter score: "))

        student = Student(name, age, score)
        students.append(student)
        print("Student added successfully!")
    except ValueError as e:
        print(f"Error: {e}")

def view_all_students():
    if not students:
        print("No student records found.")
    else:
        print("\n--- Student List ---")
        for i, student in enumerate(students, 1):
            print(f"{i}. {student}")

def update_student_score():
    if not students:
        print("No student records to update.")
        return

    view_all_students()
    try:
        index = int(input("Enter the student number to update: ")) - 1
        if 0 <= index < len(students):
            new_score = float(input("Enter new score: "))
            students[index].score = new_score
            print("Score updated successfully!")
        else:
            print("Invalid student number.")
    except ValueError as e:
        print(f"Error: {e}")

def main():
    while True:
        print("\n--- Student Management System ---")
        print("1. Add Student")
        print("2. View All Students")
        print("3. Update Student Score")
        print("4. Exit")
        
        choice = input("Choose an option: ")

        match choice:
            case "1":
                add_student()
            case "2":
                view_all_students()
            case "3":
                update_student_score()
            case "4":
                print("Exiting... Goodbye!")
                break
            case _:
                print("Invalid choice. Try again.")

if __name__ == "__main__":
    main()
