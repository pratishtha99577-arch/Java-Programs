import java.util.*;


public class CalculatorUsingSwitch {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number: ");
       int a = sc.nextInt();
       System.out.println("Enter second number :");
       int b = sc.nextInt();
       System.out.println("Enter operator : ");
       int operator = sc.nextInt();


       /**
        * 1 -> +
        * 2 -> -
        * 3 -> *
        * 4 -> /
        * 5 -> %
        */


       switch(operator) {
           case 1 : System.out.println("Sum = ");
                    System.out.println(a+b);
           break;
           case 2 : System.out.println("Subtraction = ");
                    System.out.println(a-b);
           break;
           case 3 : System.out.println("Multiplication =");
                    System.out.println(a*b);
           break;
           case 4 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                    System.out.println("Division = ");
                       System.out.println(a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println("Modulus = ");
                       System.out.println(a%b);
                   }
	    break; 
           default : System.out.println("Invalid Operator");
       }
   }
}


