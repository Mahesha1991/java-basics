package functional_java;

import java.util.function.Function;

// Take one argument and returns nothing (It consumes)
import java.util.function.Consumer;

// Takes no argument and return something (It supplies)
import java.util.function.Supplier;

// Takes one argument and predicts true or false
import java.util.function.Predicate;

public class JDKFunctionalInterface {

    public static void main(String[] args) {

        // Take one argument and returns one value
        Function<Integer, Integer> foo = x -> x + 1;
        System.out.println(foo.apply(5));

        Consumer<Integer> numPrint = num -> System.out.println("Number is " + num);
        numPrint.accept(20);

        Supplier<Double> random = () -> Math.random();
        //Supplier<Double> random = Math::random; (Other Way of defining)
        System.out.println(random.get());

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(23));


    }
}

