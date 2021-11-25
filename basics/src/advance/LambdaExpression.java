package advance;

interface Sum{
    void sumPrint(int a, int b);
}
public class LambdaExpression {

    public static void main(String args[]){

        /* Below is the syntax for lambdda expression
            Instead of creating an implementation and then object of that class,
            we can directly create method body by below syntax.
         */
        getSum((i,j) -> System.out.println(i+j), 4,5);
        getSum((i,j) -> System.out.println(j), 4,5);

    }

    static void getSum(Sum s, int i, int j){
        s.sumPrint(i,j);
    }
}
