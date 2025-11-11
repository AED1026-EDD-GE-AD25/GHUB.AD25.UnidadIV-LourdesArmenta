package arbolBinarioBusqueda;

import java.util.Comparator;

public class CriterioId implements Comparator<Estudiante> {

    @Override
    public int compare(Estudiante a, Estudiante b) {
        return a.getId() - b.getId();
    }

}