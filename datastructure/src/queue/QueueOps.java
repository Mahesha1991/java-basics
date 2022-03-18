package queue;

public class QueueOps {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    public void enQueue(int data){
        QueueNode temp = new QueueNode(data);
        if (front == null){
            front = rear = temp;
        }else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public void enQueueCount(int count){
        int multiplier = count < 10 ? 10 : count;
        for(int i = 0; i < count; i++){
             enQueue((int) (Math.random() * multiplier));
        }
    }

    public void display(){
        if (front == null){
            System.out.println("Queue is empty!");
            return;
        }
        QueueNode temp = front;
        while(temp != null){
            System.out.print(temp.data + " " );
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }

    public int deQueue(){
        if( front == null ){
            return Integer.MIN_VALUE;
        }
        int temp = front.data;
        front = front.next;
        if ( front == null){
            rear = null;
        }
        size--;
        return temp;
    }

}
