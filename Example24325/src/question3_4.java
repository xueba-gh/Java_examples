import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class question3_4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        String Name = input.next();


        PrintWriter Question4 = new PrintWriter(new FileWriter("Question4.txt", true));

        Question4.println(Name);


//        FileChooser fileChooser = new FileChooser();
//        //only allow text files to be selected using chooser
//        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt"));
//        //set initial directory somewhere user will recognise
//        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
//        //let user select file
//        File fileToLoad = fileChooser.showOpenDialog(null);
//        //if file has been chosen, load it using asynchronous method (define later)
//        if(fileToLoad != null){
//            loadFileToTextArea(fileToLoad);
//        }

            input.close();
        }
    }