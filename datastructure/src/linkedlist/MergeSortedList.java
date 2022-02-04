package linkedlist;

public class MergeSortedList {

    ListNode l1,l2;

    public ListNode sortLists(ListNode l1, ListNode l2){
        ListNode main = null;
        ListNode prev = null;

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }

        if(l1.data <= l2.data){
            main = prev = l1;
            l1 = l1.next;
        }else{
            main = prev = l2;
            l2 = l2.next;
        }

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                prev.next = l1; prev = l1; l1 = l1.next;
            }else{
                prev.next = l2; prev = l2; l2 = l2.next;
            }
        }
        if (l1 == null) prev.next = l2;
        else prev.next = l1;

        return main;
    }
    public static void main(String[] args) {
        MergeSortedList msl = new MergeSortedList();
        LinkedListOps llo = new LinkedListOps();
        msl.l1 = llo.sortedInsert(2000);
        msl.l2 = llo.sortedInsert(2500);

        llo.display(msl.l1);
        llo.display(msl.l2);

        ListNode sorted = msl.sortLists(msl.l1,msl.l2);

        llo.display(sorted);
    }
}
