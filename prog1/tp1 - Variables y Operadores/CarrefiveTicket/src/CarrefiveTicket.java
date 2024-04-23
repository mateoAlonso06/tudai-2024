import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CarrefiveTicket {
    final static String HORA_FECHA = "04/04/23 - 18:55";
    final static String CUIT = "99-34567833";
    final static String LEYENDA = "El precio lo pone el cliente";
    public static void main(String[] args) {
        String cajero = "Luis Mercado";
        String dniCliente;
        long ticket = 3455674;
        byte numeroCaja = 8;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese su DNI: ");
            dniCliente = entrada.readLine();

            System.out.println("-----------------------------------------------------");
            System.out.println(HORA_FECHA + "\t\tTicket Nro. " + ticket);
            System.out.println("\tCuit: " + CUIT);
            System.out.println("Cajero: " + cajero + "\t\tCaja: " + numeroCaja);
            System.out.println("DNI: " + dniCliente + "\t" + LEYENDA);
            System.out.println("-----------------------------------------------------");
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
