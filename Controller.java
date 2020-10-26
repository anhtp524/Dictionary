import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    DictionaryManagement dm = new DictionaryManagement();
    @FXML
    private TextField nhap;

    @FXML
    private Button tim;

    @FXML
    private Button them;

    @FXML
    private Button xoa;

    @FXML
    private Button sua;

    @FXML
    private WebView webview;

    @FXML

    void Add(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Dictionary2.fxml"));
        Parent studentViewParent = loader.load();
        Scene scene = new Scene(studentViewParent);
        Dictionary2 controller = loader.getController();
        //Controller selected = table.getSelectionModel().getSelectedItem();
        stage.setScene(scene);

    }

    @FXML
    void Delete(ActionEvent event) {
        dm.deleteWord();
    }

    @FXML
    void Find(ActionEvent event) throws IOException {
        dm.insertFromFile();
        String s = nhap.getText();
        if(dm.dictionaryLookup(s) != null) {
            webview.getEngine().loadContent(dm.dictionaryLookup(s).getMean());
        } else {
            webview.getEngine().loadContent("Khong co tu nay trong tu dien");
        }
    }

    @FXML
    void Repair(ActionEvent event) {
        if(dm.dictionaryLookup(nhap.getText()) != null ) {
            dm.fixWord(nhap.getText());
        }
    }



}