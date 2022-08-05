package modelos;
import java.util.ArrayList;

/**
 *
 * @author Dereck Enríquez
 * @param <E>
 */
public class ABB<E extends Comparable<E>> {

    NodoABB<E> raiz = null;
    private int elementos = 0;
    private int nIteracion = 0;
    private int totalIteracion = 0;
    private int n = 0;

    public void insertar(E dato) {
        NodoABB<E> nuevoNodo = new NodoABB<>(dato, null, null);
        if (raiz == null) {
            raiz = nuevoNodo;
            System.out.println("raiz " + dato);
        } else {
            NodoABB<E> nodotemporal = raiz;
            while (nodotemporal != null) {
                //verificamos la existencia de hojas 
                if (nodotemporal.getDerecha() == null && nodotemporal.getIzquierda() == null) {
                    if (dato.compareTo(nodotemporal.getDato()) == 1) {
                        System.out.println(dato + " a la derecha de " + nodotemporal.getDato());
                        nodotemporal.setDerecha(nuevoNodo);
                        nodotemporal = null;
                    } else {
                        System.out.println(dato + " a la izquierda de " + nodotemporal.getDato());
                        nodotemporal.setIzquierda(nuevoNodo);
                        nodotemporal = null;
                    }
                } else if (dato.compareTo(nodotemporal.getDato()) == 1 && nodotemporal.getDerecha() == null) {
                    System.out.println(dato + " a la derecha de " + nodotemporal.getDato());
                    nodotemporal.setDerecha(nuevoNodo);
                    nodotemporal = null;
                } else if (dato.compareTo(nodotemporal.getDato()) == -1 && nodotemporal.getIzquierda() == null) {
                    System.out.println(dato + " a la izquierda de " + nodotemporal.getDato());
                    nodotemporal.setIzquierda(nuevoNodo);
                    nodotemporal = null;
                } else {
                    if (dato.compareTo(nodotemporal.getDato()) == 1) {
                        nodotemporal = nodotemporal.getDerecha();
                    } else {
                        nodotemporal = nodotemporal.getIzquierda();
                    }
                }
            }
        }
        elementos++;
    }

    public boolean buscar(E dato) {
        NodoABB<E> nodotemporal = raiz;
        NodoABB<E> condicion = null;
        nIteracion = 0;
        while (nodotemporal != null) {
            //se lo encuentra
            if (dato.compareTo(nodotemporal.getDato()) == 0) {
                condicion = nodotemporal;
                nodotemporal = null;
                //no existe
            } else if (nodotemporal.getDerecha() == null && nodotemporal.getIzquierda() == null) {
                nodotemporal = null;
                //a la derecha
            } else if (dato.compareTo(nodotemporal.getDato()) == 1 && nodotemporal.getDerecha() != null) {
                nodotemporal = nodotemporal.getDerecha();
                //a la izquierda
            } else if (dato.compareTo(nodotemporal.getDato()) == -1 && nodotemporal.getIzquierda() != null) {
                nodotemporal = nodotemporal.getIzquierda();
            } else {
                nodotemporal = null;
            }
            nIteracion++;
        }
        n++;
        totalIteracion += nIteracion;
        return condicion != null;
    }

