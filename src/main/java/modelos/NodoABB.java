package modelos;

/**
 *
 * @author Carlos San Juan <carlossanjuanc@gmail.com>
 */
public class NodoABB {

    NodoABB leftChild;
    int key;
    String p;
    NodoABB rightChild;

    public NodoABB getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodoABB leftChild) {
        this.leftChild = leftChild;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public NodoABB getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodoABB rightChild) {
        this.rightChild = rightChild;
    }

    
    
    public NodoABB(int key) {
        this.key = key;
    }
    
    public NodoABB(int key, String p) {
        this.key = key;
        this.p = p;
    }
    
    
    @Override
    public String toString() {
        return key + ", ";
    }

}
