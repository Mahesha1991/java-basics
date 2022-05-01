package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String args[]){
        List<Integer> al =  Arrays.asList(34, 23, 456, 234, 234, 123, 23, 234, 46, 10, 45, 2, 3, 4, 5, 6, 7);
        al.forEach(x -> System.out.println(x));

        al.stream().filter(x -> x > 12).filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println("The sorted element is: ");
        al.stream().filter(x -> x > 12).filter(x -> x % 2 == 0).sorted().forEach(System.out::println);


        int arr[] = {30,40,60};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        //Infinite Stream

        System.out.println("Infinite Stream: ");
        Stream.iterate(1, x -> x + 1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);
    }
}
