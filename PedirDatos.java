import java.util.Scanner;

public class PedirDatos {

    private final Scanner sc;

    // ============================================================
    // CONSTRUCTORES
    // ============================================================

    public PedirDatos() {
        this.sc = new Scanner(System.in);
    }

    public PedirDatos(Scanner sc) {
        this.sc = sc;
    }

    // ============================================================
    // CADENAS
    // ============================================================

    /** Pide una cadena no vacía */
    public String pedirCadena(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            String cadenaTemp = sc.nextLine().trim();
            if (!cadenaTemp.isEmpty()) {
                return cadenaTemp;
            }
            System.out.println("Error: el campo no puede estar vacío.");
        }
    }

    /** Pide una cadena y la devuelve en MAYÚSCULAS */
    public String pedirCadenaMayusculas(String mensaje) {
        return pedirCadena(mensaje).toUpperCase();
    }

    /** Pide una cadena y la devuelve en minúsculas */
    public String pedirCadenaMinusculas(String mensaje) {
        return pedirCadena(mensaje).toLowerCase();
    }

    // ============================================================
    // ENTEROS
    // ============================================================

    /** Pide un entero */
    public int pedirEntero(String mensaje) {
        return pedirEntero(mensaje, 1, Integer.MAX_VALUE);
    }

    /** Pide un entero dentro de un rango */
    public int pedirEntero(String mensaje, int min, int max) {
        while (true) {
            System.out.print(mensaje + " [" + min + "-" + max + "]: ");
            try {
                int valor = Integer.parseInt(sc.nextLine().trim());
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.println("Error: debe estar entre " + min + " y " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Error: ingresa un número entero válido.");
            }
        }
    }

    /** Pide un entero positivo */
    public int pedirEnteroPositivo(String mensaje) {
        return pedirEntero(mensaje, 1, Integer.MAX_VALUE);
    }

    /** Pide un entero no negativo */
    public int pedirEnteroNoNegativo(String mensaje) {
        return pedirEntero(mensaje, 0, Integer.MAX_VALUE);
    }

    /** Pide un año con rango razonable */
    public int pedirAnio(String mensaje) {
        return pedirEntero(mensaje, 1900, 2100);
    }

    /** Pide una opción de menú del 1 al máximo indicado */
    public int pedirOpcion(int max) {
        return pedirEntero("Elige una opción", 1, max);
    }

    // ============================================================
    // DECIMALES
    // ============================================================

    /** Pide un double cualquiera */
    public double pedirDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            try {
                return Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: ingresa un número decimal válido.");
            }
        }
    }

    /** Pide un double dentro de un rango */
    public double pedirDouble(String mensaje, double min, double max) {
        while (true) {
            double valor = pedirDouble(mensaje);
            if (valor >= min && valor <= max) {
                return valor;
            }
            System.out.println("Error: debe estar entre " + min + " y " + max + ".");
        }
    }

    /** Pide un double positivo */
    public double pedirDoublePositivo(String mensaje) {
        while (true) {
            double valor = pedirDouble(mensaje);
            if (valor > 0) {
                return valor;
            }
            System.out.println("Error: el valor debe ser mayor que 0.");
        }
    }

    // ============================================================
    // BOOLEANOS
    // ============================================================

    /** Pide s/n y devuelve true/false */
    public boolean pedirBooleano(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (s/n): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("s"))
                return true;
            if (input.equals("n"))
                return false;
            System.out.println("Error: responde 's' o 'n'.");
        }
    }

    /** Pide true/false como texto */
    public boolean pedirBooleanoTrueFalse(String mensaje) {
        while (true) {
            System.out.print(mensaje + " (true/false): ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.equals("true"))
                return true;
            if (input.equals("false"))
                return false;
            System.out.println("Error: responde 'true' o 'false'.");
        }
    }

    // ============================================================
    // CARACTERES
    // ============================================================

    /** Pide un solo carácter */
    public char pedirCaracter(String mensaje) {
        while (true) {
            System.out.print(mensaje + ": ");
            String input = sc.nextLine().trim();
            if (input.length() == 1) {
                return input.charAt(0);
            }
            System.out.println("Error: ingresa un solo carácter.");
        }
    }

    /** Pide un carácter que sea letra */
    public char pedirLetra(String mensaje) {
        while (true) {
            char c = pedirCaracter(mensaje);
            if (Character.isLetter(c)) {
                return c;
            }
            System.out.println("Error: ingresa una letra.");
        }
    }

    // ============================================================
    // MENÚS
    // ============================================================

    public int mostrarMenu(String titulo, String[] opciones) {
        System.out.println("\n===== " + titulo + " =====");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((i + 1) + ". " + opciones[i]);
        }
        return pedirEntero("Elige una opción", 1, opciones.length);
    }

    // ============================================================
    // UTILIDADES
    // ============================================================

    /** Pausa y espera que el usuario presione Enter para continuar */
    public void pausar() {
        System.out.print("\nPresiona Enter para continuar...");
        sc.nextLine();
    }

    /** Imprime una línea separadora */
    public void separador() {
        System.out.println("----------------------------------------");
    }

    /** Cierra el Scanner (llamar solo al final del programa) */
    public void cerrar() {
        sc.close();
    }
}
