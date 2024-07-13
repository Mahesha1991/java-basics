package functional_java;


import java.util.function.Function;

// Chaining of Lambda functions
public class LambdaComposablity {

    public static void main(String[] args) {
        Function<Integer, Integer> increment = x -> x + 1;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        //Double and increment by 1
        System.out.println(increment.apply(doubleIt.apply(10)));

        //Better way to chain is to use andThen and compose (rearly used)
        //andThen helps to chain the lambdas
        Function<Integer,Integer> combine = doubleIt.andThen(increment);
        System.out.println(combine.apply(15));

        //Another example where remove leading and trailing spaces and then make it uppercase
        String name = "  hello   ";
        Function<String, String> trimLeading = String::stripLeading;
        System.out.println(trimLeading.andThen(String::stripTrailing).andThen(String::toUpperCase).apply(name));
    }
}
