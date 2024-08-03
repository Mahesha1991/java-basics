package Basics;


/* Liveness

Continuous flow of code
DeadLock ->

1. thread1-> synchronized (obj1){
    //..
    synchronized (obj2){
    }
   }

 thread2 -> synchronized (obj2){
    //..
    synchronized (obj1){
    }
   }

 2. Circular synchronized deadlock while a thread is locked on obj1, then obj2 and then obj1
 3. Thread.join() where two thread waiting on one another to complete

 LiveLock ->
 To solve deadlock we can introduce timed waiting. However,
 if thread 1 gets lock on obj1
 thread 2 gets lock on obj2

 if now thread 1 wants to get lock on obj2 and thread 2 wants to get lock on obj1,
 then there is deadlock.
 If we introduce waiting timing then both these thread will sleep and then again tries to get the lock
 and then sleep and get lock and this continues

 Starvation ->
 Thread with lower priority will never start as new threads with higher priority keeps getting executed

 */
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
        /*
        Either we could use synchronized or we could use Locks. With locks we need to lock and unlock
        synchronized handle this automatically
         */
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
