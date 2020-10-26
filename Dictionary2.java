import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Dictionary2 extends Controller{

    @FXML
    private TextField tuthem;

    @FXML
    private TextField nghia;

    @FXML
    private Button trove;

    @FXML
    private Button luu;


    @FXML
    void Back(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Dictionary.fxml"));
        Parent studentViewParent = loader.load();
        Scene scene = new Scene(studentViewParent);
        Controller controller = loader.getController();
        //Controller selected = table.getSelectionModel().getSelectedItem();
        stage.setScene(scene);
    }


    @FXML
    void Save(ActionEvent event) throws IOException {
        dm.dictionaryExportToFile(tuthem.getText() , nghia.getText());

    }

    public void Add1(ActionEvent actionEvent) {
    }

    public void Mean(ActionEvent actionEvent) {
    }
}
