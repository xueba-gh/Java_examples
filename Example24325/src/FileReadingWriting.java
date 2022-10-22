import javax.naming.NamingEnumeration;
import java.io.*;
import java.security.KeyStore;
import java.util.Scanner;

public class FileReadingWriting {
    public static void main(String[] args) throws IOException {

        // CREATE A FILE VARIABLE TO REPRESENT A TEXT FILE

        File InputFile = new File("test.txt");
    PrintWriter output = new PrintWriter(new FileWriter("out.txt"));
    //the use of file writer

        // HOW TO USE PRINTWRITER VARIABLE
        PrintWriter outputFile = new PrintWriter("GoodGrief_itsTime.txt");
        ///How to write a content to a text file
        outputFile.append("Good Grief, It's TIme LA! ");

        //Always Make sure to CLose your Print Writer







        //To Check If File Exits
        System.out.println(InputFile.exists());

        // to check if file has length
        System.out.println(InputFile.length());

        //Check File Path
        System.out.println(InputFile.getPath());
        //check absolute path
        System.out.println(InputFile.getAbsolutePath());


        //*System.out.println(InputFile.delete());
        //delete a txt file*/

        Scanner input = null;

        try {
            //CREATE A SCANNER VARIABLE TO READ THE FILE CONTENT
             input = new Scanner(InputFile);
        } catch (FileNotFoundException e) {
            System.out.println("File Does not Exit. TRY AGAIN! ");
        }

//        to print file content to CONSOLE
//        while (input.hasNextLine()){
//            System.out.println(input.nextLine());
//
//        }

//        // HOW TO PRINT ONLY TEXT LINES, INT, STRING ETC
//        while  (input.hasNextLine()){
//        if (input.hasNextInt()){
//            System.out.println(input.nextInt());
//        }else {
//            input.next();
//        }
//
//        }


// TO PRINT ONLY BOOLEAN

        while  (input.hasNextBoolean()){
            if (input.hasNextBoolean()){
                System.out.println("nEXT bOOLEAN : "+input.nextBoolean());
            }else {
                input.next();
            }

        }

        //Next String
        while  (input.hasNext("String")){
            if (input.hasNext("String")){
                System.out.println("nEXT String : "+input.next("String"));
            }else {
                input.next();
            }

        }

//
//        STRING  :
//        boolean:
//        INTEGER
//        Decimals
        try
        {
            input= new Scanner(InputFile);
        }catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }while (input.hasNextLine()){
            if (input.hasNextInt()){
                System.out.println("Int is: "+input.nextInt());
            } else if (input.hasNextDouble()) {
                System.out.println("Double: "+input.nextDouble());
            } else if (input.hasNextBoolean()) {
                System.out.println("Boolean is: "+input.nextBoolean());
            }else{
                System.out.println("Strings: "+input.next());
            }

        }

        outputFile.close();
         input.close();
    }
}
