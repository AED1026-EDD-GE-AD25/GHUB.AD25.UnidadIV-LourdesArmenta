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
    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
        }
    }
    private void inorden(Nodo aux){
        if(aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }
    }
    private void postorden(Nodo aux){
        if(aux != null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }


    
    
    
}
