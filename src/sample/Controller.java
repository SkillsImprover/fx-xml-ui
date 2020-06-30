package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.util.function.Consumer;

public class Controller {

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    public void signInBtnPressed(ActionEvent actionEvent) {

        String userName = loginField.getText();
        String password = passwordField.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Message Here...");

        alert.setContentText("Username = " + userName + ", password = " + password);

        alert.showAndWait().ifPresent(new Consumer<ButtonType>() {
            @Override
            public void accept(ButtonType buttonType) {
                if (buttonType == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            }
        });
    }
}



