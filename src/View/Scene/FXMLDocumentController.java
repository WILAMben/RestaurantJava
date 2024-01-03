/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Scene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Alice
 */
public class FXMLDocumentController implements Initializable {
    
	@FXML
	private Label Titre;
	@FXML
	private Button buttonRecuperation;
	@FXML
	private Button buttonSalle;
	@FXML
	private Button buttonNewReserv;
	@FXML
	private Button buttonReserv;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
