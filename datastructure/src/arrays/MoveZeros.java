package arrays;

import java.util.Arrays;

//Move Zeros to Last with bigO(n)
public class MoveZeros {

    public static void main(String[] args) {
        int arr[] = {0,4,5,2,5,6,0,6,5,0,7,6,0,7,6,0,0,0,0,6,45,5,4,4,0};
        System.out.println("Given: " + Arrays.toString(arr));
        //Here we keep a counter when a non-zero number is visited swap with the existing loop index.
        //And increase the counter.
        int arrLength = arr.length;
        int count = 0;

        for(int i = 0; i < arrLength; i++){
            if(arr[i] != 0){
                //swap with counter index and increment the counter
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        System.out.println("Result: " + Arrays.toString(arr));
    }

}
