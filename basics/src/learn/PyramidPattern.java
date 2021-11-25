package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PyramidPattern {
    public static void main(String args[]) throws IOException {

        System.out.print("Enter the number of rows: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt((br.readLine()));
        int j = rows;
        for(int i = 0; i <= rows; i++){
            for(int k = 0; k <= j-1+10; k++){
                System.out.print(" ");
            }
            for(int k = 0; k < i * 2 - 1 ; k++)
                System.out.print("*");
            System.out.println("");
            j--;
        }
    }
}
