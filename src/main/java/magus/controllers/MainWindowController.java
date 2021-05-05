package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import magus.Main;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController {

    @FXML
    private Button openQuickGenerate;

    @FXML
    private Button openManualGenerate;

    @FXML
    public void openQuickGenerate() throws IOException {

        Stage window = (Stage) openQuickGenerate.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/quickGenerator.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 360, 560);
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
        window.setScene(scene);
    }

    @FXML
    public void openManualGenerate() throws IOException {

        Stage window = (Stage) openManualGenerate.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/manualGenerator.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 990, 720);
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
        window.setScene(scene);
    }

}

