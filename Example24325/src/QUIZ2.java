import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class QUIZ2 {
    public static void main(String[] args) {

        //Question One
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String Name = input.next();

        System.out.println("Hello "+ Name + " Welcome to To Programming With Java ");

        System.out.println("UserName has Number "+ Name.length());



        input.close();
    }
}
