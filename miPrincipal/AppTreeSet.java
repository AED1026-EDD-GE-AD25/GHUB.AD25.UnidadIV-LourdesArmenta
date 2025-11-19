package miPrincipal;
import java.util.TreeSet;
import java.util.Iterator;

public class AppTreeSet {
    public static void inicio(){
        TreeSet<Integer> t = new TreeSet<>();
        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);
        t.add(2);
        System.out.println("El elemento 5 se encuentra en mi arbol?"+t.contains(5));
        System.out.println("El elemento 10 se encuentra en mi árbol?"+t.contains(10));
        for(Iterator<Integer> it = t.iterator(); it.hasNext();){
            System.out.print(it.next()+" ");
        }
        System.out.println();

    }
    
}
