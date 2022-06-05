package priorityqueue;

//This class is for Min Heap Operation. (Priority Queue is same as Min Heap )
//Min heap is displayed as Complete Binary Tree ( Left to right Nodes are filled )
//However, they can/are (be) implemented as Arrays.

/* To get left child index : (2i + 1)
   To get right child index: (2i + 2)
   To get parent floor of : ( (i-1) / 2 )
 */

import java.util.ArrayList;
import java.util.Iterator;

public class PriorityQueueOps {

    private ArrayList<Integer> heapNode;

    public PriorityQueueOps(){
        heapNode = new PriorityQueueNode().getHeapNode();
    }

    public void insert(int element){
        if(heapNode.size() == 0){
            heapNode.add(element);
            return;
        }

        //We need to add the element to last in array and then heapify
        int currentSize = heapNode.size();
        heapNode.add(element);

        heapify(currentSize, (int) (currentSize - 1) / 2);
    }

    private void heapify(int currentIndex, int parentIndex) {
        /* In heapify we compare the element to the parent. In case of MinHeap,
        if the element is greater, then we will swap it with parent.
        We keep doing this until we hit index 0
         */

        while(currentIndex != 0 && heapNode.get(parentIndex) > heapNode.get(currentIndex)){

            int temp = heapNode.get(parentIndex);
            heapNode.set(parentIndex,heapNode.get(currentIndex));

            heapNode.set(currentIndex,temp);

            currentIndex = parentIndex;
            parentIndex = (int) (parentIndex - 1) / 2;

        }
    }

    public int pop(){
        if(heapNode.isEmpty()){
            return Integer.MIN_VALUE;
        }
        if(heapNode.size() == 1){
            return heapNode.remove(0);
        }
        int first = heapNode.get(0);
        int last = heapNode.get(heapNode.size()-1);
        heapNode.set(0,last);
        heapNode.remove(heapNode.size()-1);
        fixHeapify(last);
        return first;
    }

    private void fixHeapify(int last) {
        int leftIndex = 1;
        int rightIndex = 2;
        int currentIndex = 0;

        // Needs improvement in the logic if possible
        while(leftIndex <= heapNode.size()-1){
            if(heapNode.get(currentIndex) > heapNode.get(leftIndex)){
                if(rightIndex <= heapNode.size()-1 && (heapNode.get(currentIndex) > heapNode.get(rightIndex) && heapNode.get(leftIndex) > heapNode.get(rightIndex))){
                    heapNode.set(currentIndex,heapNode.get(rightIndex));
                    heapNode.set(rightIndex,last);
                    currentIndex = rightIndex;
                }else{
                    heapNode.set(currentIndex,heapNode.get(leftIndex));
                    heapNode.set(leftIndex,last);
                    currentIndex = leftIndex;
                }
            }else if( rightIndex <= heapNode.size()-1 && heapNode.get(currentIndex) > heapNode.get(rightIndex)){
                heapNode.set(currentIndex,heapNode.get(rightIndex));
                heapNode.set(rightIndex,last);
                currentIndex = rightIndex;
            }else{
                break;
            }
            leftIndex = currentIndex * 2 + 1;
            rightIndex = currentIndex * 2 + 2;
        }
    }

    public int peek(){
        if(heapNode.isEmpty()){
            return Integer.MIN_VALUE;
        }
        return heapNode.get(0);
    }

    public void display(){
        Iterator it = heapNode.iterator();
        System.out.print("Heap: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
