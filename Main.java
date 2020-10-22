import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class Main extends Application {

    Stage window;
    Scene scene1, scene2;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    //tao cua so
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        TextField nameinput = new TextField();
      //  Label labell = new Label("Tra tu");

        Button button1 = new Button("Seacher");
       // Button button2 = new Button("Seacher");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(10);
        layout1.setPadding(new Insets(20,20,20,20));
        layout1.getChildren().addAll(nameinput, button1);
        scene1 = new Scene(layout1, 400, 400);

        Button button2 = new Button("Back Seacher");

        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 400,400);

        window.setScene(scene1);
        window.setTitle("Advanced English Dictionary");
        window.show();
    }
}
