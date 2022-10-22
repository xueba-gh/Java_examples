import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Temperature in Celsius:  ");

        double celsius = input.nextDouble();

        double Fahrenheit = (9.0/5.0 *celsius)+32;

        System.out.println("Your Temperature Conversion is : "+Fahrenheit + " Fahrenheit" );
    }
}