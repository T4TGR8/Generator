package magus.generators;

import magus.exceptions.InvalidAttributeException;
import magus.model.Caste;
import magus.model.Character;

public class CharacterFactory implements CharacterGenFactory {

    CharacterGenerator gen;

    @Override
    public CharacterGen createCharacter(Character character) {

        switch (character.getCaste()) {
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
        return gen;
    }
}
