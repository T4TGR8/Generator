package magus.controllers;

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

public class QuickGeneratorController implements Initializable {

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
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
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

    private void setCharacterProperties() {
        character.setName(textField_characterName.getText());
        character.setCaste(Caste.getCasteByString(choiceBoxCaste.getSelectionModel().getSelectedItem()));
        character.setRace(Race.getRaceByString(choiceBoxRace.getSelectionModel().getSelectedItem()));
        character.setPersonality(Personality.getPersonalityByString(choiceBoxPersonality.getSelectionModel().getSelectedItem()));
        character.setReligion(Religion.getReligionByString(choiceBoxReligion.getSelectionModel().getSelectedItem()));
        character.setBirthplace(textField_characterBirthplace.getText());
        character.setSchool(textField_characterSchool.getText());
        character.setLevel(spinnerLevel.getValue());
    }

}
