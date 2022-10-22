import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadUMATContent {
    public static void main(String[] args) throws MalformedURLException {
URL urlUMAT = new URL("https://admissions.umat.edu.gh/");

        URL url = null;
        try {
            url = new URL("https://admissions.umat.edu.gh/");

        } catch (MalformedURLException e1) {
            System.out.println("URL Not Found, Check URL entered! ");
        }

        Scanner input = null;

        try {
           input = new Scanner(url.openStream());
        } catch (IOException e) {
            System.out.println("URL Not Found, Check URL entered! ");
        }


        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }

    }
}
