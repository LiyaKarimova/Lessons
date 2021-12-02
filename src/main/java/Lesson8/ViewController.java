package Lesson8;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController {

    private int value;
    private boolean counter = true;
    private int newValue;

    @FXML
    Button button;
    @FXML
    TextField textField;
    @FXML
    Button button1;
    @FXML
    Button reset;
    @FXML
    Button save;



    @FXML
    public void initialize (){
        textField.setText(String.valueOf(value));

    }

    @FXML
    public void onButtonClicked(){
        value--;
        System.out.println("минус");
        textField.setText(String.valueOf(value));
    }

    @FXML
    public void onButton1Clicked(){
        value++;
        System.out.println("плюс");
        textField.setText(String.valueOf(value));
    }

    @FXML
    public void onResetClicked(){
        value = 0;
        textField.setText(String.valueOf(value));
    }

    @FXML
    public void onSaveClicked(){
        if (counter) {
            newValue=value;
            counter = false;
        } else {
            textField.setText(String.valueOf(newValue));
            counter = true;
        }
    }



}
