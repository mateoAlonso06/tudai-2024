import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LanzarMilDados {
    public static void main(String[] args) {
        final int CANTIDAD_LANZAMIENTOS = 1000;
        int valorDado = 0;
        System.out.println("Ingrese un valor valido para un dado (1 a 6)");
        valorDado = pedirValor();
        if (valorDado >= 1 && valorDado <= 6) {
            int coincidencias = lanzarDados(CANTIDAD_LANZAMIENTOS, valorDado);
            if (coincidencias > 0) 
                System.out.println("El valor ingresado salio un total de: " + coincidencias);
            else
                System.out.println("El valor ingresado no salio en ninguna tirada.");
        }
        else 
            System.out.println("Valor no valido, vuelva a intentarlo");
    }

    public static int pedirValor() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el valor (entero):");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static int lanzarDados(int LANZAMIENTOS, int valor) {
        int dado = 0;
        int cantidadDeCoincidencias = 0;
        for(int i = 0; i < LANZAMIENTOS; i++) {
            dado = (int)(6 * Math.random() + 1);
            if (dado == valor) 
                cantidadDeCoincidencias++;
        }
        return cantidadDeCoincidencias;
    }
}   
