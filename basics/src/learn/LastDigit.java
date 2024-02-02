package learn;

import java.util.Scanner;

public class LastDigit {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its units place: ");
        int num = sc.nextInt();
        num = num % 10;
        System.out.printf("Last digit is : %d",num);
        LastDigit ld = new LastDigit();

        System.out.println(ld.getClass().getName());
    }
}