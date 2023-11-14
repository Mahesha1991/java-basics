package arrays;

import java.util.Arrays;

public class RotateNPlace {

    public static void main(String args[]){

        int arr[] = {45,65,23,2,67,23,2,3,42,4,5,7,8,9,9};
        int rotatePlace = 3;
        System.out.println("Given " + Arrays.toString(arr));

        RotateNPlace rotateNPlace = new RotateNPlace();
        rotateNPlace.moveLeft(arr, rotatePlace);
    }

    private void moveLeft(int[] arr, int rotatePlace) {
        int length = arr.length;

        // First reverse rotatePlace positions
        rotate(arr,0,rotatePlace-1);

        System.out.println("Changing Rotate place: " + Arrays.toString(arr));

        // Next reverse remaining positions
        rotate(arr,rotatePlace,length-1);
        System.out.println("Reversing remainning position: " + Arrays.toString(arr));

        // Lastly, reverse everything
        rotate(arr,0,length-1);
        System.out.println("Final: " + Arrays.toString(arr));
    }

    private void rotate(int[] arr, int low, int high) {
        while(low < high){
            int temp = arr[low];
            arr[low] =arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }



}
