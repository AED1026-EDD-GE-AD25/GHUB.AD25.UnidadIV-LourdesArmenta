package arbolBinarioBusqueda;
import java.util.Comparator;

public class OtroCriterio implements Comparator<Estudiante>{

    @Override
    public int compare(Estudiante o1, Estudiante o2) {
        /*
        if (o1.getId()>o2.getId())
           return 1;
        else 
           if(o1.getId()<o2.getId())
              return -1;
           else
            return 0;
        */
        return o1.getId()-o2.getId();
    }
    
    
}
