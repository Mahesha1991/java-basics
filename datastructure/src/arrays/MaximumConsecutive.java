package arrays;

import java.util.Arrays;

public class MaximumConsecutive {
    public static void main(String[] args) {
        //Here we need to calculate maximum consecutive 1s

        int arr[] = {1,1,1,1,0,0,1,0,1,0,0,0,1,1,1,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,1};

        int mainCounter = 0;
        int tempCounter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                //Reset the temporary counter and check the max for main Counter
                tempCounter = 0;
            }else{
                tempCounter++;
                mainCounter = ( mainCounter > tempCounter ? mainCounter : tempCounter );
            }
        }

        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Maximum Consecutive 1s: " + mainCounter);
    }
}
