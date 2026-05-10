class CommunityMember {
    protected String name;
    protected String address;
    protected String contact;
    protected String dateOfJoin;

    // Constructor
    CommunityMember(String name, String address,
                    String contact, String dateOfJoin) {

        this.name = name;
        this.address = address;
        this.contact = contact;
        this.dateOfJoin = dateOfJoin;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getContact() {
        return contact;
    }

    String getDateOfJoin() {
        return dateOfJoin;
    }
}

// Employee subclass
class Employee extends CommunityMember {
    private String qualification;

    Employee(String name, String address,
             String contact, String dateOfJoin,
             String qualification) {

        super(name, address, contact, dateOfJoin);
        this.qualification = qualification;
    }

    void Qualification() {
        System.out.println("=== Employee Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContact());
        System.out.println("Date of Join: " + getDateOfJoin());
        System.out.println("Qualification: " + qualification);
    }
}

// Student subclass
class Student extends CommunityMember {
    private String qualification;

    Student(String name, String address,
            String contact, String dateOfJoin,
            String qualification) {

        super(name, address, contact, dateOfJoin);
        this.qualification = qualification;
    }

    void Qualification() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Contact: " + getContact());
        System.out.println("Date of Join: " + getDateOfJoin());
        System.out.println("Qualification: " + qualification);
    }
}

// Main Class
public class CommunityTest {
    public static void main(String[] args) {

        // Employee Object
        Employee e = new Employee(
                "John Doe",
                "Bhopal",
                "9876543210",
                "10-01-2025",
                "M.Tech"
        );

        e.Qualification();

        System.out.println();

        // Student Object
        Student s = new Student(
                "Jane Smith",
                "Indore",
                "9123456780",
                "15-02-2025",
                "BCA"
        );

        s.Qualification();
    }
}