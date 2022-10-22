import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        // CREATE THE INPUT OF THE USER
        //Z=x/y
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 0;
        int z= 0;



        boolean CheckX = true;
//Ask user to enter X value and Exception Handling for X
        while (CheckX){

            try {
                System.out.println("Please Enter X Value: ");
                x=input.nextInt(); // input Mismatch


                CheckX = false;
            } catch (InputMismatchException e) {
                System.out.println("Value  is not an Integer. Enter an Integer.");
            }

        }


        // what does the finally Block Do? - quiz Question
        /*finally {
// message to appear if X gets an error

            *//*System.out.println(" Finally Block !");*//*
        }*/
//ask user to y value

        boolean checkDivision = true; // check for division Exception

        while (checkDivision) { //Will constantly executes  whiles there is an arithmetic....
            System.out.println("Please Enter Y value: ");
            y=input.nextInt(); // input Mismatch


// Try and Catch CTRL + ALT + T

            Boolean CheckY = true;
            while (CheckY) {
                try {
                    z=x/y; /// Arithmetic Exception
                    System.out.println(x+ "/"+ y+ " is "+ z);
                    checkDivision = false;

                } catch (ArithmeticException e) {
                    System.out.println("Division Not Allowed !! Enter Y Again");
                    checkDivision = true;
                }

                break;
            }
        }

        input.close();
    }
}
