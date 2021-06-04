package magus.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public interface GeneratorContoller {
    public void initialize(URL url, ResourceBundle resourceBundle);

    public void generateAction() throws IOException;

    public void backButtonAction() throws IOException;

    public void setCharacterProperties();
}
