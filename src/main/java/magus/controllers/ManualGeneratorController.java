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
import magus.model.Character;
import magus.model.Personality;
import magus.model.Race;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManualGeneratorController implements Initializable {

    @FXML
    private ChoiceBox<String> choiceBoxCaste;
    @FXML
    private ChoiceBox<String> choiceBoxRace;
    @FXML
    private ChoiceBox<String> choiceBoxPersonality;
    @FXML
    private Spinner<Integer> spinnerLevel;
    @FXML
    private Spinner<Integer> spinnerStrength;
    @FXML
    private Spinner<Integer> spinnerQuickness;
    @FXML
    private Spinner<Integer> spinnerDexterity;
    @FXML
    private Spinner<Integer> spinnerEndurance;
    @FXML
    private Spinner<Integer> spinnerHealth;
    @FXML
    private Spinner<Integer> spinnerBeauty;
    @FXML
    private Spinner<Integer> spinnerIntelligence;
    @FXML
    private Spinner<Integer> spinnerWill;
    @FXML
    private Spinner<Integer> spinnerAstral;
    @FXML
    private Spinner<Integer> spinnerPerception;
    @FXML
    private Spinner<Integer> spinnerDamageBonus;
    @FXML
    private Spinner<Integer> spinnerQuicknessInArmor;
    @FXML
    private Spinner<Integer> spinnerDexterityInArmor;
    @FXML
    private Spinner<Integer> spinnerBaseHealth;
    @FXML
    private Spinner<Integer> spinnerMaxHealth;
    @FXML
    private Spinner<Integer> spinnerBasePainResistance;
    @FXML
    private Spinner<Integer> spinnerMaxPainResistance;
    @FXML
    private Spinner<Integer> spinnerPainResistancePerLevel;
    @FXML
    private Spinner<Integer> spinnerExperiencePerPainResistance;
    @FXML
    private Spinner<Integer> spinnerBaseInitiative;
    @FXML
    private Spinner<Integer> spinnerInitiativeInArmor;
    @FXML
    private Spinner<Integer> spinnerInitiativeModifiers;
    @FXML
    private Spinner<Integer> spinnerExperiencePerInitiative;
    @FXML
    private Spinner<Integer> spinnerInitiativeWithoutWeapon;
    @FXML
    private Spinner<Integer> spinnerInitiativeHM;
    @FXML
    private Spinner<Integer> spinnerBaseAttack;
    @FXML
    private Spinner<Integer> spinnerAttackInArmor;
    @FXML
    private Spinner<Integer> spinnerAttackModifiers;
    @FXML
    private Spinner<Integer> spinnerExperiencePerAttack;
    @FXML
    private Spinner<Integer> spinnerAttackWithoutWeapon;
    @FXML
    private Spinner<Integer> spinnerAttackHM;
    @FXML
    private Spinner<Integer> spinnerBaseDefense;
    @FXML
    private Spinner<Integer> spinnerDefenseInArmor;
    @FXML
    private Spinner<Integer> spinnerDefenseModifiers;
    @FXML
    private Spinner<Integer> spinnerExperiencePerDefense;
    @FXML
    private Spinner<Integer> spinnerDefenseWithoutWeapon;
    @FXML
    private Spinner<Integer> spinnerDefenseHM;
    @FXML
    private Spinner<Integer> spinnerBaseAiming;
    @FXML
    private Spinner<Integer> spinnerAimingInArmor;
    @FXML
    private Spinner<Integer> spinnerAimingModifiers;
    @FXML
    private Spinner<Integer> spinnerExperiencePerAiming;
    @FXML
    private Spinner<Integer> spinnerAimingWithoutWeapon;
    @FXML
    private Spinner<Integer> spinnerAimingHM;
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

        spinnerLevel.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerLevel.setEditable(true);

        spinnerStrength.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerStrength.setEditable(true);

        spinnerQuickness.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerQuickness.setEditable(true);

        spinnerDexterity.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDexterity.setEditable(true);

        spinnerEndurance.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerEndurance.setEditable(true);

        spinnerHealth.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerHealth.setEditable(true);

        spinnerBeauty.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBeauty.setEditable(true);

        spinnerIntelligence.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerIntelligence.setEditable(true);

        spinnerWill.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerWill.setEditable(true);

        spinnerAstral.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAstral.setEditable(true);

        spinnerPerception.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerPerception.setEditable(true);

        spinnerDamageBonus.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDamageBonus.setEditable(true);

        spinnerQuicknessInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerQuicknessInArmor.setEditable(true);

        spinnerDexterityInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDexterityInArmor.setEditable(true);

        spinnerBaseHealth.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBaseHealth.setEditable(true);

        spinnerMaxHealth.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerMaxHealth.setEditable(true);

        spinnerExperiencePerPainResistance.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerExperiencePerPainResistance.setEditable(true);

        spinnerBasePainResistance.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBasePainResistance.setEditable(true);

        spinnerMaxPainResistance.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerMaxPainResistance.setEditable(true);

        spinnerPainResistancePerLevel.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerPainResistancePerLevel.setEditable(true);

        spinnerBaseInitiative.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBaseInitiative.setEditable(true);

        spinnerInitiativeInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerInitiativeInArmor.setEditable(true);

        spinnerInitiativeModifiers.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerInitiativeModifiers.setEditable(true);

        spinnerExperiencePerInitiative.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerExperiencePerInitiative.setEditable(true);

        spinnerInitiativeWithoutWeapon.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerInitiativeWithoutWeapon.setEditable(true);

        spinnerInitiativeHM.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerInitiativeHM.setEditable(true);

        spinnerBaseAttack.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBaseAttack.setEditable(true);

        spinnerAttackInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAttackInArmor.setEditable(true);

        spinnerAttackModifiers.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAttackModifiers.setEditable(true);

        spinnerExperiencePerAttack.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerExperiencePerAttack.setEditable(true);

        spinnerAttackWithoutWeapon.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAttackWithoutWeapon.setEditable(true);

        spinnerAttackHM.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAttackHM.setEditable(true);

        spinnerBaseDefense.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBaseDefense.setEditable(true);

        spinnerDefenseInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDefenseInArmor.setEditable(true);

        spinnerDefenseModifiers.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDefenseModifiers.setEditable(true);

        spinnerExperiencePerDefense.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerExperiencePerDefense.setEditable(true);

        spinnerDefenseWithoutWeapon.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDefenseWithoutWeapon.setEditable(true);

        spinnerDefenseHM.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerDefenseHM.setEditable(true);

        spinnerBaseAiming.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerBaseAiming.setEditable(true);

        spinnerAimingInArmor.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAimingInArmor.setEditable(true);

        spinnerAimingModifiers.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAimingModifiers.setEditable(true);

        spinnerExperiencePerAiming.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerExperiencePerAiming.setEditable(true);

        spinnerAimingWithoutWeapon.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAimingWithoutWeapon.setEditable(true);

        spinnerAimingHM.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1));
        spinnerAimingHM.setEditable(true);

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

        window.setScene(new Scene(root, 1210, 800));
    }

    @FXML
    public void backButtonAction() throws IOException {

        Stage window = (Stage) buttonBack.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/mainWindow.fxml"));
        Parent root = loader.load();

        window.setScene(new Scene(root, 393, 252));
    }

    private void setCharacterProperties() {
        character.setCaste(Caste.getCasteByString(choiceBoxCaste.getSelectionModel().getSelectedItem()));
        character.setRace(Race.getRaceByString(choiceBoxRace.getSelectionModel().getSelectedItem()));
        character.setPersonality(Personality.getPersonalityByString(choiceBoxPersonality.getSelectionModel().getSelectedItem()));
        character.setLevel(spinnerLevel.getValue());
    }

}
