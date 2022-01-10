package linkedlist;

public class ReverseList {

    ListNode node;
    void display(){
        ListNode traverse = node;
        while(traverse != null){
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }
        System.out.println();
    }

    public void reverse(){
        ListNode curr = node;
        ListNode prev = null;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        node = prev;
    }
    public static void main(String args[]){
        ReverseList rl = new ReverseList();
        rl.node = new ListNode(10,true);
        rl.display();
        rl.reverse();
        rl.display();
    }
}
