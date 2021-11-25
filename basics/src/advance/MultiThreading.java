package advance;

class Test extends Thread {

    public void run(){
        for(int i = 0; i < 100000; i++){
            System.out.println("Inside Test Thread " + i);
//            try {
//                sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
public class MultiThreading {

    public static void main(String args[]){
        Test t = new Test();
        t.start();  // At this point a thread is created with its own execution pipeline
        for(int i = 0; i < 100000; i++)
        System.out.println("In main " + i);
    }

}
