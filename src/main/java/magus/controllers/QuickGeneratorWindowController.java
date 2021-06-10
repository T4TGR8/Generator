package magus.controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import magus.Main;
import magus.model.*;
import magus.model.Character;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class QuickGeneratorWindowController implements Initializable {

    @FXML
    protected TextField textField_characterName;
    @FXML
    protected ChoiceBox<String> choiceBoxCaste;
    @FXML
    protected ChoiceBox<String> choiceBoxRace;
    @FXML
    protected ChoiceBox<String> choiceBoxPersonality;
    @FXML
    protected ChoiceBox<String> choiceBoxReligion;
    @FXML
    protected TextField textField_characterBirthplace;
    @FXML
    protected TextField textField_characterSchool;
    @FXML
    protected Spinner<Integer> spinnerLevel;
    @FXML
    protected Spinner<Integer> spinnerAge;
    @FXML
    protected Button buttonGenerate;
    @FXML
    protected Button buttonBack;

    public Character character;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (Caste c : Caste.values())
            choiceBoxCaste.getItems().add(c.getCasteName());

        for (Race r : Race.values())
            choiceBoxRace.getItems().add(r.getRaceString());

        for (Personality p : Personality.values())
            choiceBoxPersonality.getItems().add(p.getPersonalityString());

        for (Religion r : Religion.values())
            choiceBoxReligion.getItems().add(r.getReligionString());

        spinnerLevel.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerLevel.setEditable(true);

        choiceBoxRace.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if (t1 == null) spinnerAge.setEditable(false);

                else {
                    setAgeSpinnerBoundValues(t1);
                    spinnerAge.setEditable(true);
                }
            }
        });

        character = new Character();
    }

    public void setAgeSpinnerBoundValues(String sRace) {

        Race race = Race.getRaceByString(sRace);

        switch (race) {
            case DWARF:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(25, 760, 1));
                break;

            case ORC:
            case KHAAL:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(12, 65, 1));
                break;

            case ELF:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(30, 2000, 1));
                break;

            case HALF_ELF:
            case GNOME:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(16, 200, 1));
                break;

            case DZSENN:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(19, 240, 1));
                break;


            default:
                spinnerAge.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(13, 80, 1));
                break;
        }
    }

}
