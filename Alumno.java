public class Alumno{
    private String nombre;
    private String matricula;
    private double calificacion1=0;
    private double calificacion2=0;
    private double calificacion3=0;
    private double promedio=0;

    
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
            this.promedio=promedio;
    }

    //Calcular promedio
    public void calcularPromedio(){
        promedio=calificacion1+calificacion2+calificacion3;
    }

    //Mostrar alumno
    public void mostrarAlumno(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Matricula: ");
        System.out.println("Promedio");
    }
}