
package modelos;

/**
 *
 * @author G6
 * @param <E>
 */
public class ArrayList<E> implements List<E> {
    private E[]arreglo;
    private int capacidad;
    private int tam;
  
    public ArrayList(){
        capacidad = 10;
        arreglo =  (E[]) new Object[capacidad];
        tam = 0;
    }
    
    public ArrayList(int capacidad){
        this.capacidad = capacidad;
        arreglo =  (E[]) new Object[capacidad];
        tam = 0;  
    }

    @Override
    public boolean addFirst(E e) {
        // si e viene vacio
        if (e==null){
            return false;
        }
        
        // la lista estaba vacia
        if (isEmpty()){
            arreglo[0] = e;
            tam = 1;
            return true;
        }
        
        // si el arreglo ya está lleno o a capacidad
        if (tam == capacidad){
            crecerArreglo();
            System.out.println("El tamaño del arreglo cambio a: "+capacidad);
        }
        
        // la insercion debe desplazar elementos
        for (int i=tam-1; i>0; i--){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = e;
        tam++;
        return true;
    }
    
    private void crecerArreglo(){
        capacidad = capacidad*2;
        E[] arreglo2 =  (E[]) new Object[capacidad];
        for (int i=0; i<tam; i++){
            arreglo2[i] = arreglo[i];
        }
        arreglo = arreglo2;
    }
    
    private void decrecerArreglo(){
        capacidad = capacidad * 2/3; 
        E[] arreglo2 = (E[]) new Object[(capacidad)];
        for (int i =0; i<tam;i++){
            arreglo2[i]= arreglo[i];
        }
        arreglo = arreglo2;
               
    }
    
    @Override
    public boolean addLast(E e) {
        if (e==null){
            return false;            
        }
        if (isEmpty()){
            arreglo[0] = e;
            tam = 1;
            return true;
        }
        if(tam == capacidad) {
            crecerArreglo();
        }        
        arreglo[tam++]= e;
        return true;       
    }

    @Override
    public E getFirst() {
        if(isEmpty()){
            return null;
        }
        return arreglo[0];    
    }

    @Override
    public E getLast() {
        if(isEmpty()){
            return null;
        }
        return arreglo[tam-1];    
    }

    @Override
    public int indexOf(E e) {
        if(e==null) {
            System.out.println("No ingresar null");
            return -1;
        }
        if(isEmpty()){
            return -1;
        }
        else{
            for(int i = 0;i<tam-1; i++){
                if(arreglo[i].equals(e)) {
                    return i;
                }
            }
            return -1;
        }
    }

    @Override
    public int size() {
        return tam;
    }

    @Override
    public boolean removeLast() {
        if(isEmpty()) {
            return false;
        }
        arreglo[tam-1] = null;
        tam --;
        if((capacidad*2/3)>10 && tam < (capacidad*2)/3){
            decrecerArreglo();
        }
        return true;
    }

    @Override
    public boolean removeFirst() {
        if (isEmpty()){
            return false;
        }
        arreglo[0] = null;
        for(int i=0; i<tam-1;i++){
            arreglo[i] = arreglo[i+1];
        }
        removeLast();
        return true;
    }

    @Override
    public boolean insert(int index, E e) {
        if(isEmpty() || e==null) {
            return false;
        }
        if(index>tam-1 || index<0) {
            return false;
        }
        if(tam == capacidad) {
            crecerArreglo();
        }
        for(int i = index; i<tam;i++ ){
            arreglo[i+1] = arreglo[i];
        }
        arreglo[index]=e;
        tam++;
        return true;
    }

    @Override
    public boolean set(int index, E e) {
        if(e==null || index >tam-1){
            return false;
        } 
        arreglo[index] = e;
        return true;
    }

    @Override
    public boolean isEmpty() {
        return tam == 0;
    }

    @Override
    public E get(int index) {
        if (index > tam -1){
            throw new IndexOutOfBoundsException("No se puede solicitar el indice requerido");
        }
        return arreglo[index];
    }

    @Override
    public boolean contains(E e) {
        for(int i=0; i<tam; i++)
        {
            if(arreglo[i].equals(e))
                return true;
        }
        return false;
    }

    @Override
    public boolean remove(int index) {
        if (index > tam -1){
            return false;
        }
        if(index==0){
            return removeFirst();
        }
        if(index == tam -1){
            return removeLast();
        }
        if(isEmpty()){
            return false;
        }
        else{
            for (int i = index; i<=tam-2;i++){
                arreglo[i]= arreglo[i+1];
            }
            return removeLast();
        }
    }
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < tam; i++) {
            result += arreglo[i].toString() + ", ";
        }
        return result;
    }

}
