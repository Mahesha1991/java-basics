package arrays;

import java.util.Arrays;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        //Find the maximum sum of consecutive sub array
        // For a = [1,2,3]. Consecutive Sub arrays are
        // [1], [1,2] , [2,3] and [1,2,3]

        int arr[] = {-7,-6,9,9,9,4,-3};
        int maxSum = arr[0];
        int result = arr[0];

        for(int i = 1; i < arr.length; i++){
            maxSum = (maxSum + arr[i] > arr[i] ? maxSum + arr[i] : arr[i]);
            result = (maxSum > result ? maxSum : result);
        }

        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Maximum sum of consecutive sub array: " + result);

    }
}
