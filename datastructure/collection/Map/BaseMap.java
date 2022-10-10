package Map;

import java.util.HashMap;
import java.util.Map;

public class BaseMap {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        
        m.put("gfg",10);
        m.put("abc",20);
        for( Map.Entry<String, Integer> e : m.entrySet() )
            System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(m.getOrDefault("def",0));
        System.out.println(m.getOrDefault("abc", 0));
    }
}
