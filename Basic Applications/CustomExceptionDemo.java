class MyException extends Exception {

    String message;

    // Constructor
    MyException(String message) {
        this.message = message;
    }

    // Method to display stored message
    void printMessage() {
        System.out.println("Custom Exception: " + message);
    }
}

public class CustomExceptionDemo {

    public static void main(String[] args) {

        try {

            // Throwing custom exception
            throw new MyException("This is my own exception class.");

        }

        catch (MyException e) {

            // Calling method of custom exception class
            e.printMessage();
        }

        finally {

            System.out.println("Program Executed Successfully.");
        }
    }
}