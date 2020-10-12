/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Varun Tiwari
 */
public class ForumController implements Initializable {

    @FXML
    private Button signout;
    @FXML
    private Button signout1;
    @FXML
    private Text questiontext;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signoutaction(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    }

    @FXML
    private void askquestion(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("qanda.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    }
    public void setLabelText(String text){
        questiontext.setText(text);
    }
    
}
