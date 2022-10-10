package set;

import java.util.*;

public class BaseSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);

        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("what");
        hs.add("where");
        System.out.println(hs);

        //primite type cannot be added to hashset. This need to be changed to wrapper class
        int baseArray[] = {45,65,34,67,89,23,45,32,23};
        HashSet<Integer> hi = new HashSet(Arrays.asList(baseArray));
        // This prints object value/address: [[I@7a81197d]
        System.out.println(hi);

        Integer base2Array[] = {34,56,76,45,43,23,21,456,23};
        HashSet<Integer> hii = new HashSet<>(Arrays.asList(base2Array));
        System.out.println(hii);



        Iterator<Integer> i = hi.iterator();
        while(i.hasNext())
            System.out.println(i.next() instanceof Integer);

        System.out.println("i = " + i);


    }
}
