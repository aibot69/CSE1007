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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Varun Tiwari
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button signinbutton;
    @FXML
    private Button guestlogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label signinlabel;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signinaction(ActionEvent event) throws IOException {
        String user=username.getText();
        String pass=password.getText();
        if(user.equalsIgnoreCase("Varun") && pass.equalsIgnoreCase("hello")){
            Parent p=FXMLLoader.load(getClass().getResource("MyProfile.fxml"));
            Scene s1=new Scene(p);
            Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(s1);
            window.show();
        }
        else{
            signinlabel.setText("Try again or use guest login.");
        }
    }

    @FXML
    private void guestloginaction(ActionEvent event) throws IOException {
        Parent p=FXMLLoader.load(getClass().getResource("Forum.fxml"));
        Scene s1=new Scene(p);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(s1);
        window.show();
    }
}
