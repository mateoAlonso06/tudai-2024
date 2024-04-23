import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PromedioNumeros {
    public static void main(String[] args) {
        final int CORTE = 0;
        int numero;
        int cantidadDeNumeros = 0, acumulador = 0, promedio = 0;
        int menorNumero, maxNumero;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        menorNumero = 0;
        maxNumero = 0;

        try {
            System.out.println("Ingrese un numero entero distinto de (" + CORTE +"):");
            numero = Integer.valueOf(entrada.readLine());

            if (numero != 0) {
                menorNumero = numero;
                maxNumero = numero;
            }

            while (numero != CORTE) {
                cantidadDeNumeros++;
                acumulador+= numero;

                if (numero < menorNumero)
                    menorNumero = numero;
                else {
                    if (numero > maxNumero)
                        maxNumero = numero;
                }

                System.out.println("Vuelva a ingresar otro numero (" + CORTE + ") para salir:");
                numero = Integer.valueOf(entrada.readLine());
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        if (cantidadDeNumeros != 0)
            promedio = acumulador / cantidadDeNumeros;
        else 
            System.out.println("No se ingresaron numeros");
        
        System.out.println("El promedio fue de: " + promedio);
        System.out.println("El menor valor fue: " + menorNumero + " y el mayor valor fue: " + maxNumero);
    }
}
