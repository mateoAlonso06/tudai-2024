import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AplicaDescuento {
    final static int MARTES = 1;
    final static int JUEVES = 2;
    public static void main(String[] args) {
        int diaCompra;
        float importe;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el dia:");
            diaCompra = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el importe:");
            importe = Float.valueOf(entrada.readLine());

            System.out.println("Aplica descuento? " + ((diaCompra == MARTES && importe > 13000) || (diaCompra == JUEVES && importe > 25000)));
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
