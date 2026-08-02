import java.util.Scanner;

class Student {

    int rollNo;
    String name;
    String course;
    double marks;

    Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

public class StudentRecordDemo {

    public static void main(String[] args) {

        // Create student records
        Student[] students = {
            new Student(101, "Alice", "BCA", 88.5),
            new Student(102, "Bob", "MCA", 76.0),
            new Student(103, "Charlie", "B.Tech", 91.2),
            new Student(104, "David", "B.Sc", 84.3),
            new Student(105, "Eva", "MBA", 79.8)
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number to Search: ");
        int roll = sc.nextInt();

        boolean found = false;

        // Search student by roll number
        for (Student s : students) {

            if (s.rollNo == roll) {

                found = true;

                System.out.println("\nStudent Record Found");
                System.out.println("----------------------------");
                System.out.println("Roll No : " + s.rollNo);
                System.out.println("Name    : " + s.name);
                System.out.println("Course  : " + s.course);
                System.out.println("Marks   : " + s.marks);
                break;
            }
        }

        // If record not found, display all records
        if (!found) {

            System.out.println("\nRecord Not Found!");
            System.out.println("\nDisplaying All Student Records:\n");

            System.out.printf("%-10s %-15s %-15s %-10s%n",
                    "Roll No", "Name", "Course", "Marks");
            System.out.println("--------------------------------------------------------");

            for (Student s : students) {

                System.out.printf("%-10d %-15s %-15s %-10.2f%n",
                        s.rollNo, s.name, s.course, s.marks);
            }
        }

        sc.close();
    }
}