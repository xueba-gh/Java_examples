import java.util.Scanner;

public class question2_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer");
        int Num = input.nextInt();
        int count = 0;
        for (int i = Num; i < 600; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                count++;
            }

            if (count == 15) {
                break;
            }

            input.close();

        }

    }


}
