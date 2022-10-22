import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PRINTTOFILE {
    public static void main(String[] args) throws IOException {

        PrintWriter output1 = new PrintWriter(new FileWriter("out1.txt", true)); // it adds exceptions automatically

        output1.println("For Closing the PrintWriter : Obu is not Serious ");

        for (int i = 0; i < 10; i++) {
            output1.println(i);


            output1.close();    //
        }
    }}


