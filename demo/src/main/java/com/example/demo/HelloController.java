package com.example.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
//import javafx.print.Printer;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

//We added implements Initializable. it means
public class HelloController implements Initializable {
    @FXML
    void textDisplay(ActionEvent event) {
        System.out.println("Menu item works");
    }
    @FXML
    private TextField txtOnlyNumbers;

    @FXML
    void OnKeyTypedNumber(KeyEvent event) {
        String oldText = ""; // gets text from text field
        String typedkey = event.getCharacter();
        int ownCursorPos = 0; // gets previous cursor position

        // READ ABOUT REGEX and how it works
        if (typedkey.matches("^[a-z, A-Z, \\-,+,.,>,<,@,!,#,%,^,(,),_]+,")){
            txtOnlyNumbers.setStyle("-fx-background-color: BLUE");
            txtOnlyNumbers.setText(oldText);
            txtOnlyNumbers.positionCaret(ownCursorPos);

        }else {
            txtOnlyNumbers.setStyle("-fx-background-color: YELLOW");
        }





    }


    @FXML
    private RadioButton rdCp;

    @FXML
    private RadioButton rdCsharp;

    @FXML
    private RadioButton rdJava;

    @FXML
    private RadioButton rdOther;
    @FXML
    private ChoiceBox<String> chExpLevel = new ChoiceBox<>();
    @FXML
    private Button btnDSelection;

    // addition of File chooser or Dialog box
    FileChooser fileChooser = new FileChooser();


    @FXML
    private Label lblshowSelection;


    @FXML
    private Button exit;

    @FXML
    private Button logout;

    @FXML
    private Button cancelbutton;

    @FXML
    private Label invalidlabel;

    @FXML
    private Button loginbutton;

    @FXML
    private TextField password;

    @FXML
    private Label registerlabel;

    @FXML
    private TextField username;
    // for save and Open

    @FXML
    private Button Open;

    @FXML
    private Button Save;



// for Editor
    @FXML
    private TextArea Editor;

    @FXML
    void OnOpen(ActionEvent event) throws FileNotFoundException {

        //How to open File Dialog Box and get the FIle that the USer has selected
        File selectedFile = fileChooser.showOpenDialog(new Stage());


        // adding extension restrictions to only text file
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));

        // if the user doesn't select anything use this
        if (selectedFile==null){
            //do nothing
        }else {
 ///Search on How to Enter only Text or Numbers



        // create scanner variable to read text file
        Scanner input = new Scanner(selectedFile);


        input.close();
        }
    }


    @FXML
    void getOwnText(KeyEvent event) {


        String ownText = ""; // gets text from text field
    int ownCursorPos = 0; // gets previous cursor position

        ownCursorPos = txtOnlyNumbers.getCaretPosition();

    }



    @FXML
    void OnSave(ActionEvent event) throws FileNotFoundException {
        // Open the Save file Dialog box to select t=what the User has picked

        // add an extension filter to show only .txt files
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files(*.txt)","*.txt"));


        // it will come in the Exams
        File selectedFile = fileChooser.showSaveDialog(new Stage());
        if (selectedFile == null){

            // Do nothing
        }else {




// declaration of PrintWriter to open a directory
        PrintWriter output = new PrintWriter(selectedFile);

         String enteredText = Editor.getText();
         // WRITE CONTENT TO THE SELECTED TEXT FILE
        output.println(enteredText);

        //close the PrinterWriter Before it works
        output.close();


        // clearing text editor after saving
           // Editor.setText();
    }
    }


    @FXML
    void onCancel(ActionEvent event) {
        //TERMINATE APPLICATION ON CANCEL
        Platform.exit();

    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        //Assuming the Username in Database is Admin

        String default_username = "Admin1"; // actual or default  Username

        // Assuming the password is 12345
        String default_password = "12345";// actual or default Password

        // GET USER ENTERED NAME
        String entered_username = username.getText();
        // GETTING PASSWORD
        String entered_password = password.getText();

        /// comparing the entered usernames and passwords to the Default Username and Password
        if (entered_password.equals(default_password) && entered_username.equals(default_username)){
            invalidlabel.setText("Enter in your Login Details");
            username.setText(" ");
            password.setText("");
            invalidlabel.setTextFill(Color.DEEPSKYBLUE);

            //how to hide the Login interface
            loginbutton.getScene().getWindow().hide();

            // show mainApp. We copied main in HelloApplication to Hello java here
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Main");
            stage.setScene(scene);
            stage.setScene(scene);
            Image icon = new Image(getClass().getResourceAsStream("images/java.png"));
            stage.getIcons().add(icon);

            //Make up scene not Resizeable
            stage.setResizable(true);
            stage.show();



        }else { // if entered details are wrong, do this


            username.setText(" ");
            password.setText("");
            invalidlabel.setText("INVALID CREDENTIALS!!!");
            invalidlabel.setTextFill(Color.YELLOW);

        }
        registerlabel.setTextFill(Color.WHITESMOKE);



    }

    @FXML
    void onRegister(MouseEvent event) {
        invalidlabel.setText(("Click on Link to Register."));
        invalidlabel.setTextFill(Color.DARKRED);
    }
    @FXML
    void Onexit(ActionEvent event) {
        Platform.exit();
        // Closing Application
    }

    @FXML
    void onLogout(ActionEvent event) throws IOException {
        logout.getScene().getWindow().hide();

        // Hide mainApp and show login interface. We copied it from top  in HelloApplication to Hello java here
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);

        stage.setTitle("Login");
        stage.setScene(scene);

        //Make up scene not Resizeable
        stage.setResizable(true);
        stage.show();

    }


    @FXML
    void onDSelection(ActionEvent event) {
    //create string variable to pick user programming language selected
    String selectedLang;

    // String variable to pick user Programming experience
        String selectedExperience;

     if (chExpLevel.getSelectionModel().getSelectedIndex()==0){
         selectedExperience = "None Selected";
     }  else {
         selectedExperience= chExpLevel.getSelectionModel().getSelectedItem();
     }


    //get text from user selection-radio button
        if (rdJava.isSelected()){
            selectedLang=rdJava.getText();
            }else if (rdCsharp.isSelected()){
            selectedLang=rdCsharp.getText();
        }else if (rdCp.isSelected()){
            selectedLang=rdCp.getText();
        }else if (rdOther.isSelected()){
            selectedLang=rdOther.getText();
        }else {
            selectedLang="None selected";
        }

        // Get  selected text from combo box or Choice Box


    lblshowSelection.setText("Language: "+selectedLang + "\n"+ "Experience: " + selectedExperience);
        lblshowSelection.setTextFill(Color.WHITESMOKE);

    }



// initialized created a new method down here after clicking ok in the method signature pop up.
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /// this is for the selection bar to take note. first add the Implement methods and come down here
        //The codes in here will execute whenever the application is run.

        // ADD content to choice box or combo box
        chExpLevel.getItems().addAll(" Select Experience Level ",
                " Beginner ",
                " Intermediate "," Advanced ", " Professional " );
// Pick Item at index 0
         chExpLevel.getSelectionModel().select(0);
// this selection method above sets the first display to 0 or Select Experience Level

        //setting default Location When the dialog box shows
        fileChooser.setInitialDirectory(new File("C:\\Users"));
        //learn how to modify it





    }
}
