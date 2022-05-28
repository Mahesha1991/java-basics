package queue;

import java.util.*;

/* Given an array of integers and sum ( number ). How many maximum number of items can be bought until the sum gets over */
public class PriorityQueueMaxSum {

    int totalItems = 0;
    int totalSum = 0;
    List<Integer> itemList = new ArrayList<>();
    public static void main(String args[]){
        PriorityQueueMaxSum pqms = new PriorityQueueMaxSum();
        pqms.getInfo();
        pqms.getMaxNumItems();
    }
    public void getMaxNumItems(){
        int actualItems = 0;
        int sum = totalSum;
        //This will create Min Heap. For Max Heap we need to pass Collections.reverseOrder() while initializing priorityqueue constructor
        PriorityQueue<Integer> allList= new PriorityQueue<Integer>(itemList);

        while(sum > 0 && allList.isEmpty() == false && allList.peek() <= sum){
            sum = sum - allList.poll();
            actualItems ++;
        }
        System.out.println("Total number of items that can be purchased with the Sum " + totalSum + " is: " + actualItems);
    }
    public void getInfo(){
        System.out.print("Enter the number of items: ");
        Scanner sc = new Scanner(System.in);
        totalSum = totalItems = sc.nextInt();
        for(int i = 0; i < totalItems; i++){
            itemList.add((int) (Math.random() * totalItems));
        }
        System.out.print("Generated List: ");
        for(int i = 0; i < itemList.size(); i++){
            System.out.print(itemList.get(i) + " ");
        }
        System.out.print("\n");
    }
}
