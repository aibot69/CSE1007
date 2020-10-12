/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Varun Tiwari
 */
public class QandaController implements Initializable {

    @FXML
    private ComboBox versionmenu;
    @FXML
    private Label submitsuccess;
    @FXML
    private TextArea question;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list=FXCollections.observableArrayList("Trusty Tahr","Xenial Xerus","Bionic Beaver","Focal Fossa","Groovy Gorilla");
        versionmenu.setItems(list);
    }    

    @FXML
    private void gotoforum(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("Forum.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    } 

    @FXML
    private void submitquestion(ActionEvent event) {
        String s = question.getText();
        String v = versionmenu.getSelectionModel().getSelectedItem().toString();
        submitsuccess.setText("Question: "+s+" for Ubuntu version "+v);
    }

    @FXML
    private void logoutaction(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    }
}