package priorityqueue;

import java.util.Scanner;

public class PriorityQueueMain {
    public static void main(String args[]){
        PriorityQueueOps priorityQueueOps = new PriorityQueueOps();

        System.out.print("Enter number of items in the Heap: ");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        System.out.print("Generated Integer: ");
        for(int i = 0; i < items; i++){
            int data = (int) (Math.random() * items);
            System.out.print(data + " ");
            priorityQueueOps.insert(data);

        }
        System.out.print("\n");
        priorityQueueOps.display();
        System.out.print("\n");

        priorityQueueOps.pop();
        priorityQueueOps.pop();
        priorityQueueOps.pop();
        priorityQueueOps.pop();
        priorityQueueOps.pop();

        priorityQueueOps.display();
    }
}
