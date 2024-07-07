package functional_java;

public class LambdaExamples {
    public static void main(String[] args) {
        MathOperation increment = x -> x + 1;
        int result = increment.operation(10);
        System.out.println("result = " + result);

        MathOperation newLambda = num -> num * 2;
        System.out.println(newLambda.operation(10));

        newLambda = increment;
        System.out.println(newLambda.operation(5));
    }
}

interface MathOperation {
    int operation(int x);
}

interface AnotherOperation {
    int operation(int x);
}
