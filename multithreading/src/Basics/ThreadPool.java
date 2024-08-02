package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) throws InterruptedException {


        /*
        Creating Multiple Threads is a resource intense work.
        Also managing threadpool ourself is a difficult job.
        Hence we use ExecutorService interface to have various different executors
        FixedThreadPool Service will use blocking queue
         */
        //ExecutorService executorService = Executors.newFixedThreadPool(3);
        /*
        If we specifically use ThreadPool services then we can get the details about thrads
        */
        ThreadPoolExecutor executorService = (ThreadPoolExecutor)  Executors.newFixedThreadPool(3);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable run = () -> {
            System.out.println("Active Threads : " + executorService.getActiveCount() + " Completed Threads: " + executorService.getCompletedTaskCount());
        };
        scheduledExecutorService.scheduleAtFixedRate(run, 2, 10, TimeUnit.SECONDS);

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
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }
            };
            executorService.execute(r);
        }

    }

    private static void printThreads(List<Thread> threadList) {
        threadList.forEach(thread -> System.out.print(thread.getState() + " "));
        System.out.println();
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
