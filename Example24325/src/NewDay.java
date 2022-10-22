import com.sun.org.apache.bcel.internal.generic.IFLE;

import java.io.File;
import java.io.FileNotFoundException;
//import java.lang.reflect.Field;
import java.util.Scanner;

public class NewDay {

    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("test.txt");
        Scanner readme = new Scanner(input);
        // to print and read lines in a file

int count = 0;
int sumAge = 0;

        while (readme.hasNextLine()){

            if (readme.hasNextInt()){
                System.out.println("Int: "+ readme.nextInt());
                count = count +1;
                int age = readme.nextInt();
                sumAge = sumAge + age;

            } else if (readme.hasNextBoolean()) {
                System.out.println("Boolean "+readme.nextBoolean());

            } else if (readme.hasNextDouble()) {
                System.out.println("Double "+ readme.nextDouble()); //decimal
            } else if (readme.hasNextBigDecimal()) {
                System.out.println("Big Decimal "+ readme.nextBigDecimal());

            } else {
                System.out.println(readme.next());

            }

        }

        double aveAge = sumAge/count;
        System.out.println("AveAge: "+ aveAge);

        //input.close;
    }
}
