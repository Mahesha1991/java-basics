package advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String args[]) throws IOException {
        System.out.print("Enter a number to find factorial: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigIntegerTest bit = new BigIntegerTest();
        System.out.println(bit.factorial(new BigInteger(br.readLine())));

        //System.out.println("Entered number = " + num);
    }
    
    public BigInteger factorial(BigInteger bi){
        if(bi.intValue() != 1){

            //Not completed
            //bi = bi.multiply( factorial());
        }
        return bi;



    }
}
