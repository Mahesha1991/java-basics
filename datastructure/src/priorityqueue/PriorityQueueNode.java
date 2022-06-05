package priorityqueue;

import java.util.ArrayList;

public class PriorityQueueNode {
    ArrayList<Integer> heapNode;

    public PriorityQueueNode(){
        heapNode = new ArrayList<>();
    }

    public ArrayList<Integer> getHeapNode(){
        return heapNode;
    }

}
