public class Escuela extends Alumno {
    private String alumno;

    public Escuela(String nombre, String matricula, 
        double calificacion1, double calificacion2, double calificacion3, String alumno){

            super(nombre, matricula,calificacion1,calificacion2,calificacion3 );

            this.alumno=alumno;        
        }
        
    public void mostrarAlumno(){
       super.mostrarAlumno();
    }
        
}
