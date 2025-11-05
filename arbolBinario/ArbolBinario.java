package arbolBinario;

public class ArbolBinario {
    //Atributos
    //Raiz del arbol
    private Nodo raiz;
    //contructor

    public ArbolBinario() {
        raiz = null;
    }
    //getter y setter
    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    //recoridos
    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    //recorrido recursivo

    public void preorden(){
        preorden(raiz);
    }
    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
        }
    }

    public void inorden(){
        inorden(raiz);
    }
    private void inorden(Nodo aux){
        if(aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }

    public void postorden(){
        postorden(raiz);
    }
    private void postorden(Nodo aux){
        if(aux != null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }
    /*
     * Recorrido por nivel
     * 
     */
    public void recorridoPorNiveles(){
        cola.Cola<Nodo> cola = new cola.Cola<>();
        cola.encolar(raiz);
        while (!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            if (aux.getIzquierdo()!=null)
                cola.encolar(aux.getIzquierdo());
            if(aux.getDerecho()!=null){
                cola.encolar(aux.getDerecho());
            }
            cola.desencolar();

            
        }
    }
    /*
     * Recorrido preorden iterativo, utilizando una pila
     */
    public void preordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<Nodo>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if (aux.getDerecho()!=null){
                pila.apilar(aux.getDerecho());
            }
            if(aux.getIzquierdo()!=null){
                pila.apilar(aux.getIzquierdo());
            }
        } 
    }
    /*
     * Recorrido inorden en version iterativa
     */
    public void inordenIterativo(){ //falta explicar en el pizarron
        pila.Pila<Nodo> pila = new pila.Pila<>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while (aux != null || !pila.esVacia()){
            if(aux != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux = pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();

            }
        }
    }
    /*
     * Recorrido iterativo postOrden
     */
    public void postordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while(aux != null){
            //avanza por la izquerda y apila los nodo
            while(aux.getIzquierdo() != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            while (aux !=null && 
                    (aux.getDerecho() == null || aux.getDerecho() == q)){
                visitar(aux);
                q = aux;
                if(pila.esVacia())
                    return;
                
                aux = pila.cima();
                pila.retirar();

            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
    }  
}
