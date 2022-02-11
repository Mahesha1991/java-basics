package circularlinkedlist;

public class ShowList {

    ListNode head = null;
    public static void main(String args[]){

        ShowList sl = new ShowList();
        CircularListOps clo = new CircularListOps();
        sl.head = clo.insert(5,false);
        clo.display(clo.head);

    }
}
