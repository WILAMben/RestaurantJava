/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Scene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Alice
 */
public class FXMLNewReservController implements Initializable {
	@FXML
	private Label titre;
	@FXML
	private Button Valider;
	@FXML
	private TextField nom;
	@FXML
	private TextField date;
	@FXML
	private TextField nbrPers;
	@FXML
	private TextField numTel;
	@FXML
	private Button home;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
