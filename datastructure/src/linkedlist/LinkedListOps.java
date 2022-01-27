package linkedlist;

public class LinkedListOps {

    ListNode head;

    public ListNode insert(int count, boolean random){

        head = null;
        ListNode traverse;
        int multiplier = count < 10 ? 10 : count;
        for(int i = 0; i < count; i++){
            ListNode temp;
            if(random){
                temp = new ListNode((int)(Math.random()*multiplier));
            }else{
                temp = new ListNode(-1);
            }
            if(head == null){
                head = temp;
                continue;
            }
            traverse = head;
            while(traverse.next != null){
                traverse = traverse.next;
            }
            traverse.next = temp;
        }
        return head;
    }

    public ListNode sortedInsert(int count){

        head = null;
        int multiplier = count < 10 ? 10 : count;
        ListNode traverse;
        for(int i = 0; i < count; i++){
            ListNode temp = new ListNode((int)(Math.random()*multiplier));
            if (head == null){
                head = temp;
                continue;
            }
            if (head.data > temp.data){
                temp.next = head;
                head = temp;
                continue;
            }
            traverse = head;
            while(traverse.next != null && traverse.next.data < temp.data ){
                traverse = traverse.next;
            }
            temp.next = traverse.next;
            traverse.next = temp;
        }
        return head;
    }

    public void display(ListNode traverse){
        while(traverse != null){
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
        System.out.println();
    }
}
