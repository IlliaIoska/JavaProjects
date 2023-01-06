package com.example.eventhandling;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloBtn;
    @FXML
    private Button anotherBtn;

    @FXML
    private CheckBox checkBox;
    @FXML
    private Label label;

    @FXML
    public void initialize() {
        this.helloBtn.setDisable(true);
        this.anotherBtn.setDisable(true);
    }

    @FXML
    public void onButtonCLicked(ActionEvent ev) {
        if(ev.getSource().equals(helloBtn)) {
            System.out.println(this.nameField.getText());
        } else {
            System.out.println("Another");
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    String s = Platform.isFxApplicationThread() ? "UI" : "Back";
                    System.out.println("Gonna sleep " + s);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI" : "Back";
                            System.out.println("Updating the label on thread " + s);
                            label.setText("Smth");
                        }
                    });
                } catch(Exception e) {

                }
            }
        };

        new Thread(task).start();

        if(checkBox.isSelected()) {
            nameField.clear();
            onKeyReleased();
        }
    }

    @FXML
    public void onKeyReleased() {
        String text = this.nameField.getText();
        boolean isBtnDisabled = text.isEmpty() || text.trim().isEmpty();
        this.helloBtn.setDisable(isBtnDisabled);
        this.anotherBtn.setDisable(isBtnDisabled);
    }

    @FXML
    public void onCheckBox() {
        System.out.println("The checkBox is " + (this.checkBox.isSelected() ? "Checked" : "Not checked"));
    }
}