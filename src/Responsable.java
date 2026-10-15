import java.sql.*;


public class Responsable {
    
     static String todos = "SELECT * FROM responsables ORDER BY nombreR";
    static String curps = "SELECT curpR FROM responsables ORDER BY curpR";
    //Variables
    String curp,nombre,sexo,telefono,parentesco,estado;

    public Responsable() {
    }

    public Responsable(String curp, String nombre, String sexo, String telefono, String parentesco, String estado) {
        this.curp = curp;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.parentesco = parentesco;
        this.estado = estado;
    }
    
    public int insertar(Connection con){
        int resultado = 0;
        
        try {
            String sql = "INSERT INTO responsables VALUES(?, ?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, parentesco);
            ps.setString(6, estado);
            return ps.executeUpdate();
            
            
        } catch (Exception e) {//Agarra el error y lo muestra
            System.out.println("Error:"+ e.getMessage());
            return resultado;
        }
    }
    
    
    public int borrar(Connection con){
        int resultado = 0;
        
        try {
            String sql = "DELETE FROM responsables WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, parentesco);
            ps.setString(6, estado);
            return ps.executeUpdate();
            
            
        } catch (Exception e) {//Agarra el error y lo muestra
            System.out.println("Error:"+ e.getMessage());
            return resultado;
        }
    }
    
    
    public int actualizar(Connection con){
        int resultado = 0;
        
        try {
            String sql = "UPDATE responsables  SET nombreR = ?,sexoR = ?,telefono = ?, parentesco = ?, estadoR = ? WHERE curpR = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, parentesco);
            ps.setString(6, estado);
            return ps.executeUpdate();
            
            
        } catch (Exception e) {//Agarra el error y lo muestra
            System.out.println("Error:"+ e.getMessage());
            return resultado;
        }
    }
    
    
    
    
    
}
