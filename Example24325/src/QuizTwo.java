import java.util.Scanner;

public class QuizTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

  /*      System.out.println(" Enter Sides of the Hexagon:");
        float sides = input.nextFloat();
        System.out.println("Area is Equal to:  "+ 6* Math.pow(sides, 2)/ (4*Math.PI/6.0));*/


        double First = 1/(1+Math.sqrt(2));
        double Second = 1/ (Math.sqrt(3) + Math.sqrt(5));
        double Third = Math.pow((1/ (Math.sqrt(2) + Math.sqrt(3))), 3);
        double Answer = First + Second + Third ;
        System.out.println(Answer);
        /*System.out.println("The Answer is "+  1/(1+Math.sqrt(2)) + 1/ (Math.sqrt(3) + Math.sqrt(5)) + Math.pow(((1/ (Math.sqrt(2) + Math.sqrt(3)), 3)));*/


    }
}
