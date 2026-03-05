public class Alumno{
    private String nombre;
    private String matricula;
    private double calificacion1=0;
    private double calificacion2=0;
    private double calificacion3;

    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setCalificacion1(double calificacion1){
        this.calificacion1=calificacion1;
    }
    public void setCalificacion2(double calificacion2){
        this.calificacion2=calificacion2;
    }
    public void setCalificacion3(double calificacion3){
        this.calificacion3=calificacion3;
    }
}