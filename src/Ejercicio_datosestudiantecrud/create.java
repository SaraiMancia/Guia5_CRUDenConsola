
package Ejercicio_datosestudiantecrud;

import java.sql.SQLException;
import java.util.Scanner;


public class create {
    
   
    
    create () throws SQLException {
        Scanner leer = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        
        System.out.println("<< CREAR REGISTRO >>");
        
  
        
        System.out.println("Ingrese Carnet del estudiante");
        estudiante.setCarnet_estudiante(leer.next());
        
        System.out.println("Ingrese  Nombre del estudiante: ");
        estudiante.setNom_estudiante(leer.next());
        
        System.out.println("Ingrese  Apellido del estudiante: ");
        estudiante.setApe_estudiante(leer.next());
        
        System.out.println("Ingrese  Edad del estudiante: ");
        estudiante.setEdad_estudiante(leer.nextInt());
        
        String tabla = "estudiante";
        String camposTabla = " carnet_estudiante, nom_estudiante, ape_estudiante, edad_estudiante";
        String valoresCampo = "'" + estudiante.getCarnet_estudiante() + "','" +
                estudiante.getNom_estudiante() + "','" + estudiante.getApe_estudiante() + "','" + estudiante.getEdad_estudiante() + "'";
        
        ConexionCRUD utilerias = new ConexionCRUD();
        
        utilerias.guardarRegistros(tabla, camposTabla, valoresCampo);
        
        menu_principal.despliegeMenu();
        
    
}
    
}
