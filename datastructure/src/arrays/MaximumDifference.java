package arrays;

import java.util.Arrays;

public class MaximumDifference {
    public static void main(String[] args) {
        //Given an array find the maximum difference between ith index and jth index
        //Such that j > i

        int arr[] = {34,34,34,3,2,57,30,52,46,2,4,6,2,4,4,2,6,26,6,2,45};
        //Here the max diff would be 57 - 2 = 55

        //Logic: As we move through the array, we keep updating min value and max difference
        int maximumDifference = arr[1] - arr[0];

        //Consider 1st element as min
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            maximumDifference = ( maximumDifference > arr[i] - min ? maximumDifference : arr[i] - min );
            min = ( min < arr[i] ? min : arr[i] );
        }

        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Maximum Difference: " + maximumDifference);
    }
}
