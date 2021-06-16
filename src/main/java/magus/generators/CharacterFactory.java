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
                gen.spendCharacterCreationPoints(gen);
                break;
            case GLADIATOR:
                gen = new GladiatorGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case HEADHUNTER:
                gen = new HeadhunterGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case KNIGHT:
                gen = new KnightGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case AMAZON:
                gen = new AmazonGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case BARBARIAN:
                gen = new BarbarianGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case DUELER:
                gen = new DuelerGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case THIEF:
                gen = new ThiefGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case BARD:
                gen = new BardGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case ILLUSIONIST:
                gen = new IllusionistGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PSY_MASTER:
                gen = new Psy_masterGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PRIEST:
                gen = new PriestGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PALADIN:
                gen = new PaladinGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case MARTIAL_ARTIST:
                gen = new Martial_artistGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case SWORD_ARTIST:
                gen = new Sword_artistGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WITCH:
                gen = new WitchGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WITCH_MASTER:
                gen = new Witch_masterGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case FIRE_MAGE:
                gen = new Fire_mageGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WIZARD:
                gen = new WizardGen(character);
                gen.spendCharacterCreationPoints(gen);
                break;
        }
        return gen;
    }
}
