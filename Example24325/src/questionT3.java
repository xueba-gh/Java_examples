import java.util.Scanner;

public class questionT3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i < 24; i++) {
            if ((i % 2 != 0) && (i % 7 != 0)) {
                System.out.println(i);
                count++;
            }
            if (count == 23)
                break;
        }
    }
}
