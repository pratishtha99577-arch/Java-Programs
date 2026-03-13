//find the number of ways in which you can invite n people to your party,single or in pairs

public class InviteGuestsWays {
    public static int callGuests(int n){
        //base case
        if(n <= 1){
            return 1;
        }

        //single choice
        int ways1 = callGuests(n - 1);

        //pair choice
        int ways2 = (n - 1) * callGuests(n - 2);

        return ways1 + ways2;
    }

    public static void main(String args[]){
        int n = 4;
        int totalWays = callGuests(n);
        System.out.println("Total ways to invite " + n + " people to the party is: " + totalWays);
    }

}
