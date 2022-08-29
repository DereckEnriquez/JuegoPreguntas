package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
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
import modelos.ABB_1;
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
    
    LinkedList<String> preguntas = new LinkedList<>();
    LinkedList<String> respuestas = new LinkedList<>();
    
    ABB_1<String> arbol1 = new ABB_1<String>(); 
     

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image image= new Image(getClass().getResourceAsStream("genio.png"));
        imgview.setImage(image);
        lblPreguntasRestantes.setText(String.valueOf(PrimaryController.var - 1));
        lblContador.setText("1");
                       
        // leer rutas.txt
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("rutas.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            linea = br.readLine();            
            File ruta1 = null;
            FileReader fr1 = null;
            BufferedReader br1 = null;
            try {
                ruta1 = new File(linea);
                fr1 = new FileReader(ruta1);
                br1 = new BufferedReader(fr1);
                // Lectura del fichero
                String line;
                while ((line = br1.readLine()) != null){
                    preguntas.add(line);                                           
                }                                    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            linea = br.readLine();
            File ruta2 = null;
            FileReader fr2 = null;
            BufferedReader br2 = null;
            try {
                ruta2 = new File(linea);
                fr2 = new FileReader(ruta2);
                br2 = new BufferedReader(fr2);
                // Lectura del fichero
                String linea1;
                while ((linea1 = br2.readLine()) != null){
                    respuestas.add(linea1);                        
                }                                    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println(preguntas.get(i));            
        }
        for (int i = 0; i <respuestas.size(); i++) {
            System.out.println(respuestas.get(i));            
        }
        
        ABB_1.insertarPreguntas(arbol1, preguntas);        
        //ABB_1.insertarRespuestas(arbol1, respuestas);
        //LinkedList<LinkedList<String>> Resp = new LinkedList<>();
        
        while (!respuestas.isEmpty()){
            LinkedList<String> rTmp = new LinkedList<>();
            String[] r2Tmp = respuestas.getFirst().split(" ");
            for (int i = 0; i < r2Tmp.length; i++) {
                rTmp.add(r2Tmp[i]);                                
                System.out.println(r2Tmp[i]);
            }
            respuestas.removeFirst();            
            ABB_1.insertarRespuestas(arbol1, rTmp);                                        
        }
        
        lblPreguntas.setText((String) arbol1.nodo.getContenido()); 
                  
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void btnSi(ActionEvent event) throws IOException {
        
        if (Integer.parseInt(lblContador.getText()) < PrimaryController.var) {
            if (arbol1.nodo.getLeft()!= null ) {                
                txtSalida.setText("Ya estamos Cerca!!!");
                lblPreguntas.setText((String) arbol1.nodo.getLeft().nodo.getContenido());
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
            if (arbol1.nodo.getLeft() != null) {
                //elem = elem.getRightChild();
                txtSalida.setText("Ya casi !!!");
                lblPreguntas.setText((String) arbol1.nodo.getRight().nodo.getContenido());
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
