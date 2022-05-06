
package recursohumano;

import java.sql.SQLException;
import java.util.Scanner;


public class MenuPrincipal {
   
    //throws especifica el tipo de exepcion que puede ocacionar
    public static void main(String[] args) throws SQLException {
        desplegarMenu();
    }

public static void desplegarMenu() throws SQLException {
    Scanner opcionSeleccionada = new Scanner(System.in);
    String opcionMenu;
    //Menu a desplegar
    System.out.println("**********************************");
    System.out.println("|     CRUD DE JAVA EN CONSOLA    |");
    System.out.println("**********************************");
    System.out.println("|   opciones:                     ");
    System.out.println("|      1. Crear registros        |");
    System.out.println("|      2. Consultar requisitos   |");
    System.out.println("|      3. Actualizar requisitos  |");
    System.out.println("|      4. Eliminar registro      |");
    System.out.println("|      5. Salir                  |");
    System.out.println("**********************************");
    System.out.println("Seleccionar opcion: ");
    opcionMenu = opcionSeleccionada.next();
    
    //Desplege de menu basado en las opcion seleccionada
    switch (opcionMenu) {
        case "1":
            //Create create = new Create();
            break;
        case "2":
            //Read read = new Read();
            break;
        case "3":
            //Update ipdate = new Update ();
            break;
        case "4":
            //Delete delete = new Delete();
            break;
        case "5":
            System.exit(0);
            break;
        default:
            System.out.println("Seleccion invalida!");
            break;
    }
}
}
    

