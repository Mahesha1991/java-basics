package arrays;

import java.util.Scanner;

public class SecondLarge {

    public static void main(String []args){

        SecondLarge sl = new SecondLarge();
        int block[]  = sl.intro();
        sl.printArray(block);
        sl.findSecondLarge(block);
    }

    public int [] intro(){

        System.out.println("Enter array length (more than 2): ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter numbers: ");
        int element [] = new int [n];

        for(int i = 0; i < element.length; i++)
            element[i] = sc.nextInt();

        return element;
    }

    public void printArray(int print[]){

        System.out.println("Printing Elements: ");
        for (int i: print) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void findSecondLarge(int secLarge[]){

        int large = secLarge[0];
        int secondLarge = Integer.MIN_VALUE;

        for(int i = 1; i < secLarge.length; i++){
            if(secLarge[i] > large){
                secondLarge = large;
                large = secLarge[i];
            }else if(secLarge[i] != large){
                if(secLarge[i] > secondLarge)
                    secondLarge = secLarge[i];
            }
        }
        System.out.println("Second Largest element is : " + secondLarge);
    }
}
