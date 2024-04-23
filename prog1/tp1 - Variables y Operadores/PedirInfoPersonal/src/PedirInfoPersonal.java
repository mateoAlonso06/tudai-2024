import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PedirInfoPersonal {
    public static void main(String[] args) {
        String nombre, ocupacion;
        int edad;
        float altura;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.readLine();
            System.out.println("Ingrese su edad: ");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su altura: ");
            altura = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese su ocupacion: ");
            ocupacion = entrada.readLine();

            System.out.println();
            // imprimo la info
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura);
            System.out.println("Ocupación: " + ocupacion);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
