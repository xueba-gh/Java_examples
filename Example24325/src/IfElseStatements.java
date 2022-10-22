import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {
        //one way if esle statements
        Scanner input = new Scanner(System.in);
        System.out.println("Enter An input int: ");
        int ValueEntered = input.nextInt();
        /*if (ValueEntered%2!=0){
            System.out.printf(ValueEntered + "  Is an odd Number");*/
        if (ValueEntered%2==0){
            System.out.println(ValueEntered + " Is Even");

        }
        else {
            System.out.printf(ValueEntered + " Is Odd");

        }
    }

    /*
    Take Hom =e Assignment
    When a User enters a Number tell if the Number is Positive or Negative or Zero*/
}
