package arbolBinarioBusqueda;


public class ArbolBinarioBusqueda  {
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
        //super();
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
    public void inordenIterativo(){ 
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
    
    
    /*
     * Inserra un nodo en el arbol binario
     */
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        if (raiz == null)
            raiz = nuevo;
        else{       
            //anterior: referencia al padre aux
            Nodo anterior = null;
            //aux: auxiliar qur va recorriendo los nodos, dese la raiz
            Nodo aux=raiz;
            while (aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                    aux = aux.getIzquierdo();
                else if (dato.esMayor(aux.getValor()))
                    aux = aux.getDerecho();
                else 
                    throw new Exception("Dato duplicado");
                
            }
            if(dato.esMenor(anterior.getValor()))
                anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);
        }
       
    }
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if (raiz==null){
            return null;
        }else{
            //aux: auxiliar que va recorriendo los nodos, desde la reiz
            Nodo aux = raiz;
            while (aux !=null){
                if(dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else if (dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else
                    return aux;
            }
            return null;
        }
    }

    /*
     * Eliminar un nodo
     */
    public boolean eliminar(Object valor){
        Comparable dato = (Comparable)valor;
        Nodo antecesor = null;
        Nodo aux = raiz;
        while (aux != null){
            if(dato.esIgual(aux.getValor()))
               break;
            antecesor = aux;
            if(dato.esMenor(aux.getValor()))
               aux = aux.getIzquierdo();
            else 
               aux = aux.getDerecho();
        }
        if(aux == null)
            return false;
        //si llega a este punto, el nodo a eliminar existe y es AUX, y su
        // ANTECESOR ES antecesor;
        //Examina cada caso
        //1. Si tiene menos de dos hijos (1 o 0 hijos), reajustar 
        //   los enlaces del antecesor
        if(aux.getIzquierdo()==null)
           if (aux.getValor().esMenor(antecesor.getValor())

    }



    
}
