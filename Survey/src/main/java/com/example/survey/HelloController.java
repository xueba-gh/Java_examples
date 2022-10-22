package com.example.survey;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {


    @FXML
    private ToggleGroup question1_answers;

    @FXML
    private ToggleGroup question2_answers;

    @FXML
    private ToggleGroup question3_answers;

    @FXML
    private Label question_1;

    @FXML
    private RadioButton rdGUM_3;

    @FXML
    private RadioButton rdNDC_3;

    @FXML
    private RadioButton rdNPP_3;

    @FXML
    private RadioButton rdPPP_3;


    @FXML
    private RadioButton rdHave_no_idea_2;

    @FXML
    private ToggleGroup question5_answers;

    @FXML
    private Label question_5;

    @FXML
    private RadioButton rdGUM_5;

    @FXML
    private RadioButton rdNDC_5;

    @FXML
    private RadioButton rdNPP_5;

    @FXML
    private RadioButton rdPPP_5;


    @FXML
    private RadioButton rdNo_2;

    @FXML
    private RadioButton rdYes_2;

    @FXML
    private ToggleGroup question4_answers;

    @FXML
    private Label question_4;

    @FXML
    private RadioButton rdCertain_to_vote4;

    @FXML
    private RadioButton rdDont_know4;

    @FXML
    private RadioButton rdMostly_likely_to_vote4;

    @FXML
    private RadioButton rdProbably_wont_vote4;

    @FXML
    private ToggleGroup question9_answers;

    @FXML
    private Label question_9;

    @FXML
    private RadioButton rdHave_no_idea_9;

    @FXML
    private RadioButton rdNo_9;

    @FXML
    private RadioButton rdYes_9;

    @FXML
    private Button startSurvey;


    @FXML
    private Button Next;

    @FXML
    private ToggleGroup question7_answers;

    @FXML
    private Label question_7;

    @FXML
    private RadioButton rdOpposition_7;

    @FXML
    private RadioButton rdgovernment_7;

    @FXML
    private RadioButton rdHave_no_idea_1;

    @FXML
    private RadioButton rdNo_1;

    @FXML
    private RadioButton rdYes_1;

    @FXML
    private ToggleGroup question6_answers;

    @FXML
    private Label question_6;

    @FXML
    private RadioButton rdHave_no_idea_6;

    @FXML
    private RadioButton rdNo_6;

    @FXML
    private RadioButton rdYes_6;


    @FXML
    private Button btnDGuess;

    @FXML
    private Label lblshowSelection;

    @FXML
    private ToggleGroup question8_answers;

    @FXML
    private Label question_8;

    @FXML
    private RadioButton rdAbsolutely_8;

    @FXML
    private RadioButton rdAbsolutely_not_8;

    @FXML
    private RadioButton rdNeutral_8;



    @FXML
    void OnNext(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 639, 276);
        Stage stage = new Stage();
        stage.setTitle("Question 2");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }


    @FXML
    void OnNext1(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 493, 310);
        Stage stage = new Stage();
        stage.setTitle("Question 3");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    void OnNext2(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question4.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 541, 296);
        Stage stage = new Stage();
        stage.setTitle("Question 4");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    void OnNext3(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question5.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 596, 295);
        Stage stage = new Stage();
        stage.setTitle("Question 5");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }

    @FXML
    void OnNext4(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question6.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 557, 285);
        Stage stage = new Stage();
        stage.setTitle("Question 6");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
    @FXML
    void OnNext5(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question7.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 558, 280);
        Stage stage = new Stage();
        stage.setTitle("Question 7");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    @FXML
    void OnNext6(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question8.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 514, 269);
        Stage stage = new Stage();
        stage.setTitle("Question 8");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
    @FXML
    void OnNext7(ActionEvent event) throws IOException {
        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question9.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 568, 300);
        Stage stage = new Stage();
        stage.setTitle("Question 9");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
    @FXML
    void OnNext8(ActionEvent event) throws IOException {

        Next.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("guess-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 552, 309);
        Stage stage = new Stage();
        stage.setTitle("Guess Your Party");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
    String selectedAns;

    public void onDGuess(ActionEvent actionEvent) {




        //get text from user selection-radio button
        if ( rdNPP_3.isSelected() && rdYes_6.isSelected()){
//            lblshowSelection.setText(" You Are Likely to Be An NPP Member");
//            lblshowSelection.setTextFill(Color.WHITESMOKE);

            //selectedAns = rdYes_2.getText();
            selectedAns = rdNPP_3.getText();
            selectedAns = rdYes_6.getText();


        } else if (this.rdYes_2 == null) {
            lblshowSelection.setText("You are likely to Be An NPP Voter");
            selectedAns = rdYes_2.getText();

        } else if(rdYes_9.isSelected() && rdNDC_3.isSelected()  && rdNDC_5.isSelected()){


            selectedAns = rdYes_9.getText();
            selectedAns = rdNDC_3.getText();
            selectedAns = rdNDC_5.getText();
//            lblshowSelection.setText("You Are Likely to Be An NDC Member");
//            lblshowSelection.setTextFill(Color.DARKRED);

        } else {

            lblshowSelection.setText("You Are Likely To Be A Floating Voter.");
            lblshowSelection.setTextFill(Color.DEEPSKYBLUE);
        }




    }



    @FXML
    void StartSurvey(ActionEvent event) throws IOException {
        startSurvey.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("question1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 249);
        Stage stage = new Stage();
        stage.setTitle("Question 1");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }

}
