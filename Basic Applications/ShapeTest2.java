abstract class Shape {

    // Abstract methods
    abstract double getArea();

    abstract double getVolume();
}

// Square Class
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    double getVolume() {
        return 0; // 2D shape has no volume
    }
}

// Circle Class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getVolume() {
        return 0; // 2D shape has no volume
    }
}

// Cube Class
class Cube extends Shape {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double getArea() {
        return 6 * side * side;
    }

    double getVolume() {
        return side * side * side;
    }
}

// Main Class
public class ShapeTest2 {
    public static void main(String[] args) {

        // Square Object
        Square s = new Square(5);

        System.out.println("=== Square ===");
        System.out.println("Area: " + s.getArea());
        System.out.println("Volume: " + s.getVolume());

        // Circle Object
        Circle c = new Circle(4);

        System.out.println("\n=== Circle ===");
        System.out.println("Area: " + c.getArea());
        System.out.println("Volume: " + c.getVolume());

        // Cube Object
        Cube cb = new Cube(3);

        System.out.println("\n=== Cube ===");
        System.out.println("Area: " + cb.getArea());
        System.out.println("Volume: " + cb.getVolume());
    }
}