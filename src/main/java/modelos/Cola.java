package modelos;

import java.util.LinkedList;

/**
 *
 * @author G6
 */
public class Cola {
    //Note que la estructura esta siendo emulada con la clase LinkedList.
    //En particular, queremos mostrar como es utilizada la cola para lograr
    //imprimir el ABB por nivel, mas que de la estructura de la Cola en si.
    //Si desea ser mas purista, puede reemplazar esta clase y armar su propia clase Cola :)
    LinkedList cola = new LinkedList();
    
    public void encolar(NodoABB a) {
        cola.addFirst(a);
    }
    
    public NodoABB desencolar() {
        return (NodoABB) cola.removeLast();
    }
    
    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
