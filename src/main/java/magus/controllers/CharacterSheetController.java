package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import magus.generators.*;
import magus.model.*;
import magus.model.Character;
import magus.modifiers.combatstatmods.CombatPointModifiers;
import magus.modifiers.healthstatmods.HpAndRpModifiers;

import java.net.URL;
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
    private Label labelExtraDamage;
    @FXML
    private Label labelQuickness;
    @FXML
    private Label labelQuicknessInArmor;
    @FXML
    private Label labelDexterity;
    @FXML
    private Label labelDexterityInArmor;
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
    private Label combatModifierIni;
    @FXML
    private Label initiativePointWithoutWep;
    @FXML
    private Label baseAttackPoint;
    @FXML
    private Label combatModifierAp;
    @FXML
    private Label attackPointWithoutWep;
    @FXML
    private Label baseDefencePoint;
    @FXML
    private Label combatModifierDef;
    @FXML
    private Label defencePointWithoutWep;
    @FXML
    private Label baseAimPoint;
    @FXML
    private Label combatModifierAim;
    @FXML
    private Label aimPointWithoutWep;

    @FXML
    private Label initiativePointModifier;
    @FXML
    private Label attackPointModifier;
    @FXML
    private Label defencePointModifier;
    @FXML
    private Label aimPointModifier;


    @FXML
    private Label baseHealth;
    @FXML
    private Label maxHealth;
    @FXML
    private Label basePain;
    @FXML
    private Label maxPain;
    @FXML
    private Label PainResPerLevel;
    @FXML
    private Label XpPerPainResPoint;


    @FXML
    private Label combatModifierPerLevel;
    @FXML
    private Label combatModifierInitiativePoint;
    @FXML
    private Label combatModifierAttackPoint;
    @FXML
    private Label combatModifierDefensePoint;
    @FXML
    private Label combatModifierAimPoint;


    @FXML
    private Label psySchoolType;
    @FXML
    private Label psyUsageGrade;
    @FXML
    private Label psyUsageLevel;
    @FXML
    private Label basePsyPoint;
    @FXML
    private Label maxPsyPointPerLevel;
    @FXML
    private Label psyPointPerLevel;
    @FXML
    private Label xpPerPsyPoint;
    @FXML
    private Label psyPoints;


    @FXML
    private Label staticAstralMagicShield;
    @FXML
    private Label staticMentalMagicShield;
    @FXML
    private Label dynamicAstralMagicShield;
    @FXML
    private Label dynamicMentalMagicShield;
    @FXML
    private Label miscAstralMagicShield;
    @FXML
    private Label miscMentalMagicShield;
    @FXML
    private Label astralMagicShield;
    @FXML
    private Label mentalMagicShield;


    @FXML
    private Label actualXp;
    @FXML
    private Label xpForNextLevel;


    private Character character;
    private CharacterFactory characterFactory = new CharacterFactory();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        BackgroundImage image = new BackgroundImage(new Image("/characterSheet.jpg", 1191, 1684, false, true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);

        pane.setBackground(new Background(image));
    }

    public void setCharacter(Character character) {
        this.character = character;

        characterFactory.createCharacter(this.character);

        setLabels();
    }

    public void setManualCharacter(Character character) {
        this.character = character;

        setLabels();
    }

    private void setLabels() {
        CombatPointModifiers cpm = new CombatPointModifiers();
        HpAndRpModifiers hpm = new HpAndRpModifiers();

        Attributes atr = character.getAttributes();
        CombatStatistics stat = character.getStatistics();
        HealthAndPainRes HPR = character.getHealthAndPainRes();
        Psy psy = character.getPsy();

        int[] allModifiers = cpm.combatModifierSpender(stat.getCombatModifierPerLevel(), character.getCaste());


        labelName.setText(character.getName());
        labelCaste.setText(character.getCaste().getCasteName());
        labelRace.setText(character.getRace().getRaceString());
        labelPersonality.setText(character.getPersonality().getPersonalityString());
        labelReligion.setText(character.getReligion().getReligionString());
        labelBirthplace.setText(character.getBirthplace());
        labelSchool.setText(character.getSchool());
        labelLevel.setText(String.valueOf(character.getLevel()));


        labelStrength.setText(String.valueOf(atr.getStrength()));
        labelExtraDamage.setText(String.valueOf(cpm.DamageModifier(character.getAttributes().getStrength())));
        labelQuickness.setText(String.valueOf(atr.getQuickness()));
        labelQuicknessInArmor.setText(String.valueOf(atr.getQuickness()));
        labelDexterity.setText(String.valueOf(atr.getDexterity()));
        labelDexterityInArmor.setText(String.valueOf(atr.getDexterity()));
        labelEndurance.setText(String.valueOf(atr.getEndurance()));
        labelHealth.setText(String.valueOf(atr.getHealth()));
        labelBeauty.setText(String.valueOf(atr.getBeauty()));
        labelIntelligence.setText(String.valueOf(atr.getIntelligence()));
        labelWill.setText(String.valueOf(atr.getWill()));
        labelAstral.setText(String.valueOf(atr.getAstral()));
        labelPerception.setText(String.valueOf(atr.getPerception()));


        baseInitiativePoint.setText(String.valueOf(stat.getBaseInitiativePoints()));
        baseAttackPoint.setText(String.valueOf(stat.getBaseAttackPoints()));
        baseDefencePoint.setText(String.valueOf(stat.getBaseDefensePoints()));
        baseAimPoint.setText(String.valueOf(stat.getBaseAimingPoints()));

        int initMod = (cpm.InitiativePointModifiers(atr.getDexterity(), atr.getQuickness()));
        initiativePointModifier.setText(String.valueOf(initMod));
        initiativePointWithoutWep.setText(String.valueOf(stat.getInitiativePoints() +
                allModifiers[0] * character.getLevel()));

        int apMod = cpm.AttackPointModifiers(atr.getStrength(), atr.getDexterity(), atr.getQuickness());
        attackPointModifier.setText(String.valueOf(apMod));
        attackPointWithoutWep.setText(String.valueOf(stat.getAttackPoints() +
                allModifiers[1] * character.getLevel()));

        int defMod = cpm.DefendPointModifiers(atr.getDexterity(), atr.getQuickness());
        defencePointModifier.setText(String.valueOf(defMod));
        defencePointWithoutWep.setText(String.valueOf(stat.getDefensePoints() +
                allModifiers[2] * character.getLevel()));

        int aimMod = cpm.AimingPointModifiers(atr.getDexterity());
        aimPointModifier.setText(String.valueOf(aimMod));
        aimPointWithoutWep.setText(String.valueOf(stat.getAimingPoints() +
                allModifiers[3] * character.getLevel()));


        baseHealth.setText(String.valueOf(HPR.getBaseHealthPoints()));
        maxHealth.setText(String.valueOf(HPR.getMaxHealthPoints()));
        basePain.setText(String.valueOf(HPR.getBasePainResistancePoints()));
        maxPain.setText(String.valueOf(HPR.getMaxPainResistancePoints()));
        PainResPerLevel.setText(String.valueOf(HPR.getPainResistancePointsPerLevel()));
        XpPerPainResPoint.setText(String.valueOf(hpm.painResistancePontForXP(character.getCaste())));


        combatModifierPerLevel.setText(String.valueOf(stat.getCombatModifierPerLevel()));
        combatModifierInitiativePoint.setText(String.valueOf(allModifiers[0]));
        combatModifierAttackPoint.setText(String.valueOf(allModifiers[1]));
        combatModifierDefensePoint.setText(String.valueOf(allModifiers[2]));
        combatModifierAimPoint.setText(String.valueOf(allModifiers[3]));

        combatModifierIni.setText(String.valueOf(allModifiers[0] * character.getLevel()));
        combatModifierAp.setText(String.valueOf(allModifiers[1] * character.getLevel()));
        combatModifierDef.setText(String.valueOf(allModifiers[2] * character.getLevel()));
        combatModifierAim.setText(String.valueOf(allModifiers[3] * character.getLevel()));


        //psySchoolType.setText(psy.getPsySchool().name().toLowerCase());
        //psyUsageLevel.setText(String.valueOf(psy.getUsageLevel()));
        //psyUsageGrade.setText(String.valueOf(psy.getUsageGrade()));
        //basePsyPoint.setText(String.valueOf(psy.getBasePsyPoint()));
        //psyPointPerLevel.setText(String.valueOf(psy.getPsyPointPerLevel()));
        //maxPsyPointPerLevel.setText(String.valueOf(psy.getMaxPsyPointPerLevel()));
        //xpPerPsyPoint.setText(String.valueOf(psy.getXpPerPsyPoint()));
        //psyPoints.setText(String.valueOf(psy.getPsyPoints()));


        staticAstralMagicShield.setText(String.valueOf(psy.getStaticAstralMagicShield()));
        staticMentalMagicShield.setText(String.valueOf(psy.getStaticMentalMagicShield()));
        dynamicAstralMagicShield.setText(String.valueOf(psy.getDynamicAstralMagicShield()));
        dynamicMentalMagicShield.setText(String.valueOf(psy.getDynamicMentalMagicShield()));
        miscAstralMagicShield.setText(String.valueOf(psy.getMiscAstralMagicShield()));
        miscMentalMagicShield.setText(String.valueOf(psy.getMiscMentalMagicShield()));
        astralMagicShield.setText(String.valueOf(psy.getAstralMagicShield()));
        mentalMagicShield.setText(String.valueOf(psy.getMentalMagicShield()));


        actualXp.setText(String.valueOf(character.getExperiencePoint()));
        xpForNextLevel.setText(String.valueOf(character.getXpForNextLevel()));
    }
}
