class Shape {
    protected String shapeName;

    // Constructor
    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Method to get shape name
    String getName() {
        return shapeName;
    }
}

// TwoDim subclass
class TwoDim extends Shape {
    private double radius;

    TwoDim(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    // Method to calculate area
    void area() {
        double area = 3.14 * radius * radius;

        System.out.println("=== Two Dimensional Shape ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Area: " + area);
    }
}

// ThreeDim subclass
class ThreeDim extends Shape {
    private double radius;
    private double height;

    ThreeDim(String shapeName, double radius, double height) {
        super(shapeName);
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate volume
    void volume() {
        double volume = 3.14 * radius * radius * height;

        System.out.println("=== Three Dimensional Shape ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Volume: " + volume);
    }
}

// Main Class
public class ShapeTest {
    public static void main(String[] args) {

        // Two Dimensional Shape Object
        TwoDim t = new TwoDim("Circle", 5);

        t.area();

        System.out.println();

        // Three Dimensional Shape Object
        ThreeDim th = new ThreeDim("Cylinder", 5, 10);

        th.volume();
    }
}