/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Tazam
 */
public class FXMLMainFrameController implements Initializable {
    
    @FXML
    AnchorPane anchorPaneContactTable,anchorPaneContactDetails;
    @FXML
    Pane mainPane;
    @FXML
    Button newContactButton,newPhoneNumberButton;
    
    
    @FXML
    private void handleButtonNewContact(ActionEvent event) {
        Parent root;
        try {

            root = FXMLLoader.load(getClass().getResource("FXMLContactPanel.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("New Contact");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainFrameController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @FXML
    private void handleButtonNewPhoneNumber(ActionEvent event) {
        Parent root;
        try {

            root = FXMLLoader.load(getClass().getResource("FXMLNewPhoneNumber.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("New Phone Number");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLMainFrameController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
