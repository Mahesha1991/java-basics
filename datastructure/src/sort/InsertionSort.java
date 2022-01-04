package sort;

import java.util.Arrays;

public class InsertionSort {

    void insertionSort(int arr[]){

        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int arr[] = {34,546,23,45,34,54,234,465};
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println("args = " + Arrays.toString(arr));
    }
}
