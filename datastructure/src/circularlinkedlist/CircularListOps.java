package circularlinkedlist;

public class CircularListOps {

    ListNode head = null;
    public ListNode insert(int count, boolean random){
        ListNode temp;
        ListNode traverse;
        int multiplier = count < 10 ? 10 : count;
        for(int i = 0; i < count; i++){
            if(random){
                temp = new ListNode((int)(Math.random()*multiplier));
            }else{
                temp = new ListNode(-1);
            }

            if (head == null){
                head = temp;
                head.next = head;
            }else{
                traverse = head;
                while(traverse.next != head){
                    traverse = traverse.next;
                }
                traverse.next = temp;
                temp.next = head;
            }
        }
        return head;
    }

    public void display(ListNode traverse){
        if(traverse == null) return;
        ListNode mainTop = traverse;
        do{
            System.out.print(traverse.data + " ");
            traverse = traverse.next;
        }while(traverse != mainTop);
        System.out.println();
    }
}
