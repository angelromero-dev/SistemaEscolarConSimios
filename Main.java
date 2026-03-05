public class Main {
    public static void main(String[] args) {
        PedirDatos sc = new PedirDatos();
        Escuela[] alumnosEscuela = new Escuela[100];
        do{
            int opc = sc.mostrarMenu("Sistema de alumnos", new String[]{"Agregar alumno", "Ver alumnos", "salir"});
            switch (opc) {
                case 1:
                    sc.separador();
                    String nombre = sc.pedirCadena("Ingrese el nombre del alumno");
                    String matricula = sc.pedirCadena("Ingrese la matricula del alumno");
                    double calificacion1 = sc.pedirDouble("Ingrese la calificacion 1 del alumno");
                    double calificacion2 = sc.pedirDouble("Ingrese la calificacion 2 del alumno");
                    double calificacion3 = sc.pedirDouble("Ingrese la calificacion 3 del alumno");
                    alumnosEscuela[Alumno.contador] = new Escuela(nombre, matricula, calificacion1, calificacion2, calificacion3);
                    Alumno.contador++;
                break;
                case 2:
                    sc.separador();
                    if (Alumno.contador == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (int i = 0; i < Alumno.contador; i++) {
                            sc.separador();
                            System.out.println("Alumno "+(i+1));
                            alumnosEscuela[i].mostrarAlumno();
                        }
                    }
                    break;
                case 3:
                    sc.separador();
                    System.out.println("Saliendo...");
                break;
                default:
                    sc.separador();
                    System.out.println("Opcion no valida");
            }
            sc.separador();
                
        }while(sc.pedirBooleano("Quieres hacer algo mas?"));
        System.out.println("Gracias por usar el sistema.");
        sc.cerrar();
    }
}