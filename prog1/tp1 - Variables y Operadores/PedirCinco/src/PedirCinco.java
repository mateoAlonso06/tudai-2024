import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PedirCinco {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese num1: ");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese num2: ");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese num3: ");
            num3 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese num4: ");
            num4 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese num5: ");
            num5 = Integer.valueOf(entrada.readLine());

            // muestro los valores al reves
            System.out.println(num5);
            System.out.println(num4);
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
