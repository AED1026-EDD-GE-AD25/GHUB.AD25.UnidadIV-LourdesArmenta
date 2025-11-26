package miPrincipal;
import arbolAVL.ArbolAVL;
import arbolAVL.Entero;
import arbolAVL.BTreePrinter;

public class AppOperacionesArbolesAVL {
    public static void inicio(){
        //crear el arbol
        ArbolAVL abo = new ArbolAVL();
        try{
            //insertar algunos elementos
            abo.insertar(new Entero(2));
            abo.insertar(new Entero(1));
            abo.insertar(new Entero(4));

            abo.insertar(new Entero(5));
            abo.insertar(new Entero(9));

            System.out.println("Impresion de arbol AVL despues de insertar 9:");
            BTreePrinter.printNode(abo.getRaiz());

            abo.insertar(new Entero(3));

            System.out.println("Impresion de arbol AVL despues de insertar 3");
            BTreePrinter.printNode(abo.getRaiz());

            abo.insertar(new Entero(6));
            abo.insertar(new Entero(7));

            System.out.println("Impresion de arbol AVL");
            BTreePrinter.printNode(abo.getRaiz());

            abo.eliminar(new Entero(9));
            System.out.println("Impresion de arbol AVL");
            BTreePrinter.printNode(abo.getRaiz());

            abo.eliminar(new Entero(4));
            System.out.println("Impresion de arbol AVL");
            BTreePrinter.printNode(abo.getRaiz());


        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
       
    
}
