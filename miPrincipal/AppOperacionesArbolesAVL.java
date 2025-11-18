package miPrincipal;

import arbolAVL.ArbolAVL;
import arbolAVL.Entero;

public class AppOperacionesArbolesAVL {
    public static void inicio(){
        ArbolAVL abo = new ArbolAVL();

        try{
            
            abo.insertar(new Entero(10));
            abo.insertar(new Entero(15));
            abo.insertar(new Entero(30));
            abo.insertar(new Entero(40));
            abo.insertar(new Entero(50));
            abo.insertar(new Entero(60));
            abo.insertar(new Entero(70));
           
            //Imprime el arbol depues de la inserción
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());

            //Elimino un nodo hoja
            System.out.println("Elimino 70 que es un noso Hoja");
            abo.eliminar(new Entero(70));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            //Elimino un nodo que solo tenga un hijo
            System.out.println("Elimo 60 que solo tiene un hijo izquierdo");
            abo.eliminar(new Entero(60));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            //Elimo un nodo que tenga hijo izquierdo e hijo derecho
            System.out.println("Elimino 40 que tiene ambos hijos");
            abo.eliminar(new Entero(40));
            System.out.println("\n IMPRESION DEL ARBOL:");
            arbolAVL.BTreePrinter.printNode(abo.getRaiz());
            

           

        }
        catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
        System.out.println("Recorrido inorden");
        abo.inorden();
        System.out.println();
    }
    
}
