import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PedirReales {
    public static void main(String[] args) {
        float num1, num2, num3;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese el primer numero:");
            num1 = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero:");
            num2 = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese el tercer numero:");
            num3 = Float.valueOf(entrada.readLine());

            System.out.println((num1 / num2) - num3);
        }
        catch (Exception exc) {

        }
    }
}