
//Crear la clase publica con el nombre del .java
public class UsuarioMoodle {
  // Crear los atributos, las variables, estilo camelCase
  private String nombreCompleto;
  private String documentoIdentidad;
  private String password;
  private String correo;
  private String descripcion;

  // Crear constructor, igual a la clase pero sin la palabra class
  // y recibiendo los atributos normalmente
  public UsuarioMoodle(String nombreCompleto, String documentoIdentidad, String password, String correo,
      String descripcion) {

    this.nombreCompleto = nombreCompleto;
    this.documentoIdentidad = documentoIdentidad;
    this.password = password;
    this.correo = correo;
    this.descripcion = descripcion;
  }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  //Crear los metdos  pbli

  

  
  public void editarPerfil(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion){
    this.nombreCompleto = nombreCompleto;
    this.documentoIdentidad = documentoIdentidad;
    this.password = password;
    this.correo = correo;
    this.descripcion = descripcion;
  }
}