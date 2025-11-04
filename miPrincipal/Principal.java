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
        System.out.println();
        System.out.println("0. Salir");
        System.out.print("Seleccione la opción deseada:");
    }
}