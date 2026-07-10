import java.io.FileInputStream;
import java.io.ObjectInputStream;
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

public class DeserializationDemo {

    public static void main(String[] args) {

        try {

            // Creating FileInputStream
            FileInputStream file = new FileInputStream("student.ser");

            // Creating ObjectInputStream
            ObjectInputStream in = new ObjectInputStream(file);

            // Deserializing object
            Student s = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object deserialized successfully.");
            System.out.println("Roll No: " + s.rollNo);
            System.out.println("Name: " + s.name);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}