class Student {

    int rollNo;
    String name;
    String course;

    // Constructor
    Student(int rollNo, String name, String course) {

        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }


    // Overriding toString() method
    public String toString() {

        return "Roll No: " + rollNo +
               "\nName: " + name +
               "\nCourse: " + course;
    }
}


// Main Class
public class ToStringDemo {

    public static void main(String[] args) {


        // Creating object
        Student s1 = new Student(
                101,
                "John",
                "MCA"
        );


        // Printing object
        System.out.println(s1.toString());

    }
}