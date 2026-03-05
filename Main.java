public class Main {
    public static void main(String[] args) {
        PedirDatos sc = new PedirDatos();
        do{
            int opc = sc.mostrarMenu("Sistema de alumnos", new String[]{"Agregar alumno", "Ver alumno", "Ver todos los alumnos"});
            switch(opc){
            }   
        }while(sc.pedirBooleano("Quieres agregar otro alumno? S/N"));
    }
}