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
        else
            {

            }
            ///aqui me quede
        

        
    }
}
