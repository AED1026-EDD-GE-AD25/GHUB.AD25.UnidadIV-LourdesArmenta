package miPrincipal;
import grafo.GrafoMatriz;
import grafo.Vertice;

public class AppGrafo {
    public static void inicio(){
        //Este programa muestra como utilizar la Clase GrafoMatruz
        GrafoMatriz grafo = new GrafoMatriz(5);
        grafo.nuevoVertice("D");
        grafo.nuevoVertice("F");
        grafo.nuevoVertice("K");
        grafo.nuevoVertice("L");
        grafo.nuevoVertice("R");
        try{
            grafo.nuevoArco("D", "F");
            grafo.nuevoArco("D", "K");
            grafo.nuevoArco("F", "D");
            grafo.nuevoArco("L", "K");
            grafo.nuevoArco("L", "F");
            grafo.nuevoArco("R", "D");
            
            System.out.println("Adyacente de D y F ?" +grafo.adyacente("D", "F"));
            System.out.println("Adyacente de F y D ? "+grafo.adyacente("F","D"));
            System.out.println("Adyacente de R y F ? "+grafo.adyacente("R", "F"));

           




            


        }catch(Exception e){
            e.printStackTrace();
        }

        

    }
    
}
