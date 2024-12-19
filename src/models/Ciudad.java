package models;

public class Ciudad {
    private Long idCiudad;
    private String nombreCiudad;
    private String ubicacion;

    public Ciudad() {

    }

    public Ciudad(String nombreCiudad, String ubicacion) {
        this.nombreCiudad = nombreCiudad;
        this.ubicacion = ubicacion;
    }

    public Long getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Long idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Id Ciudad: " + getIdCiudad()
                + "\nNombre Ciudad: " + getNombreCiudad()
                + "\nUbicacion: " + getUbicacion();
    }
}
