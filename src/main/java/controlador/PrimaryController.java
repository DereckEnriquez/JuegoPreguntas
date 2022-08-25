package controlador;

import java.io.File;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

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
    
    public Label fileLabel1 = new Label();
    public Label fileLabel2 = new Label();
    
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
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter ("TEXT files (*.txt)", "*.txt"));
        File preguntasTxt = fc.showOpenDialog(null);
        try{
            if(preguntasTxt!=null){
                fileLabel1.setText(preguntasTxt.getPath());                
                txtRutaPreguntas.setText(fileLabel1.getText());
                
                
                
            }
        }catch(Exception ex){
            Alert a=new Alert(Alert.AlertType.ERROR,"Error");
            a.show();
        }         
    }

    @FXML
    private void cargarRespuestas(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter ("TEXT files (*.txt)", "*.txt"));
        File repsuestasTxt = fc.showOpenDialog(null);
        try{
            if(repsuestasTxt!=null){
                fileLabel2.setText(repsuestasTxt.getPath());                
                txtRutaRespuestas.setText(fileLabel2.getText());
            }
        }catch(Exception ex){
            Alert a=new Alert(Alert.AlertType.ERROR,"Error");
            a.show();
        }  
    }
    
    
    

}
        
        
        
