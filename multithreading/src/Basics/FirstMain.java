package Basics;

import java.util.Scanner;

public class FirstMain {

    public static void main(String[] args) throws InterruptedException {

        FirstMain firstMain = new FirstMain();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter n: ");
            long num = in.nextLong();
            if (num == 0) break;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Num of primes under " + num + " is : " + firstMain.primeNumber(num));
                }
            };

            Thread thread = new Thread(r);
            // If there is a long-running thread then when the control move out of Main thread (main method)
            // then the execution of the threads stop.
            thread.setDaemon(true);
            thread.start();
        }

    }

    public long primeNumber(long n){
        long num = 0;
        if (n==2 || n==1){
            return 1;
        }
        for (int i = 3; i <= n; i++){
            int j = i;
            boolean isPrime = true;
            for (int k = 2; k < j ; k++){
                if(j%k == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                num++;
            }
        }

        return num+1;
    }
}