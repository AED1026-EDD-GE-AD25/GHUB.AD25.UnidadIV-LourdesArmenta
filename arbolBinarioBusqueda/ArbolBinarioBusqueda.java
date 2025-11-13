package arbolBinarioBusqueda;
import arbolBinario.ArbolBinario;

public class ArbolBinarioBusqueda extends ArbolBinario{
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
        //super();
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
}
