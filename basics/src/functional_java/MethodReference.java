package functional_java;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//Lambda Calling Other Function. The Syntax could be written in different way
//This is like a shortcut to that calling function.
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

        Person p1 = new Person("foo");
        Person p2 = new Person("poo");

        //BiPredicate<Person, Person> equalPerson = (per1, per2) -> per1.equals(per2);
        // Same as
        BiPredicate<Person, Person> equalPerson = Person::equals;
        System.out.println(equalPerson.test(p1,p2));

        Function<List<String>, Integer> getCount = List::size;
        System.out.println(getCount.apply(new ArrayList<>()));

        Function<List<String> , Collection<String>> deDepulicate = list -> new HashSet<>(list);
        //In the above the constructor of HashSet is called which is also a method. So the lambda shortcut for that is:
        System.out.println(deDepulicate.apply(List.of("hello", "world", "hello")));

        Function<List<String>, Collection<String>> deDepulicateLambda = HashSet::new;
        System.out.println(deDepulicateLambda.apply(List.of("hello1", "world1", "world1")));


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
