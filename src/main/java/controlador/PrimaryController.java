package controlador;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private TextField txtnPreguntas;
    @FXML
    private Label lblError;
    public static int var = 0;
    @FXML
    private TextField txtRutaRespuestas;
    @FXML
    private TextField txtRutaPreguntas;
    
    @FXML
    private void switchToSecondary() throws IOException {
        
        if(validarNPreguntas()){
            var = Integer.parseInt(txtnPreguntas.getText());
            App.setRoot("secondary");
        }else{
            lblError.setText("Numero inválido");
        }
        
        
    }
    
    //esta validacion esta por verse si a futuro se modifica      
    private boolean validarNPreguntas() {
        if(txtnPreguntas.getText().isEmpty()){
            return false;
        }else{
            int n = Integer.parseInt(txtnPreguntas.getText());
            return (n<21 && n>0);  
            
        }
    }

    @FXML
    private void cargarPreguntas(ActionEvent event) {
    }

    @FXML
    private void cargarRespuestas(ActionEvent event) {
    }
    
    

}
        
        
        
