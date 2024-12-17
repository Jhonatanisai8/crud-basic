package models;

public class Persona {
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private Ciudad ciudad;

    @Override
    public String toString() {
        return "Id Persona: " + getIdPersona()
                + "\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nDni: " + getDni()
                + "\nTelefono: " + getTelefono()
                + "\nId Ciudad: " + getCiudad().getIdCiudad()
                + "\nCiudad: " + getCiudad().getNombreCiudad()
                + "\nUbicacion: " + getCiudad().getUbicacion();
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

}
