/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package espol;

import java.util.Scanner;
import static javafx.application.Platform.exit;
import modelos.NodoABB;

/**
 *
 * @author jeanf
 */


public class test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //IZQUIERDA SI - DERECHA NO
        //Creacion dle arbol


        NodoABB mamifero = new NodoABB("Este animal es mamifero?",null,null);
        NodoABB ave = new NodoABB("Este animal es un ave?",null,null);
        NodoABB reptil = new NodoABB("Este animal es un reptil?",null,null);
        NodoABB omnivoro = new NodoABB("Este animal es un omnivoro",null,null);
        
        
        NodoABB vertebras = new NodoABB("Este animal es vertebrado?",null,null);
        NodoABB serpiente = new NodoABB("Este animal es una serpiente",null,null);
        NodoABB cocodrilo = new NodoABB("Este animal es una cocodrilo",null,null);
        
        NodoABB plumas = new NodoABB("Este animal tiene plumas?",null,null);
        NodoABB paloma = new NodoABB("Este animal es una paloma",null,null);
        NodoABB pinguino = new NodoABB("Este animal es una pinguino",null,null);
        
        NodoABB mono = new NodoABB("Tu animal es un mono",null,null);
        NodoABB carnivoro = new NodoABB("Este animal es carnivoro?",null,null);
        NodoABB patas4 = new NodoABB("se para este animal sobre 4 patas?",null,null);
        NodoABB leon = new NodoABB("Tu animal es un leon",null,null);
        NodoABB oso = new NodoABB("Tu animal es un oso",null,null);
        
        NodoABB raiz = new NodoABB(mamifero, null, null);
        
        raiz.setIzquierda(carnivoro);
        raiz.setDerecha(ave);
        ave.setIzquierda(plumas);
        ave.setDerecha(reptil);
        
        
        reptil.setIzquierda(vertebras);
        reptil.setDerecha(omnivoro);
        vertebras.setIzquierda(serpiente);
        vertebras.setDerecha(vertebras);
        
        
        plumas.setIzquierda(paloma);
        plumas.setDerecha(pinguino);
        
        
        carnivoro.setIzquierda(patas4);
        patas4.setIzquierda(oso);
        patas4.setDerecha(leon);
        
        test(raiz);

        
        
    }
    
    public static int test(NodoABB nodo){
        System.out.println(nodo.getDato().toString());
        String respt = sc.nextLine();       
        
        while(nodo.getIzquierda()!=null || nodo.getDerecha()!=null){
            if(respt.equals("si")){
                if(nodo.getIzquierda()!=null){
                    test(nodo.getIzquierda());
                }
                                
            }else{
               if(nodo.getDerecha()!=null){
                   test(nodo.getDerecha());
                   
               }
            
            }
            
        }
        System.out.println("Se termino el juego");
        return -1;
    }         
}