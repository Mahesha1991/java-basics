package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class FutureCompletable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        FutureCompletable futureCompletable = new FutureCompletable();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter n: ");
            long num = in.nextLong();
            if (num == 0) break;

            /*
            With CompletableFuture we need to worry about the thread returns
            We can keep starting new thread and the thenAccept method will be run when the
            threads returns the value. If we need thread pooling then we can use
            ExecutorService as second method to supplyAsync Method
             */
            CompletableFuture.supplyAsync(() -> futureCompletable.primeNumber(num))
                    .thenAccept(b -> System.out.println(b));

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

