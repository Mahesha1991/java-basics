package binayheap;

//This class is for Min Heap Operation.
//Min heap is displayed as Complete Binary Tree ( Left to right Nodes are filled )
//However, they can/are (be) implemented as Arrays.

/* To get left child index : (2i + 1)
   To get right child index: (2i + 2)
   To get parent floor of : ( (i-1) / 2 )
 */

import java.util.ArrayList;
import java.util.Iterator;

public class HeapOps {

    private ArrayList<Integer> heapNode;

    public HeapOps(){
        heapNode = new HeapNode().getHeapNode();
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

    public void display(){
        Iterator it = heapNode.iterator();
        System.out.print("Heap: ");
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
