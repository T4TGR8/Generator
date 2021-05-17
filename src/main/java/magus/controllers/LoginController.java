package magus.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import magus.Main;
import magus.exceptions.*;
import magus.model.User;
import magus.dao.UserDAO;

import java.io.IOException;

public class LoginController {

    UserDAO UD  = new UserDAO();

    @FXML
    private TextField tb_Username;

    @FXML
    private TextField tb_Password;

    @FXML
    private Button bt_Login;

    @FXML
    private Button bt_Register;

    @FXML
    public void bt_LoginPressed() throws IOException, WrongUserNameOrPasswordException {

        UD.loginUser(tb_Username.getText(), tb_Password.getText());

        Stage window = (Stage) bt_Login.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/mainWindow.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 392, 252);
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
        window.setScene(scene);
    }

    @FXML
    void bt_RegisterPressed() throws IOException, UserAlredyExistException {
        User user = new User(tb_Username.getText(), tb_Password.getText());

        UD.createUser(user);
    }

}

