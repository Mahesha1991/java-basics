package Basics;

class ThisIsNotInSync implements  Runnable{
    private Integer value = 0;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public void run() {

        increment();
        System.out.println("Not in Sync: " + Thread.currentThread().getName() + " Increment: " + getValue());
        decrement();
        System.out.println("Not in Sync: " + Thread.currentThread().getName() + " Decrement: " + getValue());
    }

    private void decrement() {
        value--;
    }

    private void increment() {
        value++;
    }
}

class ThisIsInSync implements  Runnable{
    private Integer value = 0;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public void run() {

        //Synchronized needs an object Reference to be locked
        //Ideally any object in this class will work. However, good to refer this object
        synchronized (this){
            increment();
            System.out.println("In Sync: " + Thread.currentThread().getName() + " Increment: " + getValue());
            decrement();
            System.out.println("In Sync: " + Thread.currentThread().getName() + " Decrement: " + getValue());
        }
    }

    private void decrement() {
        value--;
    }

    private void increment() {
        value++;
    }
}


public class Sync {

    // Volatile makes sure that the variables are read from the memory and updated directly to memory
    // In general, all variables will be read from Memory, updated in L1/L2 cache of CPU
    // Updates the values in the cache L1/L2 and gets it L3 (if needed ) and from there it will be put
    // back to the memory. If we use volatile it directly read and update memory itself
    // This increases the visibility; but does not guarantee synchronization.
    private volatile int a = 0;

    public static void main(String[] args) throws InterruptedException {


        ThisIsNotInSync isNotInSync = new ThisIsNotInSync();

        new Thread(isNotInSync, "One").start();
        new Thread(isNotInSync, "Two").start();
        new Thread(isNotInSync, "Three").start();
        new Thread(isNotInSync, "Four").start();


        //Just to show separation of Sync and Not in Sync. We can comment and run as well
        Thread.sleep(100);

        //Synchronized
        ThisIsInSync isInSync = new ThisIsInSync();

        new Thread(isInSync, "One").start();
        new Thread(isInSync, "Two").start();
        new Thread(isInSync, "Three").start();
        new Thread(isInSync, "Four").start();
    }
}
