import java.util.Arrays;

public class Formador extends UsuarioMoodle {
  public String escalafon;
  

  public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo,
      String descripcion) {
    super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
    this.escalafon = escalafon;
    
  }

  public String getEscalafon() {
    return escalafon;
  }

  public void setEscalafon(String escalafon) {
    this.escalafon = escalafon;
  }

  public void calificar(Tripulante tripulanteACalificar, int k) {
    if (tripulanteACalificar.isEntregas()[k]){ 
      tripulanteACalificar.setCalificaciones(k);
    }
  }

  @Override
    public String toString(){
        String info = ("Escalafon del formador: " + this.escalafon + "\n" +
                       "Nombre del formador: " + this.getNombreCompleto() + "\n" +
                       "Documento de identidad: " + this.getDocumentoIdentidad() + "\n" +
                       "Password: " + this.getPassword() + "\n" +
                       "Correo del formador: " + this.getCorreo() + "\n" +
                       "Mantra del formador: " + this.getDescripcion());
        return info;
    }
  
}   
