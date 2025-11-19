package miPrincipal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc =0;
        do{
            menu();
            try{
                opc = sc.nextInt();
                switch (opc) {
                    case 1:
                        AppRecorrido.inicio();
                        break;
                    case 2:
                        AppEnteroComparar.inicio();
                        break;
                    case 3:
                        AppPersonaComparar.inicio();
                        break;
                    case 4:
                        AppOrdenarEstudiantes.inicio();
                        break;
                    case 5:
                        AppOrdenarEstudianteNombre.inicio();
                        break;
                    case 6:
                        AppOrdenarEstudianteProm.inicio();
                        break;
                    case 7:
                        AppEstudianteCriterioIdComparator.inicio();
                        break;
                    case 8:
                        AppOperacionesABB.inicio();
                        break;
                    case 9:
                        AppOperacionesArbolesAVL.inicio();
                        break;
                    case 10:
                        AppTreeSet.inicio();
                        break;
                    case 0:
                        System.out.println("Hasta Luego!");
                        break;
                    default:
                        break;
                }
            }catch(InputMismatchException e) {
                System.out.println("Seleccione la opción correcta"); 
                sc.nextLine();
                opc = -1;
                continue; 
            }
        }while (opc !=0);
       
    }
    public static void menu(){
        System.out.println();
        System.out.println("    Arboles Binarios   ");
        System.out.println("1. Recorrido de Arboles");
        System.out.println("2. Comparador Enteros  ");
        System.out.println("3. Comparar Personas por Nombre  ");
        System.out.println("4. Ordenar Estudiantes por Id");
        System.out.println("5. Ordenar Estudiantes por Nombre");
        System.out.println("6. Ordenar Estudiantes por Promedio");
        System.out.println("7. Ordenar Estudiates por ID interce Comparator ");
        System.out.println("8. Operaciones con árboles binarios de búsqueda");
        System.out.println("9. Operaciones con árboles binarios balanceados");
        System.out.println("10. Operacion con clase TreeSet");
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccione la opción deseada:");
    }
}