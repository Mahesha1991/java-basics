package learn;

import java.util.*;

public class Iterate {

    public static void main(String[] args) {

        Map<String, List<String>> m = new HashMap<>();
        List<String> abc = new ArrayList<>();
        abc.add("hello");
        abc.add("world");
        abc.add("this");

        m.put("abc", abc);
        List<String> bcd = m.get("abc");

        Iterator i = bcd.iterator();

        while(i.hasNext()){
            String s = (String) i.next();
            if(s.startsWith("w")){
                i.remove();
            }
        }

        bcd.clear();
        bcd.clear();

        System.out.println(m);
    }
}
