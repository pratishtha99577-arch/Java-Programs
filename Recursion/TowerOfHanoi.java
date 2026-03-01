// Tower of Hanoi

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, "S", "H", "D"); // S, H and D are names of rods
    }
}
 
//complexity: O(2^n)
//T(n) = 2T(n-1) + (1) : recursion equation  = 2(2T(n-2) + 1) + 1 = 4T(n-2) + 2 + 1 = 4(2T(n-3) + 1) + 3 = 8T(n-3) + 4 + 3 .... = 2^k T(n-k) + (2^k - 1)
//T(n-1) = 2T(n-2) + (1)
//T(n-2) = 2T(n-3) + (1)
//...
//T(1) = 1