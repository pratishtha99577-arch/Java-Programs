import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Student class
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Roll No: " + rollNo +
               ", Name: " + name +
               ", Marks: " + marks;
    }
}

public class StudentFileDemo {

    public static void main(String[] args) {

        try {

            // Create student objects
            Student s1 = new Student(101, "Alice", 89.5);
            Student s2 = new Student(102, "Bob", 76.0);
            Student s3 = new Student(103, "Charlie", 92.3);

            // Create file output stream
            FileOutputStream fos = new FileOutputStream("students.dat");

            // Create object output stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Store student objects in file
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);

            oos.close();
            fos.close();

            System.out.println("Student objects stored successfully in students.dat");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}