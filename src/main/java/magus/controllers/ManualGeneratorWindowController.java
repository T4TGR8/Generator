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

public class ManualGeneratorWindowController implements Initializable {
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
    protected Spinner<Integer> spinnerStrength;
    @FXML
    protected Spinner<Integer> spinnerQuickness;
    @FXML
    protected Spinner<Integer> spinnerDexterity;
    @FXML
    protected Spinner<Integer> spinnerEndurance;
    @FXML
    protected Spinner<Integer> spinnerHealth;
    @FXML
    protected Spinner<Integer> spinnerBeauty;
    @FXML
    protected Spinner<Integer> spinnerIntelligence;
    @FXML
    protected Spinner<Integer> spinnerWill;
    @FXML
    protected Spinner<Integer> spinnerAstral;
    @FXML
    protected Spinner<Integer> spinnerPerception;
    @FXML
    protected Spinner<Integer> spinnerDamageBonus;
    @FXML
    protected Spinner<Integer> spinnerQuicknessInArmor;
    @FXML
    protected Spinner<Integer> spinnerDexterityInArmor;
    @FXML
    protected Spinner<Integer> spinnerBaseHealth;
    @FXML
    protected Spinner<Integer> spinnerMaxHealth;
    @FXML
    protected Spinner<Integer> spinnerBasePainResistance;
    @FXML
    protected Spinner<Integer> spinnerMaxPainResistance;
    @FXML
    protected Spinner<Integer> spinnerPainResistancePerLevel;
    @FXML
    protected Spinner<Integer> spinnerExperiencePerPainResistance;
    @FXML
    protected Spinner<Integer> spinnerBaseInitiative;
    @FXML
    protected Spinner<Integer> spinnerInitiativeInArmor;
    @FXML
    protected Spinner<Integer> spinnerInitiativeModifiers;
    @FXML
    protected Spinner<Integer> spinnerExperiencePerInitiative;
    @FXML
    protected Spinner<Integer> spinnerInitiativeWithoutWeapon;
    @FXML
    protected Spinner<Integer> spinnerInitiativeHM;
    @FXML
    protected Spinner<Integer> spinnerBaseAttack;
    @FXML
    protected Spinner<Integer> spinnerAttackInArmor;
    @FXML
    protected Spinner<Integer> spinnerAttackModifiers;
    @FXML
    protected Spinner<Integer> spinnerExperiencePerAttack;
    @FXML
    protected Spinner<Integer> spinnerAttackWithoutWeapon;
    @FXML
    protected Spinner<Integer> spinnerAttackHM;
    @FXML
    protected Spinner<Integer> spinnerBaseDefense;
    @FXML
    protected Spinner<Integer> spinnerDefenseInArmor;
    @FXML
    protected Spinner<Integer> spinnerDefenseModifiers;
    @FXML
    protected Spinner<Integer> spinnerExperiencePerDefense;
    @FXML
    protected Spinner<Integer> spinnerDefenseWithoutWeapon;
    @FXML
    protected Spinner<Integer> spinnerDefenseHM;
    @FXML
    protected Spinner<Integer> spinnerBaseAiming;
    @FXML
    protected Spinner<Integer> spinnerAimingInArmor;
    @FXML
    protected Spinner<Integer> spinnerAimingModifiers;
    @FXML
    protected Spinner<Integer> spinnerExperiencePerAiming;
    @FXML
    protected Spinner<Integer> spinnerAimingWithoutWeapon;
    @FXML
    protected Spinner<Integer> spinnerAimingHM;
    @FXML
    protected Button buttonGenerate;
    @FXML
    protected Button buttonBack;

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
    }
}
