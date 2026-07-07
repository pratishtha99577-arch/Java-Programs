import java.lang.reflect.Method;
import java.lang.reflect.Field;

class Student {

    int rollNo = 101;
    String name = "John";

    public void display() {
        System.out.println("Student Details");
    }

    public void show() {
        System.out.println("Reflection Example");
    }
}

public class ReflectionDemo {

    public static void main(String[] args) {

        Student obj = new Student();

        // Get Class object
        Class<?> c = obj.getClass();

        System.out.println("Class Name: " + c.getName());

        // Display Fields
        System.out.println("\nFields:");
        Field[] fields = c.getDeclaredFields();

        for (Field f : fields) {
            System.out.println(f.getName());
        }

        // Display Methods
        System.out.println("\nMethods:");
        Method[] methods = c.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}