import java.sql.*;

public class Educadore {
    
    static String todos = "SELECT * FROM educadores ORDER BY nombreE";
    static String curps = "SELECT curpE FROM educadores ORDER BY curpI";
    //Declarar variables
    String curp,nombre,sexo,telefono,direccion,estado;

    public Educadore() {
        
        
    }
    //Constructor

    public Educadore(String curp, String nombre, String sexo, String telefono, String direccion, String estado) {
        this.curp = curp;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }
    
        
    public int insertar(Connection con){
        int resultado = 0;
        
        try {
            String sql = "INSERT INTO educadores VALUES(?, ?, ?, ?, ?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
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
             String sql = "DELETE FROM educadores WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
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
            String sql = "UPDATE educadores  SET nombreE = ?,sexoE = ?,telefonoE = ?,estadoE = ?,direccion = ? WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, curp);
            ps.setString(2, nombre);
            ps.setString(3, sexo);
            ps.setString(4, telefono);
            ps.setString(5, direccion);
            ps.setString(6, estado);
            return ps.executeUpdate();
            
            
        } catch (Exception e) {//Agarra el error y lo muestra
            System.out.println("Error:"+ e.getMessage());
            return resultado;
        }
    }
}
