import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SupermarketSoberano {
    static final float MONTO_DESC = 15000;
    public static void main(String[] args) {
        int numeroTicket;
        int dia;
        int dniCliente;
        float importe;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el numero de Ticket:");
            numeroTicket = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el dia:");
            dia = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese su DNI (sin puntos):");
            dniCliente = Integer.valueOf(entrada.readLine());

            System.out.println("Ingrese el importe:");
            importe = Float.valueOf(entrada.readLine());
            
            System.out.println("Aplica descuento?: " + (((numeroTicket % 2 == 0) && (importe >= MONTO_DESC) && (dniCliente % 2 != 0)) && (dia == 5 || dia == 6)));
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
