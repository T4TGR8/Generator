package magus.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    public Label label_pelda;

    public void gombpush(ActionEvent e){
        label_pelda.setText("gomb megnyomva");
    }

}
