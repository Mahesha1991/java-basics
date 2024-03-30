package Map;

import java.util.HashMap;
import java.util.Map;

public class CustomHashMap {

    public static void main(String[] args) {
        Map<Key,Value> map = new HashMap<>();
        map.put(new Key(1), new Value("hello"));
        map.put(new Key(1), new Value("World"));

        Key test = new Key(1);

        System.out.println(map);

        //Below will return null
        System.out.println(map.get(test));
    }

    static class Key{
        int num;

        Key(int num){
            this.num = num;
        }

        @Override
        public String toString() {
            return "" + num;
        }
    }

    static class Value{
        String value;
        Value(String value){
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
}
