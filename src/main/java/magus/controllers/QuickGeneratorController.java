package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;
import magus.Main;
import magus.model.Caste;
import magus.model.Personality;
import magus.model.Race;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class QuickGeneratorController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBoxCaste;
    @FXML
    private ChoiceBox<String> choiceBoxRace;
    @FXML
    private ChoiceBox<String> choiceBoxPersonality;
    @FXML
    private Spinner<Integer> spinnerLevel;
    @FXML
    private Button buttonGenerate;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Caste c : Caste.values())
            choiceBoxCaste.getItems().add(c.getCasteName());

        for (Race r : Race.values())
            choiceBoxRace.getItems().add(r.getRaceString());

        for (Personality p : Personality.values())
            choiceBoxPersonality.getItems().add(p.getPersonalityString());

        spinnerLevel.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerLevel.setEditable(true);
    }

    @FXML
    public void generate() throws IOException {
        Stage window = (Stage) buttonGenerate.getScene().getWindow();
        Parent root = FXMLLoader.load(Main.class.getResource("/views/characterSheet.fxml"));
        window.setScene(new Scene(root, 1210, 800));
    }
}
