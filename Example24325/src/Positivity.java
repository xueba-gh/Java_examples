import java.util.Scanner;

//ASSIGNMENT


public class Positivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please Enter a Value To Test for Positivity: ");
        double Numb = input.nextDouble();

     if (Numb > 0.0){
                System.out.println( Numb + " is Positive Number ");
            } else if (Numb < 0.0) {
         System.out.println( Numb + "Is A Negative Number ");
     } else {
         System.out.println(Numb + " Is Zero");
     }
        input.close();

    }
}
