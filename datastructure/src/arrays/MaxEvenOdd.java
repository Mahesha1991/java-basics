package arrays;

import java.util.Arrays;

public class MaxEvenOdd {
    public static void main(String[] args) {
        //Given an array need to find the max sub array with alternating even odd.

        int arr[] = {3,4,5,6,4,3,2,6,7,8,56,4,3,2,4,6,7,8,9,2,1};

        int result = 1;
        int currentMax = 1;

        for(int i = 1; i < arr.length; i++){
            if((arr[i]%2 == 0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)){
                currentMax++;
            }else{
                currentMax = 1;
            }
            if(currentMax > result){
                result = currentMax;
            }
        }

        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Maximum alternating even odd numbers: " + result);

    }
}
