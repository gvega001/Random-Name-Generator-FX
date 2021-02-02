package online.dev4you;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    NumberGenerator numberGenerator = new NumberGeneratorImpl();
    Student student = new Student();

    @Override
    public void start(Stage primaryStage) throws Exception{
        student.setFirstName("test");
        student.setLastName("student");
        Parent root = FXMLLoader.load(getClass().getResource("online.dev4you.fxml"));
        primaryStage.setTitle("The next student is: "+ numberGenerator.next());
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

