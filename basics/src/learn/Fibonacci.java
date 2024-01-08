package learn;

import java.util.Scanner;

//Base f(0) = 0 and f(1) = 1
//In general for n number f(n) = f(n-1) + f(n-2)
public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        int n = 1;
        while(n > -1){
            System.out.print("Enter a number to find its fibonacci: ");
            Scanner sc;
            try {
                sc = new Scanner(System.in);
                n = sc.nextInt();
                if (n >= 0)
                    System.out.println("Fibonacci: " + fibonacci.calFibonacci(n));
                else
                    System.out.println("Input number should be >= 0");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private int calFibonacci(int n) {
        if (n <= 1)
            return n;
        return calFibonacci(n-1) + calFibonacci(n-2);
    }
}
