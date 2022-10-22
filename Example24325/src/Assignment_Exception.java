import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Assignment_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double x = 0;
                double y = 0;
                        double z;

        //Create User Inputs Z , X and Y
        boolean CheckX = true;
        while (CheckX) {
            try {
                System.out.printf("Please Enter X:  ");
                x = input.nextDouble(); // input mismatch

                CheckX = false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input, Enter a Correct Value: ");;
            }
        }



        /// the Y checks the Division, hence I will use check division for

        boolean Check_Division = true;

        while (Check_Division) {

            if (y>0 && y<0) {
                System.out.printf("Please Input Y: ");
                y= input.nextDouble(); // input mismatch

            } else {
                System.out.println("Wrong Input, Please Try again with a Different input. ");

            }

            boolean CheckY = false;

            while (CheckY) {
                try {
                    z= x/y; // arithmetic Mishandling Exceptions
                    System.out.printf(x +" / "+ y + " Equals "+ z);
                    Check_Division = true;

                } catch (ArithmeticException e) {
                    System.out.println("Enter A correct Value for Y");
                    Check_Division = true;
                }
            }
        }


        input.close();
    }
}
