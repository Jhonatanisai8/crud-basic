
package procedures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import data.ConexionBD;
import models.Ciudad;

public class CiudadDaoImple implements Repositorio<Ciudad> {
    final static String SQL_INSERT = "INSERT INTO ciudad (nombre_ciudad,ubicacion) VALUES (?,?)";

    @Override
    public boolean insertar(Ciudad ciudad) {
        int valor = -1;
        try (Connection con = ConexionBD.getConexion();
                PreparedStatement ps = con.prepareStatement(SQL_INSERT);) {
            ps.setString(1, ciudad.getNombreCiudad());
            ps.setString(2, ciudad.getUbicacion());
            valor = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar las ciudades: " + e.getMessage());
        }
        return valor != -1;
    }

    @Override
    public List<Ciudad> listar() {
        return null;
    }
}
