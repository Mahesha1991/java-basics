package learn;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String args[]){

        System.out.print("Enter the number to convert to binary: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        //String bin = "";
        StringBuilder bin = new StringBuilder();
        while(num > 0){
            bin.insert(0,num % 2);
            num = num / 2;
        }
        System.out.printf("%32s",bin);

    }
}
