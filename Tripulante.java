import java.util.Arrays;

public class Tripulante extends UsuarioMoodle {
  private double[] calificaciones;
  private boolean[] entregas;

  public Tripulante (String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n){
    super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
    this.entregas = new boolean[n];
    for (int i = 0; i < entregas.length; i++){
      entregas[i] = false;
    }
    this.calificaciones = new double[n];
    for (int i = 0; i < calificaciones.length; i++){
      calificaciones[i] = 0;
    }
  }

    public boolean[] isEntregas() {
        return entregas;
    }
    public boolean getEntregas(int index) {
      return entregas[index];
    }
    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    public double[] getCalificaciones() {
        return calificaciones;
    }
    public void setCalificaciones(int index) {
        this.calificaciones[index] = 5;
    }

    public void resolverReto(int retoAEntregar){
      this.entregas[retoAEntregar] = true;
    } 

  @Override
    public String toString(){
        String info = (
                       "Nombre del estudiante: " + this.getNombreCompleto() + "\n" +
                       "Documento de identidad: " + this.getDocumentoIdentidad() + "\n" +
                       "Password: " + this.getPassword() + "\n" +
                       "Correo del estudiante: " + this.getCorreo() + "\n" +
                       "Mantra del estudiante: " + this.getDescripcion() + "\n" +
                       "Estado de entregas" + Arrays.toString(this.entregas) + "\n" +
                       "Calificaciones" + Arrays.toString(this.calificaciones));
        return info;
    }
  
  }
