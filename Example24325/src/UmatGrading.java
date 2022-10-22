import java.util.Scanner;

public class UmatGrading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Mark to Be Graded: ");
        double mark = input.nextDouble();

        //all these below are if else statements
        // but 1000 will give you an first class so
        // add the exception to it.
        if (mark > 100.0){
            System.out.println(" Wrong Input ! Please Try Again. ");
        }
        if (mark>=80.0 && mark <= 100.0){
            System.out.println("Congratulations, You Have First Class");

        } else if (mark >= 70.0 && mark < 80.0) {
            System.out.println("Congratulations," +mark + " Is Second Class Upper");
        } else if (mark >= 60.0 && mark < 70.0 ) {
            System.out.println(" Congratulations, "+ mark+" Is a Second Class Lower" );
        } else if ( mark >= 50.0 && mark < 60.0) {
            System.out.println(mark + " Is A Pass Mark");
            // you can add more circle brackets to it to make it readable
        } else if (mark < 50.0) {
            System.out.println(" Failed !");
            // note that if we're execution the

        }
    }
}
