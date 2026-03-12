//Place tiles of size 1xm in a floor of size nXm. 

public class TilingProblem {
    public static int placeTiles(int n, int m) {
        //base case
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }

        //vertical placement
        int verticalWays = placeTiles(n - m, m);

        //horizontal placement
        int horizontalWays = placeTiles(n - 1, m);

        return verticalWays + horizontalWays;
    }

    public static void main(String args[]){
        int n = 4, m = 2;
        int totalWays = placeTiles(n, m);
        System.out.println("Total ways to place tiles of size 1x" + m + " in a floor of size " + n + "x" + m + " is: " + totalWays);
    }
}
