package generics;

public class Main {

    public static void main(String args[]){
        Number<Integer> numI = new Number<>();
        numI.x = 12;

        Number<Float> numF = new Number<>();
        numF.x = 34.23f;

        System.out.println("Number is " + (Integer) numI.getX());
        System.out.println("Number is " + (Float) numF.getX());


    }
}
