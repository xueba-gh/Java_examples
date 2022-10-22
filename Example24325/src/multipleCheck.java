import java.time.LocalDateTime;
import java.util.Scanner;

public class multipleCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your First:");
        int firstNum = input.nextInt();

        System.out.print("Please Enter Your Second: ");
        int secNum = input.nextInt();

        System.out.print("is " + firstNum + " is a Multiple of "+secNum + "?");
        System.out.println(firstNum%secNum==0);

//Time Conversion
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Your local time is : "+ currentDateTime.getHour()+ " : "+ currentDateTime.getMinute() );

        // extract the time and add GMT to it.



        input.close();

    }
}
