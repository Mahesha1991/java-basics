package functional_java;

public class Calculator {

    public static int doMathOperation(IntOperation op, int a, int b) {
       return op.doOperation(a, b);
    }

    public static void main(String[] args) {

        IntOperation addition = (x, y) -> x + y;
        IntOperation substraction = (x, y) -> x - y ;

        System.out.println(doMathOperation(addition, 5, 6));
        System.out.println(doMathOperation(substraction, 8, 6));

    }
}

@FunctionalInterface
interface IntOperation {
    int doOperation(int i, int j);
}