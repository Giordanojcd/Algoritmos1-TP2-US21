package pilas;
/**
 * Algoritmos y Estructuras de Datos I - Universidad Siglo21 - Abril/2022
 * GRUPO #3 - CATEDRA - B - INF385 - EDH - CO / 256351-4
 * Integrantes:
 *     PABLO NAZARENO CORONATI - DNI 44424912 - VINF011521
 *     EDUARDO WALTER ETTLIN   - DNI 14958771 - VINF011524
 *     MATIAS GAIDO            - DNI 44472448 - VINF011551
 *     JUAN CARLOS DANIEL GIORDANO - DNI 32436658 - VINF011535
 *     PABLO ELIAS LEON        - DNI 40623789 - VINF011504 
 *     
 *   Trabajo Práctico 2 [TP2]  
 *     Entregable: Se deberá proveer el archivo Pila.java con la clase provista en este enunciado y los métodos 
 *     desapilar() y vercontenido() correctamente codificados. Asimismo, deberán quedar identificados los alumnos 
 *     participantes con su legajo y DNI en el código.
 **/
public class Pila {
    // Puntero que indica el inicio de la pila o tambien conocida como el
    // tope de la pila.
    
    private Nodo raiz;
    private Nodo inicio;
 
    // Variable para registrar el tamaño de la pila.
    private int tamanio;
    /**
     * Constructor por defecto.
     */
    public void Pila(){
        inicio = null;
        raiz=null;
        tamanio = 0;
    }
    /**
     * Consulta si la pila esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean esVacia(){
        return inicio == null;
    }
    /**
     * Consulta cuantos elementos (nodos) tiene la pila.
     * @return numero entero entre [0,n] donde n es el numero de elementos
     * que contenga la lista.
     */
    public int getTamanio(){
        return tamanio;
    }
    
    /**
     * Agrega un nuevo nodo a la pila.
     * @param valor a agregar.
     */
    public void apilar(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setValor(valor);
        // Consulta si la pila esta vacia.
        if (esVacia()) {
            // Inicializa la pila con el nuevo valor.
            inicio = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamanio++;
    } 
    
    /**
     * Extraer el elemento que se encuentra en el tope de la pila.
     */
    public void desapilar(){
        if (!esVacia()) {
            // Asigna como primer nodo al siguiente de la pila.
            inicio = inicio.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            tamanio--;
        }
    }
    /**
     * Consulta el valor del nodo que se encuentra en la cima de la pila
     * @return valor del nodo.
     * @throws Exception 
     */
    public int cima() throws Exception{
        if(!esVacia()){
            return inicio.getValor();
        } else {
            throw new Exception("La pila se encuentra vacia.");
        }
    }
    
    /**
    *  Despliega en pantalla los elementos de la pìla.
    **/
    public void vercontenido(){
        // Crea una copia de la pila.
        Nodo aux = inicio;
        // Recorre la pila hasta el ultimo nodo.
        while(aux != null){
            System.out.println("-----------------");
            System.out.println("|\t" + aux.getValor() + "\t|");
            
            aux = aux.getSiguiente();
        }
        System.out.println("-----------------");
    }
    
    public static void main(String[] args) {
        Pila pila1=new Pila();
        pila1.apilar(10);
        pila1.apilar(40);
        pila1.apilar(3);
        pila1. vercontenido ();
        
        System.out.println("-----DESAPILAR PRIMER VALOR ----");
        pila1.desapilar();
        System.out.println(" ");

        pila1.vercontenido ();
    }
}

class Nodo {
    // Variable que figura en el planteo, guarda información ????
    private int info;
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor Nodo - inicializamos valor de variables.
     */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
}


