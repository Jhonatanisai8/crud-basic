package procedures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.ConexionBD;
import models.Persona;

public class PersonaDaoImple implements Repositorio<Persona> {

    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,dni,telefono) VALUES (?,?,?,?)";
    private static final String SQL_SELECT = "SELECT id_persona,nombre,apellido,dni,telefono FROM persona";

    private Connection conectar() {
        return ConexionBD.getConexion();
    }

    @Override
    public boolean insertar(Persona persona) {
        int valor = -1;
        try (Connection con = conectar();
                PreparedStatement pr = con.prepareStatement(SQL_INSERT)) {
            // parametros
            pr.setString(1, persona.getNombre());
            pr.setString(2, persona.getApellido());
            pr.setString(3, persona.getDni());
            pr.setString(4, persona.getTelefono());
            // ejecutamos
            valor = pr.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar a la persona: " + e.getMessage());
        }
        return valor != -1;
    }

    @Override
    public List<Persona> listar() {
        List<Persona> listaPersonas = new ArrayList<>();
        try (Connection con = conectar();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(SQL_SELECT);) {
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(rs.getLong("id_persona"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDni(rs.getString("dni"));
                persona.setTelefono(rs.getString("telefono"));
                listaPersonas.add(persona);
            }
        } catch (Exception e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
        return listaPersonas;

    }
}
