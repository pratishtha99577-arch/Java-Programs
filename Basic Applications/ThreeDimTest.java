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

// ThreeDim Class
class ThreeDim extends Shape {
    protected double length;
    protected double breadth;
    protected double height;

    ThreeDim(String shapeName,
             double length,
             double breadth,
             double height) {

        super(shapeName);

        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    double getLength() {
        return length;
    }

    double getBreadth() {
        return breadth;
    }

    double getHeight() {
        return height;
    }
}

// Cuboid subclass
class Cuboid extends ThreeDim {

    Cuboid(double length, double breadth, double height) {

        super("Cuboid", length, breadth, height);
    }

    void getArea() {
        double area =
                2 * (length * breadth +
                     breadth * height +
                     height * length);

        System.out.println("=== Cuboid ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Length: " + getLength());
        System.out.println("Breadth: " + getBreadth());
        System.out.println("Height: " + getHeight());
        System.out.println("Area: " + area);
    }

    void getVolume() {
        double volume = length * breadth * height;

        System.out.println("Volume: " + volume);
    }
}

// Tetrahedron subclass
class Tetrahedron extends ThreeDim {

    Tetrahedron(double side) {

        super("Tetrahedron", side, side, side);
    }

    void getArea() {
        double area =
                Math.sqrt(3) * length * length;

        System.out.println("\n=== Tetrahedron ===");
        System.out.println("Shape Name: " + getName());
        System.out.println("Side: " + getLength());
        System.out.println("Area: " + area);
    }

    void getVolume() {
        double volume =
                (Math.pow(length, 3)) /
                (6 * Math.sqrt(2));

        System.out.println("Volume: " + volume);
    }
}

// Main Class
public class ThreeDimTest {
    public static void main(String[] args) {

        // Cuboid Object
        Cuboid c = new Cuboid(10, 5, 4);

        c.getArea();
        c.getVolume();

        // Tetrahedron Object
        Tetrahedron t = new Tetrahedron(6);

        t.getArea();
        t.getVolume();
    }
}