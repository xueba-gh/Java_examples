import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please Enter An Integer Value: ");
        int A = input.nextInt();

System.out.println("Please Enter C : ");
double C = input.nextDouble();

double Z = A/C;
        System.out.println("Z = "+ Z);

        input.close();

    }
}
