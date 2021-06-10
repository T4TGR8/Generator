package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import magus.Main;
import magus.exceptions.InvalidAttributeException;
import magus.model.*;
import magus.model.Character;

import java.io.IOException;


public final class ManualGeneratorController extends ManualGeneratorWindowController implements GeneratorController, GeneratorWindowContoller {

    public Character character;

    public Attributes attributes = new Attributes();

    public CombatStatistics statistics = new CombatStatistics();

    public HealthAndPainRes hpr = new HealthAndPainRes();

    @FXML
    public void generateAction() throws IOException {

        setCharacterAttributes();
        setCharacterStatistics();
        setCharacterHPR();
        setCharacterProperties();

        Stage window = (Stage) buttonGenerate.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/characterSheet.fxml"));
        Parent root = loader.load();

        CharacterSheetController controller = loader.getController();
        controller.setManualCharacter(character);

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

    public void setCharacterAttributes() {
        try {
            attributes.setStrength(spinnerStrength.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setQuickness(spinnerQuickness.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setDexterity(spinnerDexterity.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setEndurance(spinnerEndurance.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setHealth(spinnerHealth.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setBeauty(spinnerStrength.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setIntelligence(spinnerIntelligence.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setWill(spinnerWill.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setAstral(spinnerAstral.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
        try {
            attributes.setPerception(spinnerPerception.getValue());
        } catch (InvalidAttributeException e) {
            e.printStackTrace();
        }
    }

    public void setCharacterStatistics() {

        statistics.setBaseInitiativePoints(spinnerBaseInitiative.getValue());
        statistics.setBaseAttackPoints(spinnerBaseAttack.getValue());
        statistics.setBaseDefensePoints(spinnerBaseDefense.getValue());
        statistics.setBaseAimingPoints(spinnerBaseAiming.getValue());
    }

    public void setCharacterHPR() {

        hpr.setBaseHealthPoints(spinnerBaseHealth.getValue());
        hpr.setBasePainResistancePoints(spinnerBasePainResistance.getValue());
        hpr.setPainResistancePointsPerLevel(spinnerPainResistancePerLevel.getValue());
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
        character.setAttributes(attributes);
        character.setStatistics(statistics);
        character.setHealthAndPainRes(hpr);
    }

}
