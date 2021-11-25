package oops;

public class Child extends Parent{

    public Child(){
        System.out.println("In child constructor");
    }

    int k = 8;
    int getK(){
        return k;
    }
    int getSuperK(){
        return super.k;
    }
    public static void main(String []args){
        Child c = new Child();
        System.out.println(c.getI());
        // Child class variable
        System.out.println(c.getK());
        System.out.println(c.getSuperK());

    }
}
