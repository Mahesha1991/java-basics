package linkedlist;

public class ListNode {

    ListNode next;
    int data;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }

    ListNode(int count, boolean dynamic){

        int multiplier = count < 10 ? 10 : count;
        for(int i = 0; i < count; i++){
            if (i ==0 ){
                this.data = data;
                this.next = null;
            }
            ListNode temp = new ListNode((int)(Math.random()*multiplier));
            ListNode traverse = this.next;
            if (traverse == null){
                this.next = temp;
                continue;
            }
            while(traverse.next != null){
                traverse = traverse.next;
            }
            traverse.next = temp;
        }
    }
}
