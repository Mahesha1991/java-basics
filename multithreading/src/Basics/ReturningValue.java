package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class ReturningValue {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future> futureList = new ArrayList<>();

        FirstMain ReturningValue = new FirstMain();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Enter n: ");
            long num = in.nextLong();
            if (num == 0) break;

            /*
            If we need to return value from the thread, then we need to use Callable Object
             */
            Callable<String> c = new Callable() {

                public String call() throws Exception {
                   return "Prime Numbers till " + num + " : " + ReturningValue.primeNumber(num);
                }
            };

            /*
            Thread Class does not support Callable ( only Runnable is supported ).
            We need to use ExecutorService.
            We need to use Future Class and get Method to catch the value.
            However, if we do get on the Future object it will wait until that thread returns value
             */
            Future<String> primeNumberFuture = executorService.submit(c);
            //primeNumberFuture.get() --> This will wait until thread is completed
            futureList.add(primeNumberFuture);
            Iterator<Future> iterator = futureList.iterator();
            while(iterator.hasNext()){
                Future f = iterator.next();
                if (f.isDone()){
                    System.out.println(f.get());
                    iterator.remove();
                }
            }
        }
        executorService.close();

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
