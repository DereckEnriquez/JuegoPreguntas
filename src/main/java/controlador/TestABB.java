package controlador;
import modelos.ABB;
import modelos.ABB;
import static modelos.ABB.iterar;
import modelos.ArrayList;
/**
 *
 * @author G6
 */

public class TestABB {
    public static ABB arbolBinario = new ABB();
    public static void ingresoDatos(){
        ArrayList<ArrayList> Respuestas = new ArrayList<>();
        ArrayList<String> animal = new ArrayList<>();
        animal.addFirst("Gato,si,si");
        Respuestas.addFirst(animal);
        
        //Se crea el ABB
        //Se insertan valores aleatorios al arbol
        
        
        arbolBinario.insertarIterativo(100,"Domestico?");
        arbolBinario.insertar(70,"Tiene pelos?"); 
        arbolBinario.insertar(40,"Es felino?"); 
              
        arbolBinario.insertar(80,"Nacen de huevos?");
        
            arbolBinario.insertar(75, "Tiene Escamas?"); 
            arbolBinario.insertar(90, "Tiene lana?");
            //arbolBinario.insertar(91, "no es posible encontrar un animal con estas características");
            arbolBinario.insertar(74, "tu animal es una Tortuga"); 
            arbolBinario.insertar(78, "Tiene plumas?");         
            arbolBinario.insertar(77, "tu animal es un loro"); 
            //arbolBinario.insertar(79, "no es posible encontrar un animal con estas características");         

        
            arbolBinario.insertar(85, "Tiene el cuello largo?"); 
            arbolBinario.insertar(84, "Tu animal es la llama"); 
            arbolBinario.insertar(87, "Tiene orejas largas?"); 
            arbolBinario.insertar(86, "Tu animal es el conejo");
            arbolBinario.insertar(89,"Tu animal es la oveja"); 
            
        arbolBinario.insertar(10, "Tu animal es un Gato"); 
        arbolBinario.insertar(60,"Tiene pezuñas?");
        
        arbolBinario.insertar(45,"Tu animal es un vacuno?");
        arbolBinario.insertar(65,"Tu animal es un canino?");        
        arbolBinario.insertar(63,"Tu animal es un perro");
        //arbolBinario.insertar(66,"no es posible encontrar un animal con estas características");
        arbolBinario.insertar(43,"Tu animal provee leche?");
        arbolBinario.insertar(53,"Puede transportar personas o cosas?");
        arbolBinario.insertar(47,"tiene orejas largas?");
        arbolBinario.insertar(55,"tiene cuernos?");       
        arbolBinario.insertar(46,"Tu animal es un burro");
        arbolBinario.insertar(51,"Es proporcionalmente grande?");
        arbolBinario.insertar(49,"Es esteril?");
        arbolBinario.insertar(52,"Tu animal es un poni");
        arbolBinario.insertar(48,"Tu animal es una mula");
        arbolBinario.insertar(50,"Tu animal es un caballo");
        
        arbolBinario.insertar(54,"Tu animal es una cabra");
        arbolBinario.insertar(57,"Tiene el ocico largo?");
        arbolBinario.insertar(56,"Tu animal es un cerdo");
        //arbolBinario.insertar(58,"no es posible encontrar un animal con estas características");
        
        arbolBinario.insertar(41,"Tu animal es una Vaca");
        arbolBinario.insertar(44,"Tu animal es un Toro");
        
        //System.out.println("\nArbol Binario de Busqueda");
        //arbolBinario.imprimirArbol();
        
        //iterar(ABB.root);            
    }

    
    
    
}