package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import magus.generators.CharacterGenerator;
import magus.generators.WarriorGen;
import magus.model.Attributes;
import magus.model.Character;
import magus.model.CombatStatistics;
import magus.model.HealthAndPainRes;
import magus.model.Skills;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class CharacterSheetController implements Initializable {
    @FXML
    private Pane pane;

    @FXML
    private Label labelStrength;
    @FXML
    private Label labelQuickness;
    @FXML
    private Label labelDexterity;
    @FXML
    private Label labelEndurance;
    @FXML
    private Label labelHealth;
    @FXML
    private Label labelBeauty;
    @FXML
    private Label labelIntelligence;
    @FXML
    private Label labelWill;
    @FXML
    private Label labelAstral;
    @FXML
    private Label labelPerception;

    @FXML
    private Label baseInitiativePoint;
    @FXML
    private Label baseAttackPoint;
    @FXML
    private Label baseDefencePoint;
    @FXML
    private Label baseAimPoint;

    @FXML
    private Label baseHealth;
    @FXML
    private Label basePain;
    @FXML
    private Label PainResPerLevel;
    /*
    @FXML
    private Label labelPerception;
    @FXML
    private Label labelPerception;
    @FXML
    private Label labelPerception;
    */

    private Character character;
    private CharacterGenerator gen;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BackgroundImage image = new BackgroundImage(new Image("/characterSheet.jpg", 1191, 1684, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        pane.setBackground(new Background(image));
    }

    public void setCharacter(Character character) {
        this.character = character;
        generateCharacterFromCaste();

        setLabels();
    }

    private void setLabels() {
        Attributes atr = character.getAttributes();
        labelStrength.setText(String.valueOf(atr.getStrength()));
        labelQuickness.setText(String.valueOf(atr.getQuickness()));
        labelDexterity.setText(String.valueOf(atr.getDexterity()));
        labelEndurance.setText(String.valueOf(atr.getEndurance()));
        labelHealth.setText(String.valueOf(atr.getHealth()));
        labelBeauty.setText(String.valueOf(atr.getBeauty()));
        labelIntelligence.setText(String.valueOf(atr.getIntelligence()));
        labelWill.setText(String.valueOf(atr.getWill()));
        labelAstral.setText(String.valueOf(atr.getAstral()));
        labelPerception.setText(String.valueOf(atr.getPerception()));

        CombatStatistics stat = character.getStatistics();
        baseInitiativePoint.setText(String.valueOf(stat.getBaseInitiativePoints()));
        baseAttackPoint.setText(String.valueOf(stat.getBaseAttackPoints()));
        baseDefencePoint.setText(String.valueOf(stat.getBaseDefensePoints()));
        baseAimPoint.setText(String.valueOf(stat.getBaseAimingPoints()));

        HealthAndPainRes HPR = character.getHealthAndPainRes();
        baseHealth.setText(String.valueOf(HPR.getBaseHealthPoints()));
        basePain.setText(String.valueOf(HPR.getBasePainResistancePoints()));
        PainResPerLevel.setText(String.valueOf(HPR.getPainResistancePointsPerLevel()));
    }

    private void generateCharacterFromCaste(){

        switch (character.getCaste()){
            case WARRIOR:
                gen = new WarriorGen(character);
                gen.spendCharacterCreationPoints();
                break;
        }
    }
}
