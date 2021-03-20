package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import magus.model.Caste;
import magus.model.Personality;
import magus.model.Race;

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
}
