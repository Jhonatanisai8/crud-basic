package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import models.Ciudad;
import models.Persona;
import procedures.CiudadDaoImple;
import procedures.PersonaDaoImple;

public class App {
    static CiudadDaoImple REPO = new CiudadDaoImple();
    static PersonaDaoImple REPO_PERSONA = new PersonaDaoImple();

    public static void main(String[] args) throws Exception {
        // listarPersonas();
        // buscarPersona();
        listarCiudades();
        buscarCiudad();
    }

    public static void insertandoCiudades() {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Lima", "Perú"));
        ciudades.add(new Ciudad("Buenos Aires", "Argentina"));
        ciudades.add(new Ciudad("Madrid", "España"));
        ciudades.add(new Ciudad("São Paulo", "Brasil"));
        ciudades.add(new Ciudad("México City", "México"));
        ciudades.add(new Ciudad("New York", "Estados Unidos"));
        ciudades.add(new Ciudad("Paris", "Francia"));
        ciudades.add(new Ciudad("Roma", "Italia"));
        ciudades.add(new Ciudad("Barcelona", "España"));
        ciudades.add(new Ciudad("Berlin", "Alemania"));
        ciudades.add(new Ciudad("Tokyo", "Japón"));
        ciudades.add(new Ciudad("Seoul", "Corea del Sur"));
        ciudades.add(new Ciudad("Moscú", "Rusia"));
        ciudades.add(new Ciudad("Los Angeles", "Estados Unidos"));
        ciudades.add(new Ciudad("Chicago", "Estados Unidos"));
        ciudades.add(new Ciudad("Rio de Janeiro", "Brasil"));
        ciudades.add(new Ciudad("Santiago", "Chile"));
        ciudades.add(new Ciudad("Bogotá", "Colombia"));
        ciudades.add(new Ciudad("Caracas", "Venezuela"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Cairo", "Egipto"));
        ciudades.add(new Ciudad("Mumbai", "India"));
        ciudades.add(new Ciudad("Shanghai", "China"));
        ciudades.add(new Ciudad("Istanbul", "Turquía"));
        ciudades.add(new Ciudad("Dubai", "Emiratos Árabes Unidos"));
        ciudades.add(new Ciudad("Copenhague", "Dinamarca"));
        ciudades.add(new Ciudad("Estambul", "Turquía"));
        ciudades.add(new Ciudad("Montreal", "Canadá"));
        ciudades.add(new Ciudad("Toronto", "Canadá"));
        ciudades.add(new Ciudad("Sydney", "Australia"));
        ciudades.add(new Ciudad("Cape Town", "Sudáfrica"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Kuala Lumpur", "Malasia"));
        ciudades.add(new Ciudad("Bangkok", "Tailandia"));
        ciudades.add(new Ciudad("Singapore", "Singapur"));
        ciudades.add(new Ciudad("Hong Kong", "China"));
        ciudades.add(new Ciudad("Jakarta", "Indonesia"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Manila", "Filipinas"));
        ciudades.add(new Ciudad("Abuja", "Nigeria"));
        ciudades.add(new Ciudad("Addis Abeba", "Etiopía"));
        ciudades.add(new Ciudad("Kinshasa", "República del Congo"));
        ciudades.add(new Ciudad("Bagdad", "Irak"));
        ciudades.add(new Ciudad("Teherán", "Irán"));
        ciudades.add(new Ciudad("Karachi", "Pakistán"));
        ciudades.add(new Ciudad("Nairobi", "Kenia"));
        ciudades.add(new Ciudad("Jakarta", "Indonesia"));
        ciudades.add(new Ciudad("São Paulo", "Brasil"));
        ciudades.add(new Ciudad("Madrid", "España"));
        ciudades.add(new Ciudad("Washington D.C.", "Estados Unidos"));
        ciudades.add(new Ciudad("Lima", "Perú"));
        ciudades.add(new Ciudad("Paris", "Francia"));
        ciudades.add(new Ciudad("London", "Reino Unido"));
        ciudades.add(new Ciudad("Hong Kong", "China"));
        ciudades.add(new Ciudad("Rio de Janeiro", "Brasil"));
        ciudades.add(new Ciudad("Delhi", "India"));
        ciudades.add(new Ciudad("Los Angeles", "Estados Unidos"));
        ciudades.add(new Ciudad("Dallas", "Estados Unidos"));
        ciudades.add(new Ciudad("San Pablo", "Brasil"));
        ciudades.add(new Ciudad("Shenzhen", "China"));
        ciudades.add(new Ciudad("Seoul", "Corea del Sur"));
        ciudades.add(new Ciudad("Vancouver", "Canadá"));
        ciudades.add(new Ciudad("Jakarta", "Indonesia"));
        ciudades.add(new Ciudad("Buenos Aires", "Argentina"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Rome", "Italia"));
        ciudades.add(new Ciudad("Cape Town", "Sudáfrica"));
        ciudades.add(new Ciudad("Mexico City", "México"));
        ciudades.add(new Ciudad("Los Angeles", "Estados Unidos"));
        ciudades.add(new Ciudad("Sydney", "Australia"));
        ciudades.add(new Ciudad("Singapore", "Singapur"));
        ciudades.add(new Ciudad("Shanghai", "China"));
        ciudades.add(new Ciudad("New Delhi", "India"));
        ciudades.add(new Ciudad("Bangkok", "Tailandia"));
        ciudades.add(new Ciudad("Nairobi", "Kenia"));
        ciudades.add(new Ciudad("Melbourne", "Australia"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Beijing", "China"));
        ciudades.add(new Ciudad("Sao Paulo", "Brasil"));
        ciudades.add(new Ciudad("Moscow", "Rusia"));
        ciudades.add(new Ciudad("Cairo", "Egipto"));
        ciudades.add(new Ciudad("Bangalore", "India"));
        ciudades.add(new Ciudad("Chennai", "India"));
        ciudades.add(new Ciudad("Jakarta", "Indonesia"));
        ciudades.add(new Ciudad("Nairobi", "Kenia"));
        ciudades.add(new Ciudad("Lagos", "Nigeria"));
        ciudades.add(new Ciudad("Istanbul", "Turquía"));
        ciudades.add(new Ciudad("Berlin", "Alemania"));
        ciudades.add(new Ciudad("Rio de Janeiro", "Brasil"));
        ciudades.add(new Ciudad("Rio de Janeiro", "Brasil"));
        ciudades.add(new Ciudad("Cairo", "Egipto"));
        ciudades.add(new Ciudad("San Francisco", "Estados Unidos"));
        ciudades.add(new Ciudad("Berlin", "Alemania"));
        ciudades.add(new Ciudad("London", "Reino Unido"));
        ciudades.add(new Ciudad("Paris", "Francia"));
        ciudades.add(new Ciudad("Toronto", "Canadá"));
        ciudades.add(new Ciudad("Kuala Lumpur", "Malasia"));
        ciudades.add(new Ciudad("Dubai", "Emiratos Árabes Unidos"));
        ciudades.add(new Ciudad("Milan", "Italia"));
        ciudades.add(new Ciudad("Rome", "Italia"));
        ciudades.add(new Ciudad("Los Angeles", "Estados Unidos"));
        ciudades.add(new Ciudad("Chicago", "Estados Unidos"));
        ciudades.add(new Ciudad("Sydney", "Australia"));
        ciudades.add(new Ciudad("Bangkok", "Tailandia"));
        ciudades.add(new Ciudad("Shenzhen", "China"));
        ciudades.add(new Ciudad("Singapore", "Singapur"));
        ciudades.add(new Ciudad("Paris", "Francia"));
        ciudades.add(new Ciudad("Tokyo", "Japón"));

        for (int i = 0; i < ciudades.size(); i++) {
            if (REPO.insertar(ciudades.get(i))) {
                System.out.println("Insertando......");
            }
        }

    }

    public static void listarCiudades() {
        REPO.listar().forEach(t -> System.out.println(t));
    }

    public static void listarPersonas() {
        System.out.println("\tLISTA DE PERSONAS");
        REPO_PERSONA.listar().forEach(t -> System.out.println(t));
    }

    public static void buscarPersona() {
        System.out.println("\nBUSCANDO PERSONAS");
        Long id = 3l;
        Persona p = REPO_PERSONA.buscar(REPO_PERSONA.listar(), id);
        if (p != null) {
            System.out.println(p.toString());
        } else {
            System.out.println("Persona no Encontrada");
        }

    }

    public static void buscarCiudad(){
        System.out.println("\tBUSCANDO UNA CIUDAD");
        Long id = 4l;
        Ciudad ciudad = REPO.buscar(REPO.listar(), id);
        if (ciudad != null) {
            System.out.println(ciudad.toString());
        } else {
            System.out.println("NO ENCONTRADO");            
        }
    }
}
