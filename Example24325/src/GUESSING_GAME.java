import java.util.Scanner;

public class GUESSING_GAME {
    public static void main(String[] args) {

       /* double randNum = (Math.random()*4); // random number is from 0 to less than 1
        Scanner input = new Scanner(System.in);
        System.out.println("guess the random number: ");
        int userguess= input.nextInt();

        if (randNum == userguess){
            System.out.println("Congratulations,you won");

        } else if (userguess<randNum) {
            System.out.println("You lost, number too low. Try Again");

        } else if (userguess>randNum) {
            System.out.println("You lost, number too high, Try Again");

        }else System.out.println("Enter a number: ");

        System.out.println("random number = "+(int)(randNum));

        input.close();*/

////////////////////////////////////
        int rand =( int)(Math.random()*(5));
        Scanner input =new Scanner(System.in);
        System.out.println(" Guess any random number ");

        System.out.println(" Enter here: ");

        int value_entered=input.nextInt();

        if(value_entered==rand) {
            System.out.println(" Congratulations,You won! ");

        }else if(value_entered>rand) {
            System.out.println(" Number is too high,You lost ! ");
        }else {
            System.out.println(" Number is too low,You lost ");
        }

    }
}
