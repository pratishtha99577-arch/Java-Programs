import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serializable class
class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        try {

            // Creating object
            Student s = new Student(101, "John");

            // Creating FileOutputStream
            FileOutputStream file = new FileOutputStream("student.ser");

            // Creating ObjectOutputStream
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Serializing object
            out.writeObject(s);

            out.close();
            file.close();

            System.out.println("Object serialized successfully.");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}