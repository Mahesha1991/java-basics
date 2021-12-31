package search;

import java.util.Arrays;

public class BinarySearch {


    int binary(int element, int given[],int low, int high){

        if (low > high)
            return -1;
        int mid = (low + high)/2;
        System.out.println("element = " + element + ", given = " + Arrays.toString(given) + ", low = " + low + ", mid = " + mid + ", high = " + high);
        if(given[mid] == element)
            return mid;
        else if (given[mid] > element)
            return binary(element,given,low,mid-1);
        else
            return binary(element,given,mid+1,high);
    }

    public static void main(String[] args){
        int arr[] = {10,20,30,40,50,60,70,75,85,95,105};

        BinarySearch bs = new BinarySearch();

        System.out.println(bs.binary(50,arr,0,arr.length-1));
    }
}
