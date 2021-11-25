package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {

    public static void main(String args[]){

        System.out.print("Enter your name: ");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String name = br.readLine();
            System.out.println("Your name is : " + name);
            System.out.println("Enter a number: ");
            float num = Float.parseFloat(br.readLine());
            System.out.printf("Float %f\n",num);
            System.out.printf("Float %8.2f\n",num);
            //System.out.printf("Int %d\n",num);
            System.out.format("Float %08.3f\n", num);

            //Escaping the string
            System.out.println("C:\\xyz\\abc.txt\b");
            System.out.println("Single 'quotes' need not be escaped as it is inside \"double quotes\"");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
