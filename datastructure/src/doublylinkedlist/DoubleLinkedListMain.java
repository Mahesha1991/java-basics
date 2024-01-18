package doublylinkedlist;

import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        DoubleLinkedListOps ops = new DoubleLinkedListOps();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the Doubly Linked List: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){
            ops.add((Math.random() * 1000));
        }
        ops.display();
        ops.displayFromLast();
    }
}
