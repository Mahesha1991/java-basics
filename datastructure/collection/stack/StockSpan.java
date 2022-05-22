package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class StockSpan {
    public static void main(String args [] ){

        StockSpan ss = new StockSpan();

        ArrayList<Integer> item = new ArrayList<>();
        System.out.println("Enter the number of Stock span: ");
        Scanner sc = new Scanner(System.in);
        int stockSpan = sc.nextInt();

        for(int i = 0; i < stockSpan; i++){
            item.add((int) (Math.random() * stockSpan));
        }

        for(int i = 0; i < stockSpan; i++){
            System.out.print(item.get(i) + " ");
        }
        System.out.println();
        ss.printSpan(item);
    }

    public void printSpan(ArrayList item){
        // ArrayDeque is the recommended way to create stack for single threaded code
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        int span = 1;
        System.out.print(span + " ");

        for(int i = 1; i < item.size(); i++){
            while(stack.isEmpty() == false && (int) item.get(stack.peek()) <=  (int) item.get(i)){
                stack.pop();
            }
            span = (stack.isEmpty()) ? (i+1) : (i - stack.peek());
            System.out.print(span + " ");
            stack.push(i);
        }
    }
}
