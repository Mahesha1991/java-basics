package binayheap;

import java.util.Scanner;

public class HeapMain {
    public static void main(String args[]){
        HeapMain hm = new HeapMain();

        HeapOps ho = new HeapOps();

        System.out.print("Enter number of items in the Heap: ");
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();

        System.out.print("Generated Integer: ");
        for(int i = 0; i < items; i++){
            int data = (int) (Math.random() * items);
            System.out.print(data + " ");
            ho.insert(data);

        }
        System.out.print("\n");
        ho.display();

    }


}














