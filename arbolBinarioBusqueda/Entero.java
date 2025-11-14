package arbolBinarioBusqueda;

public class Entero implements Comparable {
    private int dato;
    
    public Entero() {
        this.dato = 0;
    }

    public Entero(int dato) {
        this.dato = dato;
    }


    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return  dato +"";
    }

    @Override
    public boolean esIgual(Object q) {
        Entero obj = (Entero) q;
        return (this.dato == obj.getDato());
        
    }

    @Override
    public boolean esMayor(Object q) {
        Entero obj = (Entero)q;
        if (this.dato> obj.getDato())
           return true;
        else
           return false;
    }

    @Override
    public boolean esMenor(Object q) {
         Entero obj = (Entero)q;
        if (this.dato< obj.getDato())
           return true;
        else
           return false;
    }
    
    
    
}
