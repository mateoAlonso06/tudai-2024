import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OperacionesConReales {
    public static void main(String[] args) {
        float num1 = 0, num2 = 0, num3 = 0;
        int opcion = 0;

        num1 = pedirReal();
        num2 = pedirReal();
        num3 = pedirReal();
        opcion = pedirOpcion();

        if (opcion == 1) {
            if (num1 - num3 > 0) {
                float resultado = raizCuadrada(num1 - num3);
                System.out.println("El resultado fue: " + resultado);
            } else {
                System.out.println("No se puede calcular la raiz cuadrada de un numero negativo");
            }
        } else if (opcion == 2) {
            float resultado = calcularPromedio(num1, num2, num3);
            System.out.println("El resultado fue: " + resultado);
        } else if (opcion == 3) {
            if ((num3 - num2) >= 0 && (num1 != 0)) {
                float resultado = raizCuadrada(num3 - num2) / num1;
                System.out.println("El resultado fue: " + resultado);
            } else {
                System.out.println("No se puede calcular la raiz de un numero negativo o no se puede dividir por 0");
            }
        } else if (opcion == 4) {
            if (num2 > 0) {
                float resultado = calcularPromedio(num1, num2, num3) / raizCuadrada(num2);
                System.out.println("El resultado fue: " + resultado);
            }
        } else {
            System.out.println("La opcion ingresada no es valida, vuelva a intentarlo");
        }
    }

    public static float pedirReal() {
        float numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un número:");
            numero = Float.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static int pedirOpcion() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese una opcion:");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static float raizCuadrada(float num) {
        return (float)Math.sqrt(num);
    }

    public static float calcularPromedio(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }
}
