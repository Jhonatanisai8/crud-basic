package procedures;

import java.sql.Connection;
import java.sql.PreparedStatement;

import data.ConexionBD;
import models.Persona;

public class PersonaDaoImple implements Repositorio<Persona> {
    
    private static final String SQL_INSERT = "";
    private Connection conectar() {
        return ConexionBD.getConexion();
    }


    @Override
    public void insertar(Persona persona) {
        try (Connection con = conectar();
        PreparedStatement pr = con.prepareStatement(null)
         ){

        } catch (Exception e) {
            System.out.println("Error al insertar a la persona: " + e.getMessage());
        }
    }
}
