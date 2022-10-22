import java.awt.*;
import java.util.Scanner;

public class TimeConversion {
    public static void main (String[] args){

        //**/%
        //integer Division
//
//        int y = 5;
//        int x = 7;
//        double w = 7.5;
//        System.out.println(y + " div by " + x + " is " + (y/x));
//        System.out.println(y + "  div by "+ w +" is " + (y/w));
//   /     System.out.println(y + " Remainder div by " + w + " is " + (y%w));


        //Another Example
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter time in sec: ");
        //ask user to enter time in seconds



        int  EnterTime = input.nextInt(); // Create an EnterTime to Store Entered time
        int Mins = EnterTime/60; // to create and Int Variable Mins to store Minutes

        int RemSecs = EnterTime%60; // create an int variable to store remain secs

        int Hours = Mins/60;
        int RemMins = Mins%60;

        // printouts of the Mins, Hours and Remainders

        System.out.println("mins  " + Mins);
        System.out.println("RemSecs is " + RemSecs);
        System.out.println(EnterTime + " is: " + Hours + " Hours " + RemMins +" Mins "+ RemSecs+" Secs");


        input.close();

    }
}