    public boolean eliminar(E dato) {
        boolean condicion = false;
        NodoABB<E> nodotemporal = raiz;
        while (nodotemporal != null) {
            if (nodotemporal.getDato().compareTo(dato) == 0) {
                NodoABB<E> nodoAEliminar = nodotemporal;
                if (nodotemporal.getDerecha() != null) {
                    raiz = nodotemporal.getDerecha();
                    if (nodoAEliminar.getIzquierda() != null) {
                        insertarNodo(nodoAEliminar.getIzquierda());
                        nodoAEliminar.setIzquierda(null);
                        nodoAEliminar.setDerecha(null);
                    }
                } else if (nodotemporal.getIzquierda() != null) {
                    raiz = nodotemporal.getIzquierda();
                    if (nodoAEliminar.getDerecha() != null) {
                        insertarNodo(nodoAEliminar.getDerecha());
                        nodoAEliminar.setIzquierda(null);
                        nodoAEliminar.setDerecha(null);
                    }
                } else {
                    raiz = null;
                }
                condicion = true;
                nodotemporal = null;
                //reubicacion izquierda
            } else if (nodotemporal.getIzquierda() != null && nodotemporal.getIzquierda().getDato().compareTo(dato) == 0) {
                NodoABB<E> nodoAEliminar = nodotemporal.getIzquierda();
                if (nodotemporal.getIzquierda().getIzquierda() != null) {
                    nodotemporal.setIzquierda(nodotemporal.getIzquierda().getIzquierda());
                    if (nodoAEliminar.getDerecha() != null) {
                        insertarNodo(nodoAEliminar.getDerecha());
                    }
                    nodoAEliminar.setDerecha(null);
                    nodoAEliminar.setIzquierda(null);
                    condicion = true;
                    nodotemporal = null;
                } else {
                    if (nodotemporal.getIzquierda() == null && nodotemporal.getDerecha() == null) {
                        nodotemporal.setIzquierda(null);
                    } else {
                        nodotemporal.setIzquierda(null);
                        if (nodoAEliminar.getDerecha() != null) {
                            insertarNodo(nodoAEliminar.getDerecha());
                        }
                    }
                    condicion = true;
                    nodotemporal = null;
                }
                //reubicacion derecha
            } else if (nodotemporal.getDerecha() != null && nodotemporal.getDerecha().getDato().compareTo(dato) == 0) {
                NodoABB<E> nodoAEliminar = nodotemporal.getDerecha();
                if (nodotemporal.getDerecha().getDerecha() != null) {
                    nodotemporal.setDerecha(nodotemporal.getDerecha().getDerecha());
                    if (nodoAEliminar.getIzquierda() != null) {
                        insertarNodo(nodoAEliminar.getIzquierda());
                    }
                    nodoAEliminar.setDerecha(null);
                    nodoAEliminar.setIzquierda(null);
                    condicion = true;
                    nodotemporal = null;
                } else {
                    if (nodotemporal.getIzquierda().getIzquierda() == null && nodotemporal.getDerecha().getDerecha() == null) {
                        nodotemporal.setDerecha(null);
                    } else {
                        nodotemporal.setDerecha(null);
                        if (nodoAEliminar.getIzquierda() != null) {
                            insertarNodo(nodoAEliminar.getIzquierda());
                        }
                    }
                    condicion = true;
                    nodotemporal = null;
                }
            } else {
                if (dato.compareTo(nodotemporal.getDato()) == 1) {
                    nodotemporal = nodotemporal.getDerecha();
                } else {
                    nodotemporal = nodotemporal.getIzquierda();
                }
            }
        }
        if (condicion) {
            elementos--; //si se borra se decrece el tamaño del arbol
        }
        return condicion;
    }

    private void insertarNodo(NodoABB<E> nodo) {
        if (raiz == null) {
            raiz = nodo;
            System.out.println("Inserto la raiz");
        } else {
            NodoABB<E> nodotemporal = raiz;
            while (nodotemporal != null) {
                if (nodotemporal.getDerecha() == null && nodotemporal.getIzquierda() == null) {
                    if (nodo.getDato().compareTo(nodotemporal.getDato()) == 1) {
                        //a la derecha
                        System.out.println(nodo.getDato() + " Lo insertamos a la derecha de: " + nodotemporal.getDato());
                        nodotemporal.setDerecha(nodo);
                        nodotemporal = null;
                    } else {
                        //a la izquierda
                        System.out.println(nodo.getDato() + " Lo insertamos a la izquierda de: " + nodotemporal.getDato());
                        nodotemporal.setIzquierda(nodo);
                        nodotemporal = null;
                    }
                } else if (nodo.getDato().compareTo(nodotemporal.getDato()) == 1 && nodotemporal.getDerecha() == null) {
                    //a la derecha
                    System.out.println(nodo.getDato() + " Lo insertamos a la derecha de: " + nodotemporal.getDato());
                    nodotemporal.setDerecha(nodo);
                    nodotemporal = null;
                } else if (nodo.getDato().compareTo(nodotemporal.getDato()) == -1 && nodotemporal.getIzquierda() == null) {
                    //a la izquierda
                    System.out.println(nodo.getDato() + " Lo insertamos a la izquierda de: " + nodotemporal.getDato());
                    nodotemporal.setIzquierda(nodo);
                    nodotemporal = null;
                } else {
                    if (nodo.getDato().compareTo(nodotemporal.getDato()) == 1) {
                        nodotemporal = nodotemporal.getDerecha();
                    } else {
                        nodotemporal = nodotemporal.getIzquierda();
                    }
                }

            }
        }
    }

    public int size() {
        return this.elementos;
    }

    public int getnIteracion() {
        return this.nIteracion;
    }

    public ArrayList<E> Listaprueba() {
        ArrayList<E> e = new ArrayList<>();
        recorrer(raiz, e);
        return e;
    }

    private void recorrer(NodoABB<E> n, ArrayList<E> e) {
        if (n != null) {
            if (n.getIzquierda() == null && n.getDerecha() == null) {
                e.add(n.getDato());
            } else {
                recorrer(n.getIzquierda(), e);
                e.add(n.getDato());
                recorrer(n.getDerecha(), e);
            }
        }
    }
}

