package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modelos.ABB;
import modelos.NodoABB;
//import java.awt.*;
//import javax.swing.*; 

public class SecondaryController implements Initializable {

    @FXML
    private Label lblContador;
    @FXML
    private Label lblPreguntas;
    @FXML
    private Label lblPreguntasRestantes;
    @FXML
    private TextArea txtSalida;
    @FXML
    private Button secondaryButton;
    @FXML
    private Button btnSi;
    @FXML
    private Button btnNo;
    NodoABB elem = ABB.root;
    @FXML
    private ImageView imgview;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image= new Image(getClass().getResourceAsStream("genio.png"));
imgview.setImage(image);
        lblPreguntasRestantes.setText(String.valueOf(PrimaryController.var - 1));
        lblContador.setText("1");
        txtSalida.setText(elem.getP());
        lblPreguntas.setText(elem.getP());
        //recorrerArbol(new NodoAVV, PrimaryController.var);

    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void btnSi(ActionEvent event) throws IOException {
        //ABB.imprimirArbol();
        if (Integer.parseInt(lblContador.getText()) < PrimaryController.var) {
            if (elem.getLeftChild() != null) {
                elem = elem.getLeftChild();
                txtSalida.setText(elem.getP());
                lblPreguntas.setText(elem.getP());
                lblContador.setText(String.valueOf(Integer.parseInt(lblContador.getText()) + 1));
                lblPreguntasRestantes.setText(String.valueOf(Integer.parseInt(lblPreguntasRestantes.getText()) - 1));
            } else {
                elem = elem.getLeftChild();
                txtSalida.setText("Animal desconocido");
                lblPreguntas.setText("Animal desconocido");
            }
            /*if (Integer.parseInt(lblPreguntasRestantes.getText()) == 0)
            {
                txtSalida.setText("Se acabaron las preguntas, animal desconocido.");
            }*/
        } else {
            lblContador.setText(String.valueOf(Integer.parseInt(lblContador.getText()) + 1));
            lblPreguntasRestantes.setText(String.valueOf(Integer.parseInt(lblPreguntasRestantes.getText()) - 1));
            NodoABB.pesentHojas(elem);

            //txtSalida.setText("Limite");
        }
        /**
         * Pd. No paren bola mision fallida al hacerlo de otra forma, tampoco
         * paren bola al metodo siguienteElemnt() if(elem.equals(ABB.root)) {
         * elem.setKey(elem.getKey() -1);
         * System.out.println("Key=>"+elem.getKey()); } elem =
         * ABB.siguienteElemnt(47,lvl ); lvl+=1; elem.setKey(elem.getKey()-1);
        txtSalida.setText(elem.getP());
         */

    }

    @FXML
    private void btnNo(ActionEvent event) {
        if (Integer.parseInt(lblContador.getText()) < PrimaryController.var) {
            if (elem.getRightChild() != null) {
                elem = elem.getRightChild();
                txtSalida.setText(elem.getP());
                lblPreguntas.setText(elem.getP());
                lblContador.setText(String.valueOf(Integer.parseInt(lblContador.getText()) + 1));
                lblPreguntasRestantes.setText(String.valueOf(Integer.parseInt(lblPreguntasRestantes.getText()) - 1));
            } else {

                txtSalida.setText("Animal desconocido");
                lblPreguntas.setText("Animal desconocido");
            }
        } else {
            lblContador.setText(String.valueOf(Integer.parseInt(lblContador.getText()) + 1));
            lblPreguntasRestantes.setText(String.valueOf(Integer.parseInt(lblPreguntasRestantes.getText()) - 1));
            NodoABB.pesentHojas(elem);
            //txtSalida.setText("Limite");
        }
    }

}
