
package Conection;

import javax.swing.JOptionPane;
import sistemanomina.PreparedStatement;

/**
 *
 * @author LeJHuBo
 */
public class Conection {
    
    Conection conectar =null;
    public Conection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql.//localhost/sistemadenomina","root","");
            
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error Conexion" + e.getMessage());
            
            
        }
        return conectar;
    }

    public Conection Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public PreparedStatement prepareStatement(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
