package magus.model;

public enum Caste {
    WARRIOR ("Harcos"),
    GLADIATOR ("Gladiátor"),
    HEADHUNTER ("Fejvadász"),
    KNIGHT ("Lovag"),
    AMAZON ("Amazon"),
    BARBARIAN ("Barbár"),
    DUELER ("Bajvívó"),
    THIEF ("Tolvaj"),
    BARD ("Bárd"),
    ILLUSIONIST ("Illúzionista"),
    PSY_MASTER ("Pszi Mester"),
    PRIEST ("Pap"),
    PALADIN ("Paplovag"),
    MARTIAL_ARTIST ("Harcművész"),
    SWORD_ARTIST ("KardMűvész"),
    WITCH ("Boszorkány"),
    WITCH_MASTER ("Boszorkánymester"),
    FIRE_MAGE ("Tűzvarázsló"),
    WIZARD ("Varázsló");

    private final String casteName;

    Caste(String casteName){
        this.casteName = casteName;
    }

    public String getCasteName() {
        return casteName;
    }

    public static Caste getCasteByString(String caste){
        for (Caste c : values()){
            if (c.getCasteName().equals(caste)){
                return c;
            }
        }

        return null;
    }
}
