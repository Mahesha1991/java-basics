package functional_java;

import java.util.function.*;

// Take one argument and returns nothing (It consumes)

// Takes no argument and return something (It supplies)

// Takes one argument and predicts true or false


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

        // Similaryly we have BiFuncation -> Takes two input arguments and one return type
        // BiConsumer -> Takes two input arguments and returns nothing
        // BiPredicate -> Takes two input arguments and returns boolean
        // There is no BiSupplier as Supplier will not take any argument

        // When we have same input and output (Function) -> same argument and return value type
        UnaryOperator<Integer> increment = x -> x + 1;
        System.out.println(increment.apply(10));

        // Same with BinaryOperator


    }
}

