package arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        //We need to find the most repeated element in the array and count the number of such element
        //This would work only if the majority element is > n/2 elements!!!

        int arr[] = {3,4,2,4,5,2,6,4,4,4,7,4,2,8,6,4,4,4,3,2,4,4,1,8};

        int result = 0;
        int count = 1;

        //This would give the possible max repeated element.
        for(int i = 1; i < arr.length; i++){
            if(arr[result] == arr[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                result = i;
                count = 1;
            }
        }

        System.out.println("Given array: " + Arrays.toString(arr));
        System.out.println("Majority Element: " + arr[result]);
    }
}
