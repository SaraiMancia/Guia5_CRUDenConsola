package datosestudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;

public class menu_principal {
   
    public static void main(String[] args) throws SQLException {
        despliegeMenu();
    }
        
        public static void despliegeMenu() throws SQLException {
 Scanner opcionSeleccionada = new Scanner(System.in);
        String opcionMenu;
        
         
        System.out.println("*******************************");
        System.out.println("|  opciones:                  |");
        System.out.println("|     1.Crear registros       |");
        System.out.println("      2.Consultar registro    |");
        System.out.println("      3.Actualizar registros  |");
        System.out.println("      4.Eliminar registro     |");
        System.out.println("      5.Salir                 |");
        System.out.println("*******************************");
        
        System.out.println("Seleccionar opcion: ");
        opcionMenu = opcionSeleccionada.next();
        
        
        switch (opcionMenu) {
            case "1":
                create c= new create();
                
                break;
            case "2":
                Read r= new Read();
                break;
            case "3":
                
                update u= new update();
                break;
            case "4":
                Delete d= new Delete();
                break;
            case "5":
                System.exit(0);
                 break;
            default:
                 System.out.println("Seleccion invalida!: ");
                 break;
                
                
        }
     }
}

