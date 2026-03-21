public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a = 99;
        int b = 88;
        
        a = a + b;
        b = a - b;
        a = a - b;
         
        System.out.println("The value of a and b is: " + a + " " + b);
    }
    
}
