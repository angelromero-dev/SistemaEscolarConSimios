public class Alumno{
    private String nombre;
    private String matricula;
    private double calificacion1=0;
    private double calificacion2=0;
    private double calificacion3=0;

    
    //Constructor vacio
    public Alumno(){
    }

    //Constructor con todo
    public Alumno(String nombre, String matricula, 
        double calificacion1, double calificacion2, double calificacion3, double promedio){
            this.nombre=nombre;
            this.matricula=matricula;
            this.calificacion1=calificacion1;
            this.calificacion2=calificacion2;
            this.calificacion3=calificacion3;
    }

    //Calcular promedio
    public double calcularPromedio(){
        return(calificacion1+calificacion2+calificacion3)/3;
    }

    //Mostrar alumno
    public void mostrarAlumno(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Matricula: "+matricula);
        System.out.println("Promedio"+calcularPromedio());
    }
}