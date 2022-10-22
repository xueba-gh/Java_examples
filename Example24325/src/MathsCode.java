import java.util.Scanner;

public class MathsCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input X Value for the Multiplication:  ");
        double x = input.nextDouble();

        System.out.println("Input Y Value to multiply X : ");
        float y = input.nextFloat();



        double v = x*y;


        // to make an input, bring the text before the Input line itself.
        System.out.println("Please Input a value to divide with your answer: ");
        double divi = input.nextDouble();

        System.out.println("Now to the Division is: " + v/divi);



    }
}
