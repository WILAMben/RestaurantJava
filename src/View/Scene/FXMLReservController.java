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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Alice
 */
public class FXMLReservController implements Initializable {
	@FXML
	private Label titre;
	@FXML
	private Button Valider;
	@FXML
	private Button home;
	@FXML
	private Button Supprimer;
	@FXML
	private DatePicker date;
	@FXML
	private ListView<String> infoReserv;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
