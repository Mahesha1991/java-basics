package advance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void main(String []args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        in = new FileInputStream("/Users/mahesha/java/basics/src/resources/input.txt");
        out = new FileOutputStream("/Users/mahesha/java/basics/src/resources/output.txt");
        int c;
        while( (c = in.read()) != -1){
            System.out.println((char) c);
            out.write(c);
        }
        in.close();
        out.close();
    }
}
