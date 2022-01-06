package linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class SortedList {

    ListNode node;
    void insert(int element){
        ListNode temp = new ListNode(element);
        if (node == null){
            node = temp;
            return;
        }
        ListNode traverse = node;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = temp;
        return;
    }

    void display(){
        ListNode traverse = node;
        while(traverse != null){
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
        System.out.println();
    }

    void sortedInsert(int element){
        ListNode temp = new ListNode(element);
        if (node == null){
            node = temp;
            return;
        }

        if(node.data > element){
            temp.next = node;
            node = temp;
            return;
        }

        ListNode traverse = node;

        while(traverse.next != null && traverse.next.data < element){
            traverse = traverse.next;
        }
        temp.next = traverse.next;
        traverse.next = temp;
        return;

    }

    public static void main(String [] args){
        long start = System.currentTimeMillis();
        SortedList sl = new SortedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int count = sc.nextInt();
        int multiplier = count < 10 ? 10 : count;
        for(int i = 0; i < count; i++){
            sl.sortedInsert((int)(Math.random()*multiplier));
        }
        sl.display();
        long end = System.currentTimeMillis();
        System.out.println("Total time taken: " + ((end-start)/1000f) + " seconds");
    }
}
