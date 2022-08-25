/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 * Arbol Bianrio Balanceado
 * @author Estudiante
 */
public class Nodo <String>{
    public String contenido;
    public ABB_1 <String> left;
    public ABB_1 <String> right;
    
    public Nodo(){
        this.contenido = null;
        this.left = null;
        this.right = null;        
    }
    
    public Nodo(String contenido){
        this.contenido = contenido;
        this.left = null;
        this.right = null;   
    }
    
    public Nodo(String contenido,ABB_1 <String> left, ABB_1 <String> right){
        this.contenido = contenido;
        this.left = left;
        this.right = right;   
    } 
       
    public String getContenido() {
        return contenido;
    }

    public ABB_1<String> getLeft() {
        return left;
    }

    public ABB_1<String> getRight() {
        return right;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public void setLeft(ABB_1<String> left) {
        this.left = left;
    }

    public void setRight(ABB_1<String> right) {
        this.right = right;
    } 
    public void Set(ABB_1<String> both) {
        this.right = both;
        this.left = both;
    }
    public ABB_1<String> gua(){
        return null;
    }


}
