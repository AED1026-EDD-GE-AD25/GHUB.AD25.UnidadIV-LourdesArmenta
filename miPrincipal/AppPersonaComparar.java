package miPrincipal;
import arbolBinarioBusqueda.Persona;

public class AppPersonaComparar {
    public static void inicio() {
        Persona p1 = new Persona(123,"Juana Alvarez" );
        Persona p2 = new Persona(456,"Carlos Perez" );
        if(p1.esMayor(p2)){
            System.out.println(p1+" es mayor que "+p2);
        }else if(p1.esMenor(p2)){
            System.out.println(p1+" es menor que "+p2);
        }else{
            System.out.println(p1+" es igual que "+p2);
        }

        p1 = new Persona(200,"Ana Armenta" );
        p2 = new Persona(199,"Ana Juarez" );
        if(p1.esMayor(p2)){
            System.out.println(p1+" es mayor que "+p2);
        }else if(p1.esMenor(p2)){
            System.out.println(p1+" es menor que "+p2);
        }else{
            System.out.println(p1+" es igual que "+p2);
        }

        p1 = new Persona(200,"Ana Juarez" );
        p2 = new Persona(201,"Ana Juarez" );
        if(p1.esMayor(p2)){
            System.out.println(p1+" es mayor que "+p2);
        }else if(p1.esMenor(p2)){
            System.out.println(p1+" es menor que "+p2);
        }else{
            System.out.println(p1+" es igual que "+p2);
        }

        
        
    }
    
}
