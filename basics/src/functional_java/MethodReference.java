package functional_java;


import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//Lambda Calling Other Function. The Syntax could be written in different way
public class MethodReference {
    public static void main(String[] args) {

        UnaryOperator<String> trim = str -> str.trim();
        System.out.println(trim.apply("             Hello World    "));

        //This is a method reference. Lambda calling with shortcut
        UnaryOperator<String> trimWithMethodReference = String::trim;
        System.out.println(trimWithMethodReference.apply("   This is another String     "));

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        Supplier<Double> random2 = Math::random;
        System.out.println(random2.get());

        Function<Person, String> getName = p -> p.getName();
        System.out.println(getName.apply(new Person("John")));

        Function<Person, String> getNameWithMethodReference = Person::getName;
        System.out.println(getNameWithMethodReference.apply(new Person("Cena")));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
