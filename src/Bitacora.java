
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Bitacora {
    
    static String todos = "SELECT * FROM bitacora ORDER BY folio DESC";
    
    //Variables
    String folio,fecha, tiempo, tipo, observaciones, infantesC,responsablesC,educadoresC;

    public Bitacora() {
    }

    public Bitacora(String folio,String fecha ,String tiempo, String tipo, String observaciones, String infantesC, String responsablesC, String educadoresC) {
        this.folio = folio;
        this.fecha = fecha;
        this.tiempo = tiempo;
        this.tipo = tipo;
        this.observaciones = observaciones;
        this.infantesC = infantesC;
        this.responsablesC = responsablesC;
        this.educadoresC = educadoresC;
    }
    
    
    
    
    public int insertar(Connection con) {
        int resultado = 0;

        String sql = "INSERT INTO bitacora "
                + "(tiempo, tipo, observaciones, "
                + "infantes_curp, responsables_curpR, educadores_curpE) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, tiempo);
            ps.setString(2, tipo);
            ps.setString(3, observaciones);
            ps.setString(4, infantesC);
            ps.setString(5, responsablesC);
            ps.setString(6, educadoresC);

            resultado = ps.executeUpdate();

            System.out.println("Filas insertadas: " + resultado);

        } catch (Exception e) {
            System.out.println("ERROR AL REGISTRAR BITACORA:");
            e.printStackTrace();
        }

        return resultado;
    }

    
    public int borrar(Connection con){
        int resultado = 0;
        
        try {
            String sql = "DELETE FROM bitacora WHERE curp = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, folio);
            ps.setString(2, tiempo);
            ps.setString(3, tipo );
            ps.setString(4, observaciones);
            ps.setString(5, infantesC);
            ps.setString(6, responsablesC);
            ps.setString(7, educadoresC);
            return ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error:"+ e.getMessage());
            return resultado;
            
        }
        
    }
    
public int actualizar(Connection con) {
    int resultado = 0;

    String sql = "UPDATE bitacora SET "
            + "tiempo = ?, "
            + "tipo = ?, "
            + "observaciones = ?, "
            + "infantes_curp = ?, "
            + "responsables_curpR = ?, "
            + "educadores_curpE = ? "
            + "WHERE folio = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, tiempo);
        ps.setString(2, tipo);
        ps.setString(3, observaciones);
        ps.setString(4, infantesC);
        ps.setString(5, responsablesC);
        ps.setString(6, educadoresC);
        ps.setInt(7, Integer.parseInt(folio));

        resultado = ps.executeUpdate();

        System.out.println("Filas actualizadas: " + resultado);

    } catch (Exception e) {
        System.out.println("ERROR EN BITACORA:");
        e.printStackTrace();
    }

    return resultado;
}

    
    
}
