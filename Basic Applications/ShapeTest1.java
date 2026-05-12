class Shape {
    protected String shapeName;

    // Constructor
    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    String getName() {
        return shapeName;
    }
}

// TwoDim Class
class TwoDim extends Shape {
    protected double length;
    protected double breadth;

    TwoDim(String shapeName, double length, double breadth) {
        super(shapeName);

        this.length = length;
        this.breadth = breadth;
    }

    double getLength() {
        return length;
    }

    double getBreadth() {
        return breadth;
    }
}

// Rectangle subclass
class Rectangle extends TwoDim {

    Rectangle(double length, double breadth) {
        super("Rectangle", length, breadth);
    }

    void getArea() {
        double area = length * breadth;

        System.out.println("=== Rectangle ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Length: " + getLength());
        System.out.println("Breadth: " + getBreadth());
        System.out.println("Area: " + area);
    }

    void getPerimeter() {
        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter: " + perimeter);
    }
}

// Rhombus subclass
class Rhombus extends TwoDim {

    Rhombus(double length, double breadth) {
        super("Rhombus", length, breadth);
    }

    void getArea() {
        double area = length * breadth;

        System.out.println("\n=== Rhombus ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Length: " + getLength());
        System.out.println("Breadth: " + getBreadth());
        System.out.println("Area: " + area);
    }

    void getPerimeter() {
        double perimeter = 4 * length;

        System.out.println("Perimeter: " + perimeter);
    }
}

// Main Class
public class ShapeTest1 {
    public static void main(String[] args) {

        // Rectangle Object
        Rectangle r = new Rectangle(10, 5);

        r.getArea();
        r.getPerimeter();

        // Rhombus Object
        Rhombus rh = new Rhombus(6, 4);

        rh.getArea();
        rh.getPerimeter();
    }
}