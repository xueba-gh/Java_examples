import java.util.Scanner;

public class Another_Assignment_examples_for_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x = 0;
        double y = 0;
        double z = 0;


        if (y > 0 && y < 0){
            System.out.println("Wrong Input! Input Y again ");

        } else {

            System.out.println(" Please Input X Value below ");
            x = input.nextDouble();
            System.out.println(" Please Input Y Value Below ");
            y = input.nextDouble();
            z = x/y;
            System.out.println( x + " / "+ y + " is "+ z);
        }


        // This is An Arithmetic Exception Because, Any User can Cause this Equation not to work by inputting
        // or a letter or any special character to disrupt the smooth calculations of the equations set up above. Hence,
        // we need to set an Exception criteria for the equation in case such happens.


//
//String welcome = "Welcome to Java";
//        System.out.println("Length of Welcome is "+ welcome.length());




        input.close();
    }
}
