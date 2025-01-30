package eus.ehu.gitexercise;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("hellooooo uxue is was and will be here ! sorry forgot message");
    }
}
