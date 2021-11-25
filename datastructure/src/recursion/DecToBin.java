package recursion;

import java.util.Scanner;

public class DecToBin {

    void getDecToBin(int n){
        if(n == 0)
            return;
        getDecToBin(n/2);
        System.out.print(n%2);
    }
    public static void main(String args[]){

        int n = 0;
        DecToBin db = new DecToBin();
        do{
            System.out.print("Enter Decimal Number (0 to exit): ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            if (n != 0)
                System.out.print("Binary Equivalent: ");
            db.getDecToBin(n);
            System.out.println();
        }while(n!=0);
    }
}
