package linkedlist;

public class EvenOdd {

    ListNode head,evenOdd;

    public ListNode separateEvenOdd(){

        ListNode traverse,evenStart,oddStart,evenEnd,oddEnd;
        evenStart = oddStart = evenEnd = oddEnd = null;
        traverse = head;

        while(traverse != null){
            if(traverse.data%2 == 0){
                if(evenStart == null){
                    evenStart = evenEnd = traverse;
                    traverse = traverse.next;
                    continue;
                }
                evenEnd.next = traverse;
                evenEnd = traverse;
            }else{
                if(oddStart == null){
                    oddStart = oddEnd = traverse;
                    traverse = traverse.next;
                    continue;
                }
                oddEnd.next = traverse;
                oddEnd = traverse;
            }

            traverse = traverse.next;
        }

        // As we are adding Even, then odd, we need to make odd end tail to null
        oddEnd.next = null;
//        LinkedListOps llo = new LinkedListOps();
//        llo.display(oddStart);
        evenEnd.next = oddStart;

        return evenStart;
    }
    public static void main(String args[]){

        EvenOdd eo = new EvenOdd();
        LinkedListOps llo = new LinkedListOps();
        eo.head = llo.insert(50,true);
        llo.display(eo.head);
        eo.evenOdd = eo.separateEvenOdd();
        llo.display(eo.evenOdd);
    }
}
