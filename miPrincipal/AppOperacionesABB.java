package miPrincipal;
import arbolBinarioBusqueda.ArbolBinarioBusqueda;
import arbolBinarioBusqueda.BTreePrinter;
import arbolBinarioBusqueda.Entero;

public class AppOperacionesABB {
    public static void inicio(){
        arbolBinarioBusqueda.ArbolBinarioBusqueda arbol = new arbolBinarioBusqueda.ArbolBinarioBusqueda();
        try{
             arbol.insertar(new Entero(8));
             arbol.insertar(new Entero(3));
             arbol.insertar(new Entero(20));
             arbol.insertar(new Entero(1));
             arbol.insertar(new Entero(5));
             arbol.insertar(new Entero(4));
             //arbol.insertar(new Entero(20));
             arbol.insertar(new Entero(10));
        }catch(Exception e){
            System.out.println("Ocurrio un error: "+e.getMessage());
        }
        //Imprimir el arbol en forma de arbol
        BTreePrinter.printNode(arbol.getRaiz());
        //Probar el borrado
        arbol.eliminar(new Entero(4));
         //Imprimir el arbol en forma de arbol
        BTreePrinter.printNode(arbol.getRaiz());
        arbol.eliminar(new Entero(10));
        BTreePrinter.printNode(arbol.getRaiz());
        arbol.eliminar(new Entero(8));
        BTreePrinter.printNode(arbol.getRaiz());




    }
    
}
