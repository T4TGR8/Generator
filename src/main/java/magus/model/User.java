package magus.model;

import magus.Encryption;

import java.util.HashSet;
import java.util.Set;

public class User {
    private int id;
    private String name;
    private String password;

    private Set<Character> characters;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       // this.password = Encryption.getMd5(password);
         this.password = password + "#";
    }

    public Set<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public void addCharacter(Character character){
        this.characters.add(character);
    }

    public User() {
        characters = new HashSet<>();
    }

    public User(String name, String password) {
        this();
        setName(name);
        setPassword(password);
    }
}
