/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Estudiante
 */
public class ABB_1 <Integer> {
    
    public Nodo nodo;
    
    public ABB_1(){
        this.nodo = new Nodo<>();
    }

    public ABB_1(Nodo<String> nodo) {
        this.nodo = nodo;
    }
    
    public ABB_1(String contenido) {
        this.nodo = new Nodo<String>(contenido);
    }

    public Nodo<String> getNodo() {
        return nodo;
    }

    public void setNodo(Nodo<String> nodo) {
        this.nodo = nodo;
    }    
    public void setLeft(ABB_1<String> arbol){
        this.nodo.setRight(arbol);
    }
    public void setRight(ABB_1<String> arbol){
        this.nodo.setLeft(arbol);
    }    
    
    public ABB_1<String> getLeft (){
        return this.nodo.getLeft();
    }           
    
    public ABB_1<String> getRight (){
        return this.nodo.getRight();
    } 
    
    public boolean isEmpty(){
        return this.nodo.getContenido() == null;
    }
    
    public boolean esHoja (){
        if (this.nodo.getLeft() == null && this.nodo.getRight() == null) return true;
        else return false;
    }    
    
    public  static void insertarPreguntas( ABB_1<String> arbol ,LinkedList<String> preguntas){ 
                
        while(!preguntas.isEmpty()){
            if(arbol.isEmpty()){            
                arbol.nodo.setContenido(preguntas.getFirst());                                    
                preguntas.removeFirst();
            }                           
            else if(arbol.nodo.getLeft() == null && arbol.nodo.getRight()== null){
                ABB_1<String> cont = new ABB_1<String>(preguntas.getFirst());
                arbol.nodo.setRight(cont);
                arbol.nodo.setLeft(cont);
                preguntas.removeFirst();
                
            } else{
                insertarPreguntas(arbol.nodo.getRight(),preguntas);
                
                insertarPreguntas(arbol.nodo.getLeft(),preguntas);                   
            }                           
        }                        
        
    }
    public  static void insertarRespuestas( ABB_1<String> arbol ,LinkedList<String> respuestas){
        while(!respuestas.isEmpty()){
            
            if("sí".equals(respuestas.get(1)) && respuestas.size() == 2){
                ABB_1<String> tmp = new ABB_1<String>(respuestas.getFirst());
                arbol.nodo.setLeft(tmp);                
                respuestas.removeFirst();
                respuestas.removeFirst();
            }
            else if("no".equals(respuestas.get(1)) && respuestas.size() == 2){
                ABB_1<String> tmp = new ABB_1<String>(respuestas.getFirst());
                arbol.nodo.setRight(tmp);              
                respuestas.removeFirst();
                respuestas.removeFirst();
            }
            else if("sí".equals(respuestas.get(1))){        
                respuestas.remove(1);
                insertarRespuestas(arbol.nodo.getLeft(),respuestas);
                
            }else if("no".equals(respuestas.get(1))){  
                respuestas.remove(1);
                insertarRespuestas(arbol.nodo.getRight(),respuestas);                                                                                              
            }    
        }
    }
}
