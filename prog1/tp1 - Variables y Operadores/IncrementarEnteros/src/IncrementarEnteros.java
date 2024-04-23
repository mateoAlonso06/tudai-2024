import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncrementarEnteros {
    public static void main(String[] args) {
        int num1, num2;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el primer numero:");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero:");
            num2 = Integer.valueOf(entrada.readLine());

            System.out.println("Valor original: " + num1++);
            System.out.println("Valor incrementado: " + num1);
            
            System.out.println("Valor original: " + num2--);
            System.out.println("Valor decrementado: " + num2);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
