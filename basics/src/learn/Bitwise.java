package learn;

public class Bitwise {
    public static void main(String []args){

        System.out.printf("This is bit%cise operator\n",'w');
        int x = 3, y =6;
        System.out.println(x&y);
        /* 0....011
           0....110
           --------
           0....010  --->  2
         */

        System.out.println(x|y);

        /* Bitwise XOR
        Same bits 0, rest 1
         */

        System.out.println(x^y);

        //Bitwise NOT
        System.out.println(~x);

        /* In Java, negative numbers are represented in 2's compliment
        And left most bit should be 1 ( in binary )
        Representation of -x = 2 power 32 - x
        3 = 0...011
        ~3 = 1...100 = 2 power 32 - 4
        Hence ~3 will be -4
         */

        // Left and right shift
        System.out.println(x<<3);
        System.out.println(x>>1);

        System.out.println(y>>1);
        // Below will make left most bit to 1 and Java will apply 2's compliment and it is a negative number
        System.out.println(x<<30);

        /* Right shift of negative numbers
         To keep the sign when right shift is performed Java will add 1 from the left most bit
             z = -2
             which means z = 1...10 = 2 power 32 -2 = -2 ( negative number)
             Right shift by 1 , z = 1...11 == 2 power 32 -1 = -1 ( negative number )
        */
        System.out.println(-2>>1);
        // Below will also give -1
        System.out.println(-2>>25);

        // Unsigned Right Shift will add zero from the left most bit. Extra > mark
        System.out.println(-2>>>2);
    }
}
