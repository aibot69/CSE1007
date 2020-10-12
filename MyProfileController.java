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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Varun Tiwari
 */
public class MyProfileController implements Initializable {

    @FXML
    private TextField newpassword;
    @FXML
    private TextField newname;
    @FXML
    private Button skillbutton;
    @FXML
    private Label skilltext;
    @FXML
    private Label welcometext;
    @FXML
    private Label pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewskillsaction(ActionEvent event) {
        skilltext.setText("1.Python\n2.C++\n3.JS\n4.Java\n5.Ruby");
    }

    @FXML
    private void changenameaction(ActionEvent event) {
        String newname1=newname.getText();
        if(!"".equals(newname1)){
            welcometext.setText("Welcome back, "+newname1);
        }
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
    private void gotoforum(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("Forum.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    } 

    @FXML
    private void changepasswordaction(ActionEvent event) {
        pass.setText("Password changed!");
    }
}