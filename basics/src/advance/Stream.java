package advance;

import java.util.Arrays;

public class Stream {

    // Streams help to reduce number of lines in the code and provides variety of function to perform on collections, custom objects
    public static void main(String []args){
        int[] arr = {30,20,15,34,25,17};

        Arrays.stream(arr)                        // Initiator
                .filter(x -> x % 2 == 0)          // filter streams ( here lambda expression is used) .There could be many of these
                .forEach(System.out::println);    // Terminator.

        double avg = Arrays.stream(arr)
                .average()                        // There are may predefined methods like this.
                .getAsDouble();
        System.out.println(avg);

    }
}
