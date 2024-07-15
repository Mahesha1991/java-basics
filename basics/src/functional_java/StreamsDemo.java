package functional_java;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

//Streams provide an assembly line. Once it has collection/set of data, it will apply all the methods to the data
//Streams are independent of collections. It can be applied to arrays or files as well.
//We can have a stream with Stream.of method to start a pipeline to add methods to it.
//Streams are sequence of elements from a source
public class StreamsDemo {

    public static void main(String[] args) throws IOException {
        List<String> names = List.of("Foo", "Bar", "Hello");
        Stream<String> stream = names.stream();
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();

        //New shortcut way to write
        Stream<String> stream2 = names.stream();
        stream2.forEach(System.out::println);

        // Using Stream.of
        Stream.of("mango", "banana", "strawberry").forEach(System.out::println);

        //Using an Array
        int[] numbers = { 1, 2, 3, 4 };
        Arrays.stream(numbers).forEach(System.out::println);

        //Even we can have a Stream from a file
        Stream<String> lines = Files.lines(Paths.get("stream-file.txt"), StandardCharsets.UTF_8);
        lines.forEach(System.out::println);

        //generates infinite stream. Limit it with limit
        Stream.generate(new Random()::nextDouble)
                .limit(10)
                .forEach(System.out::println);

        //We can have an infinite iterator
        Stream.iterate(0, x -> x + 2)
                .limit(10)
                .forEach(System.out::println);

        //Convert Stream to List
        List<Integer> hundred = Stream.iterate(0, x -> x + 1)
                .limit(100)
                .toList();

        System.out.println(hundred);

    }
}
