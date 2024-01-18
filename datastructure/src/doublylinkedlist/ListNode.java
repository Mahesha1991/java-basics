package doublylinkedlist;

public class ListNode<T> {

    T data;
    ListNode left;
    ListNode right;

    public ListNode(T info){
        this.data = info;
        left = null;
        right = null;
    }
}
