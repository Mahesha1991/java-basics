package oops;

public class StaticFinal {

    static float PI = 3.14f;

    StaticFinal(){
        this.PI = 3.1412f;

        // Any method or reference can access static members of class including this reference.
        this.printPI();
        int i = 3;
    }
    public static void main(String args[]){

        System.out.println(StaticFinal.PI);
        StaticFinal sf = new StaticFinal();
        System.out.println(StaticFinal.PI);

    }

    static void printPI(){
        System.out.println(PI);
        //Below is a compile error as static method can only access static variable and method of the class.
        // i = 4;
        // printPIAgain();
    }

    void printPIAgain(){
        System.out.println("Print PI Again");
    }
}
