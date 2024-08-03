package Basics;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class UnderstandingSemaphores {

    public static void main(String[] args) {

        /*
        Semphore are like Locks, but allows to run more threads.
        In case of Locks, we can create Locks object and when a thread locks on Lock object
        then no other threads can run that block of code. Its like semaphores with 1 thread
        In the below, only two threads could be run at a time.
         */
        Semaphore semaphore = new Semaphore(2);
        //If we want to execute the threads in order then
        //Semaphore semaphore = new Semaphore(2,true);

        FirstMain firstMain = new FirstMain();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter n: ");
            long num = in.nextLong();
            if (num == 0) break;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("Num of primes under " + num + " is : " + firstMain.primeNumber(num));
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        semaphore.release();
                    }
                }
            };

            Thread thread = new Thread(r);
            // If there is a long-running thread then when the control move out of Main thread (main method)
            // then the execution of the threads stop.
            thread.setDaemon(true);
            thread.start();
        }

    }
}

