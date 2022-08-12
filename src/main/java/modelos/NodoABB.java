package modelos;

/**
 *
 * @author Dereck Enríquez
 * @param <E>
 */
public class NodoABB<E> {

    private E dato;
    private NodoABB<E> izquierda;
    private NodoABB<E> derecha;

    public NodoABB(E dato, NodoABB<E> izquierda, NodoABB<E> derecha) {
        super();
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoABB<E> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoABB<E> izquierda) {
        this.izquierda = izquierda;
    }

    public NodoABB<E> getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoABB<E> derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "NodoABB{" + "dato=" + dato + ", izquierda=" + izquierda + ", derecha=" + derecha + '}';
    }

}