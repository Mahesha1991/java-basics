package advance;

import java.util.Scanner;

class NoBalanceException extends Exception {
    public NoBalanceException(String hello) {
        System.out.println(hello);
    }

}
public class CustomException {
    public static void main(String args[]) {
        int bal = new Scanner(System.in).nextInt();
        try{
            getBal(bal);
        }catch(NoBalanceException noBal){
            System.out.println(noBal.getMessage());
        }finally{
            System.out.println("Always executed!");
        }
    }

    public static void getBal(int bal) throws NoBalanceException{
        if (bal < 0){
            throw new NoBalanceException("Balance is less than zero");
        }
    }
}
