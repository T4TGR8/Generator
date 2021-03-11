package magus.model;

public class Character {
    int id;
    String name;
    Caste caste;
    Race race;
    int age;
    Personality personality;
    Religion religion;
    Symbol symbol;
    String birthplace;
    String school;
    int level;
    int experience_point;

    User user;

    Attributes attributes;
    Skills skills;
    Psy psy;
    CombatStatistics statistics;
    HealthAndPainRes healthAndPainRes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Caste getCaste() {
        return caste;
    }

    public void setCaste(Caste caste) {
        this.caste = caste;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personality getPersonality() {
        return personality;
    }

    public void setPersonality(Personality personality) {
        this.personality = personality;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience_point() {
        return experience_point;
    }

    public void setExperience_point(int experience_point) {
        this.experience_point = experience_point;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Psy getPsy() {
        return psy;
    }

    public void setPsy(Psy psy) {
        this.psy = psy;
    }

    public CombatStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(CombatStatistics statistics) {
        this.statistics = statistics;
    }

    public HealthAndPainRes getHealthAndPainRes() {
        return healthAndPainRes;
    }

    public void setHealthAndPainRes(HealthAndPainRes healthAndPainRes) {
        this.healthAndPainRes = healthAndPainRes;
    }

    public Character() {
    }
}
