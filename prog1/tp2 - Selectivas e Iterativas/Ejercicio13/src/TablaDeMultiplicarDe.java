import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TablaDeMultiplicarDe {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 5;

        char letra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una letra minuscula:");
            letra = entrada.readLine().charAt(0);

            while (letra >= 'a' && letra <= 'z') {
                System.out.println("Ingrese un numero entero entre " + MIN + " y " + MAX + ":");
                int numero = Integer.valueOf(entrada.readLine());

                if (numero >= MIN && numero <= MAX) {
                    int resultado;
                    System.out.println("Tabla de multiplicar del " + numero);
                    for (int i = 0; i <= 10; i++) {
                        resultado = numero * i;
                        System.out.println(numero + " * " + i + " = " + resultado);
                    }
                }

                System.out.println("Ingrese otra letra minuscula:");
                letra = entrada.readLine().charAt(0);
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
        System.out.println("Fin del programa");
    }
}
