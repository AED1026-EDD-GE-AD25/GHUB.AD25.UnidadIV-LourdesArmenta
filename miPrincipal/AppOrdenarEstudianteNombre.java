package miPrincipal;

import arbolBinarioBusqueda.CriterioEstNombre;
import arbolBinarioBusqueda.Estudiante;
import arbolBinarioBusqueda.Util;

public class AppOrdenarEstudianteNombre {
    public static void inicio() {
        Estudiante []arr = { new Estudiante(123,"Juan",10.0),
                             new Estudiante(124,"Pedro",8.5),
                             new Estudiante(125,"Alberto",7.3),
                             new Estudiante(100,"Carlos",9.2),
                             new Estudiante(200,"Daniela",8.5)
                            };
       
        Util.ordenar(arr, new CriterioEstNombre());
        for(Estudiante e:arr){
            System.out.println(e);
        }
        
    }
    
}
