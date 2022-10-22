import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Year of Birth Below: ");
        int YearOfBirth = input.nextInt();
        switch (YearOfBirth%12){
            case 0:
                System.out.println(YearOfBirth + " Is a Monkey Year. ");
                // this side test for cases
                break; // prevents the other cases from being checked
            case 1:
                System.out.println(YearOfBirth + " Is a ROOSTER. ");
                break;
            case 2:
                System.out.println(YearOfBirth + " Is a DOG ");
                break;
            case 3:
                System.out.println(YearOfBirth + " Is a PIG ");
                break;
            case 4:
                System.out.println(YearOfBirth + " Is a RAT ");
                break;
            case 5:
                System.out.println(YearOfBirth + " Is a OX ");
                break;
            case 6:
                System.out.println(YearOfBirth + " Is a TIGER ");
                break;
            case 7:
                System.out.println(YearOfBirth + " Is a  RABBIT");
                break;
            case 8:
                System.out.println(YearOfBirth + " Is a DRAGON ");
                break;
            case 9:
                System.out.println(YearOfBirth + " Is a SNAKE ");
                break;
            case 10:
                System.out.println(YearOfBirth + " Is a HORSE ");
                break;
            default:
                System.out.println(YearOfBirth + " Is a SHEEP ");
                break;
        }

// make sure You insert your Breaks.
// the switch statement is faster than the if else statements
        // they are stored in hash maps
        // if else checks one by one before


        input.close();
    }
}
