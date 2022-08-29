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
    public static void insertarPreguntas(ABB_1<String> arbol ,LinkedList<String> preguntas){        
            
            //nivel 0 
            if(!preguntas.isEmpty()){
                Nodo<String> nodo= new Nodo<>(preguntas.getFirst());
                arbol.setNodo(nodo);                                   
                preguntas.removeFirst();
            }
            
            //nivel 1
            if(!preguntas.isEmpty()){
                Nodo<String> n= new Nodo<>(preguntas.getFirst());   
                ABB_1 a = new ABB_1<>(n);
                Nodo<String> n1= new Nodo<>(preguntas.getFirst());   
                ABB_1 a1 = new ABB_1<>(n1);
                arbol.nodo.setRight(a);
                arbol.nodo.setLeft(a1);
                preguntas.removeFirst();
            }    
            
            //nivel 2
            if(!preguntas.isEmpty()){
                Nodo<String> n2= new Nodo<>(preguntas.getFirst());   
                ABB_1 a2 = new ABB_1<>(n2);
                Nodo<String> n3= new Nodo<>(preguntas.getFirst());   
                ABB_1 a3 = new ABB_1<>(n3);
                Nodo<String> n4= new Nodo<>(preguntas.getFirst());   
                ABB_1 a4 = new ABB_1<>(n4);
                Nodo<String> n5= new Nodo<>(preguntas.getFirst());   
                ABB_1 a5 = new ABB_1<>(n5);
                arbol.nodo.getLeft().nodo.setLeft(a2);
                arbol.nodo.getLeft().nodo.setRight(a3);
                arbol.nodo.getRight().nodo.setLeft(a4);
                arbol.nodo.getRight().nodo.setRight(a5);
                preguntas.removeFirst();
            }
                
            //nivel3
            if(!preguntas.isEmpty()){
                Nodo<String> n6= new Nodo<>(preguntas.getFirst());   
                ABB_1 a6 = new ABB_1<>(n6);
                Nodo<String> n7= new Nodo<>(preguntas.getFirst());   
                ABB_1 a7 = new ABB_1<>(n7);
                Nodo<String> n8= new Nodo<>(preguntas.getFirst());   
                ABB_1 a8 = new ABB_1<>(n8);
                Nodo<String> n9= new Nodo<>(preguntas.getFirst());   
                ABB_1 a9 = new ABB_1<>(n9);
                Nodo<String> n10= new Nodo<>(preguntas.getFirst());   
                ABB_1 a10 = new ABB_1<>(n10);
                Nodo<String> n11= new Nodo<>(preguntas.getFirst());   
                ABB_1 a11 = new ABB_1<>(n11);
                Nodo<String> n12= new Nodo<>(preguntas.getFirst());   
                ABB_1 a12 = new ABB_1<>(n12);
                Nodo    <String> n13= new Nodo<>(preguntas.getFirst());   
                ABB_1 a13 = new ABB_1<>(n13);
                arbol.nodo.getLeft().nodo.getLeft().nodo.setLeft(a6);
                arbol.nodo.getLeft().nodo.getLeft().nodo.setRight(a7);
                arbol.nodo.getLeft().nodo.getRight().nodo.setLeft(a8);
                arbol.nodo.getLeft().nodo.getRight().nodo.setRight(a9);
                arbol.nodo.getRight().nodo.getLeft().nodo.setLeft(a10);
                arbol.nodo.getRight().nodo.getLeft().nodo.setRight(a11);
                arbol.nodo.getRight().nodo.getRight().nodo.setLeft(a12);
                arbol.nodo.getRight().nodo.getRight().nodo.setRight(a13);  
                preguntas.removeFirst();                        
            }
            
            //nivel 4
            if(!preguntas.isEmpty()){
                Nodo<String> n00= new Nodo<>(preguntas.getFirst());   
                ABB_1 a00 = new ABB_1<>(n00);
                Nodo<String> n01= new Nodo<>(preguntas.getFirst());   
                ABB_1 a01 = new ABB_1<>(n01);
                Nodo<String> n= new Nodo<>(preguntas.getFirst());   
                ABB_1 a = new ABB_1<>(n);
                Nodo<String> n1= new Nodo<>(preguntas.getFirst());   
                ABB_1 a1 = new ABB_1<>(n1);
                Nodo<String> n2= new Nodo<>(preguntas.getFirst());   
                ABB_1 a2 = new ABB_1<>(n2);
                Nodo<String> n3= new Nodo<>(preguntas.getFirst());   
                ABB_1 a3 = new ABB_1<>(n3);
                Nodo<String> n4= new Nodo<>(preguntas.getFirst());   
                ABB_1 a4 = new ABB_1<>(n4);
                Nodo<String> n5= new Nodo<>(preguntas.getFirst());   
                ABB_1 a5 = new ABB_1<>(n5);
                Nodo<String> n6= new Nodo<>(preguntas.getFirst());   
                ABB_1 a6 = new ABB_1<>(n6);
                Nodo<String> n7= new Nodo<>(preguntas.getFirst());   
                ABB_1 a7 = new ABB_1<>(n7);
                Nodo<String> n8= new Nodo<>(preguntas.getFirst());   
                ABB_1 a8 = new ABB_1<>(n8);
                Nodo<String> n9= new Nodo<>(preguntas.getFirst());   
                ABB_1 a9 = new ABB_1<>(n9);
                Nodo<String> n10= new Nodo<>(preguntas.getFirst());   
                ABB_1 a10 = new ABB_1<>(n10);
                Nodo<String> n11= new Nodo<>(preguntas.getFirst());   
                ABB_1 a11 = new ABB_1<>(n11);
                Nodo<String> n12= new Nodo<>(preguntas.getFirst());   
                ABB_1 a12 = new ABB_1<>(n12);
                Nodo    <String> n13= new Nodo<>(preguntas.getFirst());   
                ABB_1 a13 = new ABB_1<>(n13);
                arbol.nodo.getLeft().nodo.getLeft().nodo.getLeft().nodo.setLeft(a00);
                arbol.nodo.getLeft().nodo.getLeft().nodo.getLeft().nodo.setRight(a01);
                arbol.nodo.getLeft().nodo.getLeft().nodo.getRight().nodo.setLeft(a);
                arbol.nodo.getLeft().nodo.getLeft().nodo.getRight().nodo.setRight(a1);
                arbol.nodo.getLeft().nodo.getRight().nodo.getLeft().nodo.setLeft(a2);
                arbol.nodo.getLeft().nodo.getRight().nodo.getLeft().nodo.setRight(a3);
                arbol.nodo.getLeft().nodo.getRight().nodo.getRight().nodo.setLeft(a4);
                arbol.nodo.getLeft().nodo.getRight().nodo.getRight().nodo.setRight(a5);
                arbol.nodo.getRight().nodo.getLeft().nodo.getLeft().nodo.setLeft(a6);
                arbol.nodo.getRight().nodo.getLeft().nodo.getLeft().nodo.setRight(a7);
                arbol.nodo.getRight().nodo.getLeft().nodo.getRight().nodo.setLeft(a8);
                arbol.nodo.getRight().nodo.getLeft().nodo.getRight().nodo.setRight(a9);
                arbol.nodo.getRight().nodo.getRight().nodo.getLeft().nodo.setLeft(a6);
                arbol.nodo.getRight().nodo.getRight().nodo.getLeft().nodo.setRight(a7);
                arbol.nodo.getRight().nodo.getRight().nodo.getRight().nodo.setLeft(a8);
                arbol.nodo.getRight().nodo.getRight().nodo.getRight().nodo.setRight(a9);                                                                                                               
                preguntas.removeFirst();                        
            }
    }
    /*
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
        
    }*/
    public  static void insertarRespuestas( ABB_1<String> arbol ,LinkedList<String> respuestas){
        while(!respuestas.isEmpty()){            
            //ABB_1<String> a = new ABB_1<>();
            if("sí".equals(respuestas.get(1)) && respuestas.size() == 2){
                Nodo<String> nodo= new Nodo<>(respuestas.getFirst());
                ABB_1<String> tmp = new ABB_1<>(nodo);
                arbol.nodo.setLeft(tmp);                    
                respuestas.removeFirst();
                respuestas.removeFirst();
            }
            else if("no".equals(respuestas.get(1)) && respuestas.size() == 2){
                Nodo<String> nodo= new Nodo<>(respuestas.getFirst());
                ABB_1<String> tmp = new ABB_1<>(nodo);
                arbol.nodo.setRight(tmp);                 
                respuestas.removeFirst();
                respuestas.removeFirst();
            }
            else if("sí".equals(respuestas.get(1))){                      
                respuestas.remove(1);
                Nodo<String> nodo= new Nodo<>(respuestas.get(1));
                ABB_1<String> tmp = new ABB_1<String>(nodo);
                //tmp = arbol.nodo.getLeft();
                insertarRespuestas(tmp,respuestas);
                
            }else{                  
                respuestas.remove(1);
                Nodo<String> nodo= new Nodo<>(respuestas.get(1));
                ABB_1<String> tmp = new ABB_1<String>(nodo);   
                //tmp = arbol.nodo.getRight();
                insertarRespuestas(tmp,respuestas);                                                                                             
            }    
        }
    }
}
