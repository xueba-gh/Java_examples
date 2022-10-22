import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //File Variable
        File inputFile = new File("Text.txt");
        //Scanner to Read the File
        Scanner input = null;
        try {
            input = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
        while (input.hasNextLine()) {
            if (input.hasNextInt()) {               //Integer
                System.out.println("Integers: "+input.nextInt());
                
            }else if (input.hasNextDouble()) {      //Double
                System.out.println("Doubles: "+input.nextDouble());
                
            }else if (input.hasNextBoolean()) {     //Booleans
                System.out.println("Booleans: "+input.nextBoolean());
                
            }else{                                  //Strings
                System.out.println("Strings: "+input.next());
                
            }
            
        }
        
        input.close();
    }

  
}
