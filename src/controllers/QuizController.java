package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleButton;
import model.Quiz;
import model.StopwatchLabel;

import java.net.URL;
import java.util.ResourceBundle;


public class QuizController implements Initializable {

    Quiz quiz = new Quiz();

    @FXML
    private TitledPane question;
    @FXML
    private ToggleButton answer1;
    @FXML
    private ToggleButton answer2;
    @FXML
    private ToggleButton answer3;
    @FXML
    private Button next;
    @FXML
    private Label wrongAnswersLabel;
    @FXML
    private Label timerLabel;
    private int wrongAnswers = 0;
    private int countQuestion = 0;
    StopwatchLabel stopWatch;

    // initialise window and set first questions with answers
    // for answers with * at end, it will remove the *
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.quiz.setQuiz();
        this.question.setText(this.quiz.getQuiz()[0][0]);
        this.stopWatch = new StopwatchLabel();
        this.stopWatch.setRunning(true, this.timerLabel);
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][1]) == 1){
            this.answer1.setText(this.quiz.getQuiz()[0][1].substring(0, this.quiz.getQuiz()[0][1].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][2]) == 1){
            this.answer2.setText(this.quiz.getQuiz()[0][2].substring(0, this.quiz.getQuiz()[0][2].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][3]) == 1){
            this.answer3.setText(this.quiz.getQuiz()[0][3].substring(0, this.quiz.getQuiz()[0][3].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][1]) == 0) {
            this.answer1.setText(this.quiz.getQuiz()[0][1]);
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][2]) == 0) {
            this.answer2.setText(this.quiz.getQuiz()[0][2]);
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][3]) == 0) {
            this.answer3.setText(this.quiz.getQuiz()[0][3]);
        }
        this.wrongAnswersLabel.setText(String.valueOf(this.wrongAnswers));
        this.countQuestion++;
    }

    // verify selected buttons if the answers on them is correct
    public void verifyAnswers(){
        if(((this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][1]) == 1 && !this.answer1.isSelected()) ||
                (this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][2]) == 1 && !this.answer2.isSelected()) ||
                (this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][3]) == 1 && !this.answer3.isSelected())) && this.wrongAnswers < 5 && !this.timerLabel.getText().equals("Time's up!")){
            this.wrongAnswers++;
            this.wrongAnswersLabel.setText(String.valueOf(this.wrongAnswers));
        }
        else if(((this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][1]) == 1 && !this.answer1.isSelected())
            || (this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][2]) == 1 && !this.answer2.isSelected())
                || (this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][3]) == 1 && !this.answer3.isSelected())) && this.wrongAnswers < 5 && !this.timerLabel.getText().equals("Time's up!")){
            this.wrongAnswers++;
            this.wrongAnswersLabel.setText(String.valueOf(this.wrongAnswers));
        }
        if(this.wrongAnswers == 5){
            this.wrongAnswersLabel.setText("Better luck next time!");
        }
    }

    // if verfication is negative, the wrong answers counter will increase with 1
    // if the counter is 5 or timer is 0, the button won't work anymore
    public void nextQuestion(){
        verifyAnswers();
        if(this.wrongAnswers < 5 && this.countQuestion < 26 && !this.timerLabel.getText().equals("Time's up!")){
            this.question.setText(this.quiz.getQuiz()[countQuestion][0]);
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][1]) == 1){
                this.answer1.setText(this.quiz.getQuiz()[countQuestion][1].substring(0, this.quiz.getQuiz()[countQuestion][1].length() - 2));
            }
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][2]) == 1){
                this.answer2.setText(this.quiz.getQuiz()[countQuestion][2].substring(0, this.quiz.getQuiz()[countQuestion][2].length() - 2));
            }
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][3]) == 1){
                this.answer3.setText(this.quiz.getQuiz()[countQuestion][3].substring(0, this.quiz.getQuiz()[countQuestion][3].length() - 2));
            }
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][1]) == 0) {
                this.answer1.setText(this.quiz.getQuiz()[countQuestion][1]);
            }
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][2]) == 0) {
                this.answer2.setText(this.quiz.getQuiz()[countQuestion][2]);
            }
            if(this.verifyCorrectivness(this.quiz.getQuiz()[countQuestion][3]) == 0) {
                this.answer3.setText(this.quiz.getQuiz()[countQuestion][3]);
            }
            this.answer1.setSelected(false);
            this.answer2.setSelected(false);
            this.answer3.setSelected(false);
            this.countQuestion++;
        }
        else{
            System.out.println("Game over!");
        }
    }

    // function which verifies if string contains *
    public int verifyCorrectivness(String input){
        if(input.contains(" *")){
            return 1;
        }
        else return 0;
    }

    // function for starting the window again, re-initialise it
    public void startnewQuiz(){
        this.stopWatch.setRunning(false,this.timerLabel);
        wrongAnswers = 0;
        countQuestion = 1;
        this.quiz.setQuiz();
        this.wrongAnswersLabel.setText(String.valueOf(this.wrongAnswers));
        this.question.setText(this.quiz.getQuiz()[0][0]);
        this.stopWatch = new StopwatchLabel();
        this.stopWatch.setRunning(true,this.timerLabel);
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][1]) == 1){
            this.answer1.setText(this.quiz.getQuiz()[0][1].substring(0, this.quiz.getQuiz()[0][1].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][2]) == 1){
            this.answer2.setText(this.quiz.getQuiz()[0][2].substring(0, this.quiz.getQuiz()[0][2].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][3]) == 1){
            this.answer3.setText(this.quiz.getQuiz()[0][3].substring(0, this.quiz.getQuiz()[0][3].length() - 2));
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][1]) == 0) {
            this.answer1.setText(this.quiz.getQuiz()[0][1]);
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][2]) == 0) {
            this.answer2.setText(this.quiz.getQuiz()[0][2]);
        }
        if(this.verifyCorrectivness(this.quiz.getQuiz()[0][3]) == 0) {
            this.answer3.setText(this.quiz.getQuiz()[0][3]);
        }
    }


}
