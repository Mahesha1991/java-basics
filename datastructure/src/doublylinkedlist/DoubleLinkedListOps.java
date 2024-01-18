package doublylinkedlist;

import java.util.List;

public class DoubleLinkedListOps<T> {

    ListNode head = null;

    public void add(T data){
        ListNode temp = new ListNode(data);
        if(head == null){
            head = temp;
        }else{
            ListNode curr = head;
            while(curr.right != null)
                curr = curr.right;
            curr.right = temp;
            temp.left = curr;
        }
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.right;
        }
    }

    public void displayFromLast(){
        ListNode temp = head;
        while(temp.right != null)
            temp = temp.right;

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.left;
        }
    }
}
