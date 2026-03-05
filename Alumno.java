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

    //Getters
    public String getNombre(){
        return this.nombre;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public double getCalificacion1(){
        return this.calificacion1;
    }
     public double getCalificacion2(){
        return this.calificacion2;
    }
     public double getCalificacion3(){
        return this.calificacion3;
    }
}