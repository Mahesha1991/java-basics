package queue;

public class QueueMain {
    public static  void main(String arg[]){
        QueueMain qm = new QueueMain();
        QueueOps qn = new QueueOps();

        //qn.enQueue(20);
        //qn.enQueue(30);
        qn.enQueueCount(10);
        qn.display();
        for( int i = 0; i < 5; i++){
            System.out.print(qn.deQueue() + " ");
        }
        System.out.println();
        qn.display();
        System.out.println("Queue Size: " + qn.getSize());
    }
}
