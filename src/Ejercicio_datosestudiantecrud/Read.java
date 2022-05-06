
package Ejercicio_datosestudiantecrud;

import java.sql.SQLException;


public class Read {
    
    public Read() throws SQLException {
        System.out.println("<< CONSULTA DE REGISTROS >>");
        mostrarResusltados();
    }
    
    private void mostrarResusltados() throws SQLException {
        try {
            ConexionCRUD utilerias = new ConexionCRUD();
            String tabla = "estudiante";
            String camposTabla ="*";
            
            String condicionBusqueda="";
            utilerias.desplegarRegistros(tabla, camposTabla, condicionBusqueda);
        } catch (SQLException ex){
            System.out.println("Ha ocurrido el siguiente error: " + ex.getMessage());
        }finally {
            menu_principal.despliegeMenu();
        }
        
    }
    
}
    

