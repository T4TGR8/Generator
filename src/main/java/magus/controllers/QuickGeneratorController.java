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

public class QuickGeneratorController implements Initializable, GeneratorContoller {

    @FXML
    private TextField textField_characterName;
    @FXML
    private ChoiceBox<String> choiceBoxCaste;
    @FXML
    private ChoiceBox<String> choiceBoxRace;
    @FXML
    private ChoiceBox<String> choiceBoxPersonality;
    @FXML
    private ChoiceBox<String> choiceBoxReligion;
    @FXML
    private TextField textField_characterBirthplace;
    @FXML
    private TextField textField_characterSchool;
    @FXML
    private Spinner<Integer> spinnerLevel;
    @FXML
    private Spinner<Integer> spinnerAge;
    @FXML
    private Button buttonGenerate;
    @FXML
    private Button buttonBack;

    private Character character;

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

    @FXML
    public void generateAction() throws IOException {

        setCharacterProperties();

        Stage window = (Stage) buttonGenerate.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/characterSheet.fxml"));
        Parent root = loader.load();

        CharacterSheetController controller = loader.getController();
        controller.setCharacter(character);

        Scene scene = new Scene(root, 1210, 800);
        window.setScene(scene);
    }

    @FXML
    public void backButtonAction() throws IOException {

        Stage window = (Stage) buttonBack.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/mainWindow.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 393, 252);
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
        window.setScene(scene);
    }

    public void setCharacterProperties() {
        character.setName(textField_characterName.getText());
        character.setCaste(Caste.getCasteByString(choiceBoxCaste.getSelectionModel().getSelectedItem()));
        character.setRace(Race.getRaceByString(choiceBoxRace.getSelectionModel().getSelectedItem()));
        character.setPersonality(Personality.getPersonalityByString(choiceBoxPersonality.getSelectionModel().getSelectedItem()));
        character.setReligion(Religion.getReligionByString(choiceBoxReligion.getSelectionModel().getSelectedItem()));
        character.setBirthplace(textField_characterBirthplace.getText());
        character.setSchool(textField_characterSchool.getText());
        character.setLevel(spinnerLevel.getValue());
        character.setAge(spinnerAge.getValue());
    }

    private void setAgeSpinnerBoundValues(String sRace) {

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
