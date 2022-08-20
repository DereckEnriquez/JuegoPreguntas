package modelos;

/**
 *
 * @author G6
 */
public class NodoABB {

    NodoABB leftChild;
    int key;
    String p;
    ArrayList<ArrayList> respuestas; // = new ArrayList<>()
    NodoABB rightChild;
    
    public NodoABB(int key) {
        this.key = key;
    }
    
    public NodoABB(int key, String p) {
        this.key = key;
        this.p = p;
    }

    public NodoABB(int key, String p, ArrayList<ArrayList> respuestas) {
        this.key = key;
        this.p = p;
        this.respuestas = respuestas;
    }
    
    
    
    public static void pesentHojas(NodoABB focusNode){
        if (focusNode != null){
            pesentHojas(focusNode.leftChild);
            if(focusNode.getLeftChild()==null && focusNode.getRightChild()==null){  System.out.println(focusNode.getP());} 
            pesentHojas(focusNode.rightChild);
        }
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    
    
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



    
    @Override
    public String toString() {
        return key + ", ";
    }

}
