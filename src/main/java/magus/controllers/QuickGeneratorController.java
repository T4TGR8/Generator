package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import magus.Main;
import magus.model.*;

import java.io.IOException;

public class QuickGeneratorController extends QuickGeneratorWindowController implements GeneratorController, GeneratorWindowContoller {

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
}
