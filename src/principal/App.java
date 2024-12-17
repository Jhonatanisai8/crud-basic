package principal;


import models.Persona;
import procedures.PersonaDaoImple;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaDaoImple repo = new PersonaDaoImple();
        Persona persona = new Persona();
        persona.setNombre("Juana");
        persona.setApellido("Peralta");
        persona.setDni("12344356");
        persona.setTelefono("98712321");
        if (repo.insertar(persona)) {
            System.out.println("Insertado...");
        }
    }
}
