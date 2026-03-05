public class Escuela extends Alumno {
    public Escuela(String nombre, String matricula, 
        double calificacion1, double calificacion2, double calificacion3){

            super(nombre, matricula,calificacion1,calificacion2,calificacion3 );
        }
        
    public void mostrarAlumno(){
       super.mostrarAlumno();
    }
        
}