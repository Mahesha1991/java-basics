package linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RemoveAndPrint {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        ArrayList<Integer> a = new ArrayList();


        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        a.remove((Object)3);
        System.out.println(a);

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
