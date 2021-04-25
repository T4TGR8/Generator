package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import magus.generators.*;
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
    private Label labelName;
    @FXML
    private Label labelCaste;
    @FXML
    private Label labelRace;
    @FXML
    private Label labelPersonality;
    @FXML
    private Label labelReligion;
    @FXML
    private Label labelBirthplace;
    @FXML
    private Label labelSchool;
    @FXML
    private Label labelLevel;

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

    public void setManualCharacter(Character character) {
        this.character = character;

        setLabels();
    }

    private void setLabels() {
        labelName.setText(character.getName());
        labelCaste.setText(character.getCaste().getCasteName());
        labelRace.setText(character.getRace().getRaceString());
        labelPersonality.setText(character.getPersonality().getPersonalityString());
        labelReligion.setText(character.getReligion().getReligionString());
        labelBirthplace.setText(character.getBirthplace());
        labelSchool.setText(character.getSchool());
        labelLevel.setText(String.valueOf(character.getLevel()));

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
            case GLADIATOR:
                gen = new GladiatorGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case HEADHUNTER:
                gen = new HeadhunterGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case KNIGHT:
                gen = new KnightGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case AMAZON:
                gen = new AmazonGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case BARBARIAN:
                gen = new BarbarianGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case DUELER:
                gen = new DuelerGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case THIEF:
                gen = new ThiefGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case BARD:
                gen = new BardGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case ILLUSIONIST:
                gen = new IllusionistGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case PSY_MASTER:
                gen = new Psy_masterGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case PRIEST:
                gen = new PriestGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case PALADIN:
                gen = new PaladinGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case MARTIAL_ARTIST:
                gen = new Martial_artistGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case SWORD_ARTIST:
                gen = new Sword_artistGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case WITCH:
                gen = new WitchGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case WITCH_MASTER:
                gen = new Witch_masterGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case FIRE_MAGE:
                gen = new Fire_mageGen(character);
                gen.spendCharacterCreationPoints();
                break;
            case WIZARD:
                gen = new WizardGen(character);
                gen.spendCharacterCreationPoints();
                break;
        }
    }
}
