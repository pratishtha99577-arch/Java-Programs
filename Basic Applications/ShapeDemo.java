// Creating package
package org.shapes;

// Square Class
class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double area() {
        return side * side;
    }
}

// Triangle Class
class Triangle {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

// Circle Class
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

// Main Class
public class ShapeDemo {

    public static void main(String[] args) {

        // Square Object
        Square s = new Square(5);
        System.out.println("Area of Square: "
                + s.area());

        // Triangle Object
        Triangle t = new Triangle(10, 4);
        System.out.println("Area of Triangle: "
                + t.area());

        // Circle Object
        Circle c = new Circle(7);
        System.out.println("Area of Circle: "
                + c.area());
    }
}