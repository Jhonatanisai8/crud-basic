
package procedures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.ConexionBD;
import models.Ciudad;

public class CiudadDaoImple implements Repositorio<Ciudad> {
    final static String SQL_INSERT = "INSERT INTO ciudad (nombre_ciudad,ubicacion) VALUES (?,?)";
    final static String SQL_SELECT = "SELECT id_ciudad,nombre_ciudad,ubicacion FROM ciudad";

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
        List<Ciudad> listaCiudades = new ArrayList<>();
        try (Connection con = ConexionBD.getConexion();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(SQL_SELECT)) {
            while (rs.next()) {
                Ciudad ciudad = new Ciudad();
                ciudad.setIdCiudad(rs.getLong("id_ciudad"));
                ciudad.setNombreCiudad(rs.getString("nombre_ciudad"));
                ciudad.setUbicacion(rs.getString("ubicacion"));
                listaCiudades.add(ciudad);
            }
        } catch (Exception e) {
            System.out.println("Error al listar las ciudades: " + e.getMessage());
        }

        return listaCiudades;
    }
}
