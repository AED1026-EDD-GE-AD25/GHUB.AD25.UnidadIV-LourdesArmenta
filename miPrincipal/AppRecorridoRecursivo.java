package miPrincipal;
import arbolBinario.*;


public class AppRecorridoRecursivo {
    public static void inicio() {
        //crear el arbol binario de la Figura del material
        //hacemos los recorridos
        ArbolBinario ab = new ArbolBinario();
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoF = new Nodo("F");
        Nodo nodoG = new Nodo("G");
        ab.setRaiz(nodoA);
        ab.getRaiz().setIzquierdo(nodoB);
        ab.getRaiz().setDerecho(nodoC);
        nodoB.setIzquierdo(nodoD);
        nodoB.setDerecho(nodoE);
        nodoC.setIzquierdo(nodoF);
        nodoC.setDerecho(nodoG);

        //imprimier los recorridos
        System.out.println();
        System.out.println("Preorden:");
        ab.preorden();
        System.out.println();
        System.out.println("Inorden:");
        ab.inorden();
        System.out.println();
        System.out.println("PostOrden:");
        ab.postorden();



        
    }
    
}
