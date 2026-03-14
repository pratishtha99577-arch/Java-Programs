//Print all the subsets of a set of first n natural numbers

import java.util.*;

public class PrintAllSubsets {
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }


        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    
    public static void main(String[] args) {
        int n = 3; // Example input
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}