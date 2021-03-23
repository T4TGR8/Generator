package magus.model;

import magus.exceptions.InvalidAttributeException;
import magus.modifiers.attribmods.SummarizedAttributeModifiers;

public class Attributes {
    int id;

    int strength;
    int quickness;
    int dexterity;
    int endurance;
    int health;
    int beauty;
    int intelligence;
    int will;
    int astral;
    int perception;

    Character character;

    private SummarizedAttributeModifiers summ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) throws InvalidAttributeException {
        if(3 <= strength && strength <= 28) this.strength = strength;
        else if(strength < 3) this.strength = 3;
        else throw new InvalidAttributeException();
    }

    public int getQuickness() {
        return quickness;
    }

    public void setQuickness(int quickness) throws InvalidAttributeException {
        if(3 <= quickness && quickness <= 24) this.quickness = quickness;
        else if(quickness < 3) this.quickness = 3;
        else throw new InvalidAttributeException();
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) throws InvalidAttributeException {
        if(3 <= dexterity && dexterity <= 24) this.dexterity = dexterity;
        else if(dexterity < 3) this.dexterity = 3;
        else throw new InvalidAttributeException();
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) throws InvalidAttributeException {
        if(3 <= endurance && endurance <= 24) this.endurance = endurance;
        else if(endurance < 3) this.endurance = 3;
        else throw new InvalidAttributeException();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) throws InvalidAttributeException {
        if(3 <= health && health <= 24) this.health = health;
        else if(health < 3) this.health = 3;
        else throw new InvalidAttributeException();
    }

    public int getBeauty() {
        return beauty;
    }

    public void setBeauty(int beauty) throws InvalidAttributeException {
        if(3 <= beauty && beauty <= 24) this.beauty = beauty;
        else if(beauty < 3) this.beauty = 3;
        else throw new InvalidAttributeException();
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) throws InvalidAttributeException {
        if(3 <= intelligence && intelligence <= 20) this.intelligence = intelligence;
        else if(intelligence < 3) this.intelligence = 3;
        else throw new InvalidAttributeException();
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) throws InvalidAttributeException {
        if(3 <= will && will <= 24) this.will = will;
        else if(will < 3) this.will = 3;
        else throw new InvalidAttributeException();
    }

    public int getAstral() {
        return astral;
    }

    public void setAstral(int astral) throws InvalidAttributeException {
        if(3 <= astral && astral <= 24) this.astral = astral;
        else if(astral < 3) this.astral = 3;
        else throw new InvalidAttributeException();
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) throws InvalidAttributeException {
        if(3 <= perception && perception <= 24) this.perception = perception;
        else if(perception < 3) this.perception = 3;
        else throw new InvalidAttributeException();
    }



    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }



    public SummarizedAttributeModifiers getSumm() {
        return summ;
    }

    public void setSumm(SummarizedAttributeModifiers summ) {
        this.summ = summ;
    }

    public Attributes(Character character) {
        this.character = character;
    }
}
