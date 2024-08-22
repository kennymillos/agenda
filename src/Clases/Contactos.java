
package Clases;

/**
 * @author Kenny Londoño
 */
public class Contactos {
    int identificacion;
    String nombres;
    String apellidos;
    String telefono;
    String direccion;

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombres() {
        return nombres;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
  public String getApellidos() {
        return apellidos;
    }

    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
public String getTelefono() {
        return telefono;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
public String getDireccion() {
        return direccion;
}
        
}
