public class Main {
    public static void main(String[] args) {
        PedirDatos sc = new PedirDatos();
        Escuela escuela = new Escuela();
        do{
            int opc = sc.mostrarMenu("Sistema de alumnos", new String[]{"Agregar alumno", "Ver alumnos", "salir"});
            switch(opc){
                case 1:
                    Alumno alumno = new Alumno();
                    alumno.setNombre(sc.pedirCadena("Nombre del alumno"));
                    alumno.setMatricula(sc.pedirCadena("Matricula del alumno"));
                    alumno.setCalificacion1(sc.pedirDouble("Calificacion 1"));
                    alumno.setCalificacion2(sc.pedirDouble("Calificacion 2"));
                    alumno.setCalificacion3(sc.pedirDouble("Calificacion 3"));
                    escuela.agregarAlumno(alumno);
                break;
                case 2:
                    escuela.mostrarAlumnos();
                break;
                case 3:
                    System.out.println("Saliendo...");
                break;
            }
                
        }while(sc.pedirBooleano("Quieres agregar otro alumno? S/N"));
    }
}