import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IngresarDos {
    public static void main(String[] args) {
        int num1, num2;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el primer numero:");
            num1 = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el segundo numero:");
            num2 = Integer.valueOf(entrada.readLine());

            System.out.println("El primero es mayor?: " + (num1 > num2));
            System.out.println("Ambos son multiplos de 2?: " + (num1 % 2 == 0 && num2 % 2 == 0));
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
