//check if an array is sorted(Strictly increasing)

public class CheckSortedArrayUsingRecursion {
    public static boolean isSorted(int arr[], int idx){
        //base case
        if(idx == arr.length - 1){
            return true;
        }

        if(arr[idx] < arr[idx + 1]){             //if(arr[idx] >= arr[idx + 1]){   array is unsorted
            //array is sorted till now           //return false;
            return isSorted(arr, idx + 1);       //}
        }else{                                   //return isSorted(arr, idx+1);
            return false;
        }
        
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }

}

//complexity: O(n)