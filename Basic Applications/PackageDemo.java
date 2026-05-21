// Creating our own package
package mypackage;

// First Class
class Addition {

    int add(int a, int b) {
        return a + b;
    }
}

// Second Class
class Subtraction {

    int subtract(int a, int b) {
        return a - b;
    }
}

// Third Class that uses package classes
public class PackageDemo {

    public static void main(String[] args) {

        Addition a = new Addition();
        Subtraction s = new Subtraction();

        System.out.println("Addition: " + a.add(10, 5));

        System.out.println("Subtraction: " + s.subtract(10, 5));
    }
}