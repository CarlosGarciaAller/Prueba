package es.carlos.DAM;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class MainWindow extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label label = new Label("Hola mundo");
        Scene scene = new Scene(label, 100, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main (String args[]) {
        launch(args);
    }

}
