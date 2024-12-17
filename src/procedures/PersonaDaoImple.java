package procedures;

import java.sql.Connection;
import java.sql.PreparedStatement;

import data.ConexionBD;
import models.Persona;

public class PersonaDaoImple implements Repositorio<Persona> {

    private static final String SQL_INSERT = "INSERT INTO persona(nombre,apellido,dni,telefono) VALUES (?,?,?,?)";

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
}
