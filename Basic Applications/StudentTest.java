class Student {
    protected String qualification;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String contact;

    // Constructor
    Student(String qualification,
            String firstName,
            String lastName,
            String address,
            String contact) {

        this.qualification = qualification;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
    }

    String getQual() {
        return qualification;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getAddress() {
        return address;
    }

    String getContat() {
        return contact;
    }
}

// Faculty subclass
class Faculty extends Student {
    private double facultySalary;

    Faculty(String qualification,
            String firstName,
            String lastName,
            String address,
            String contact,
            double facultySalary) {

        super(qualification,
              firstName,
              lastName,
              address,
              contact);

        this.facultySalary = facultySalary;
    }

    void salary() {
        System.out.println("=== Faculty Information ===");
        System.out.println("Qualification: " + getQual());
        System.out.println("Name: " + getFirstName()
                           + " " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContat());
        System.out.println("Salary: " + facultySalary);
    }
}

// Scholar subclass
class Scholar extends Student {
    private String courseName;

    Scholar(String qualification,
            String firstName,
            String lastName,
            String address,
            String contact,
            String courseName) {

        super(qualification,
              firstName,
              lastName,
              address,
              contact);

        this.courseName = courseName;
    }

    void Course() {
        System.out.println("\n=== Scholar Information ===");
        System.out.println("Qualification: " + getQual());
        System.out.println("Name: " + getFirstName()
                           + " " + getLastName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContat());
        System.out.println("Course: " + courseName);
    }
}

// Main Class
public class StudentTest {
    public static void main(String[] args) {

        // Faculty Object
        Faculty f = new Faculty(
                "PhD",
                "John",
                "Doe",
                "Bhopal",
                "9876543210",
                75000
        );

        f.salary();

        // Scholar Object
        Scholar s = new Scholar(
                "MCA",
                "Jane",
                "Smith",
                "Indore",
                "9123456780",
                "Computer Science"
        );

        s.Course();
    }
}