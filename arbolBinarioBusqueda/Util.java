package arbolBinarioBusqueda;
import java.lang.Comparable;

public class Util {
    public static void ordenar(Comparable arr[]){
        //Método de la burbuja
        boolean ordenado = false;
        while (!ordenado){
            ordenado = true;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i+1].compareTo(arr[i])>0){
                    Comparable aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = aux;
                    ordenado = false;

                }
            }
        }
    }
    
}
