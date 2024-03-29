package learn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ascii {
    public static void main(String args[]){

        char num = ' ';
        Scanner sc = new Scanner(System.in);

        //Bug in logic needs to be fixed
        while(num != 'e' && num != 'a'){
            System.out.print("Enter a number to show its ASCII value (Enter 'e' to exit or 'a' to print all): ");

            try{
                num = (char) sc.nextShort();
            } catch (InputMismatchException in){
                num = (char) 'a';
            }

            if(num != 'e' && num != 'a')
                System.out.printf("%c\n\n", num);

        }

        if(num == 'a'){
            for(short i = 0; i<128; i++){
                System.out.printf("%d --> %c\n", i,i);

            }
            System.out.println();
        }

    }
}
