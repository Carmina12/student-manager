package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override

    public void start(Stage primaryStage) throws Exception {

<<<<<<< HEAD
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));

        primaryStage.setTitle("Student Manager");
=======
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));

        primaryStage.setTitle("FIS - Student Manager");
>>>>>>> master

        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
<<<<<<< HEAD

    }
=======
>>>>>>> master

    }

    public static void main(String[] args) {
        launch(args);
    }
}