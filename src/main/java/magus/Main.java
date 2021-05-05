package magus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/views/loginWindow.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/views/style.css").toExternalForm());
        primaryStage.setTitle("M.A.G.U.S");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
