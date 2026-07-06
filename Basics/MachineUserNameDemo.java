public class MachineUserNameDemo {

    public static void main(String[] args) {

        // Get machine user name
        String userName = System.getProperty("user.name");

        System.out.println("Machine User Name: " + userName);
    }
}