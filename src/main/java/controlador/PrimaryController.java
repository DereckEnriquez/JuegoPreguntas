package controlador;

import java.io.IOException;
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
    
    

}
        
        
        
