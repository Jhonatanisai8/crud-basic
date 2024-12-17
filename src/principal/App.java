package principal;

import models.Persona;
import procedures.PersonaDaoImple;

public class App {
    public static void main(String[] args) throws Exception {
        PersonaDaoImple repo = new PersonaDaoImple();
        System.out.println("LISTA DE PERSONAS");
        repo.listar().forEach(t -> System.out.println(t));
        System.out.println("---------------------");
        Persona personao01 = new Persona();
        personao01.setNombre("Pedro");
        personao01.setApellido("Juarez");
        personao01.setDni("12344111");
        personao01.setTelefono("98712354");

        Persona persona02 = new Persona();
        persona02.setNombre("Walter");
        persona02.setApellido("Florez");
        persona02.setDni("87654312");
        persona02.setTelefono("991232124");
        if (repo.insertar(persona02) && repo.insertar(personao01)) {
            System.out.println("Insertado...");
        }
        System.out.println("LISTA DE PERSONAS");
        repo.listar().forEach(t -> System.out.println(t));
        System.out.println("---------------------");

    }
}
