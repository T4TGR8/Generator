package magus.generators;

import magus.model.Character;

public class CharacterFactory implements CharacterGenFactory {

    CharacterGenerator gen;

    @Override
    public CharacterGen createCharacter(Character character) {

        switch (character.getCaste()) {
            case WARRIOR:
                gen = new WarriorGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case GLADIATOR:
                gen = new GladiatorGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case HEADHUNTER:
                gen = new HeadhunterGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case KNIGHT:
                gen = new KnightGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case AMAZON:
                gen = new AmazonGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case BARBARIAN:
                gen = new BarbarianGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case DUELER:
                gen = new DuelerGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case THIEF:
                gen = new ThiefGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case BARD:
                gen = new BardGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case ILLUSIONIST:
                gen = new IllusionistGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PSY_MASTER:
                gen = new Psy_masterGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PRIEST:
                gen = new PriestGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case PALADIN:
                gen = new PaladinGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case MARTIAL_ARTIST:
                gen = new Martial_artistGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case SWORD_ARTIST:
                gen = new Sword_artistGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WITCH:
                gen = new WitchGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WITCH_MASTER:
                gen = new Witch_masterGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case FIRE_MAGE:
                gen = new Fire_mageGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
            case WIZARD:
                gen = new WizardGen(character);
                character.setCharacterGen(gen);
                gen.spendCharacterCreationPoints(gen);
                break;
        }
        return gen;
    }
}
