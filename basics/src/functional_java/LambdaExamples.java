package functional_java;

public class LambdaExamples {

    public static void runner(Task task) {
        task.run();
    }
    public static void main(String[] args) {
        MathOperation increment = x -> x + 1;
        int result = increment.operation(10);
        System.out.println("result = " + result);

        MathOperation newLambda = num -> num * 2;
        System.out.println(newLambda.operation(10));

        newLambda = increment;
        System.out.println(newLambda.operation(5));

        Task task = () -> System.out.println("Running");
        runner(task);
        runner(() -> System.out.println("Running 2"));
    }
}

interface MathOperation {
    int operation(int x);
}

// Good to add the annotation so that we are marking this interface as
// functional interface (Extra safety check)
@FunctionalInterface
interface Task {
    void run();

    // We can have default method
    default int hello(){
        return 1;
    }
}

