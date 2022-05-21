package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveAndPrint {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(5);
        list.add(70);
        list.add(80);
        removeAndPrint(list);

    }

    static void removeAndPrint(LinkedList list) {
        // We need to use iterator if we need to remove and continue the loop
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer n = (Integer) it.next();
            if (n.equals(10)) {
                it.remove();
                System.out.println(n);
            }
        }
    }
}
