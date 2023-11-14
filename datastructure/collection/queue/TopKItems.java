package queue;

import java.util.*;

public class TopKItems {

    public static void main(String[] args) {
        TopKItems kItems = new TopKItems();
        System.out.println("Enter 10 number: ");
        Scanner sc = new Scanner(System.in);
        int i =  0;
        int sum = 0;
        List<Integer> arr = new ArrayList<>();
        while(i < 10){
            arr.add(sc.nextInt());
            i++;
        }

        System.out.println("Entered numbers are: " + arr.toString());

        //Considering sum of top three elements
        PriorityQueue pq = new PriorityQueue<>(3, Collections.reverseOrder());
        pq.add(arr.get(0));
        pq.add(arr.get(1));
        pq.add(arr.get(2));

        //Need to check on the logic
        for(int j = 3; j < arr.size(); j++){
            if(Integer.parseInt(pq.peek().toString()) < arr.get(j)){
                pq.poll();
                pq.add(arr.get(j));
            }
        }
        System.out.println("Top(Max) Element: " + pq.toString());
        while(!pq.isEmpty()){
            sum = sum ;
        }

     }
}
