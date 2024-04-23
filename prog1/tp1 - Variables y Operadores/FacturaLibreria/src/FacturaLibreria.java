import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FacturaLibreria {
    public static void main(String[] args) {
        char tipoFactura;
        int numeroFactura;
        String nombreCliente;
        String producto1, producto2;
        float importe1, importe2, importeFinal;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese el tipo de factura:");
            tipoFactura = entrada.readLine().charAt(0);
            System.out.println("Ingrese el número de factura:");
            numeroFactura = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el nombre del cliente:");
            nombreCliente = entrada.readLine();

            System.out.println("Ingrese el producto 1:");
            producto1 = entrada.readLine();
            System.out.println("Ingrese el importe del primer producto:");
            importe1 = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto 2:");
            producto2 = entrada.readLine();
            System.out.println("Ingrese el importe del segundo producto:");
            importe2 = Float.valueOf(entrada.readLine());

            importeFinal = importe1 + importe2;
            
            System.out.println("Factura\t" + tipoFactura + "\t\tN" + numeroFactura);
            System.out.println("Nombre: " + nombreCliente);
            System.out.println("Producto\t\tImporte");
            System.out.println(producto1 + "\t\t\t" + importe1);
            System.out.println(producto2 + "\t\t\t" + importe2);
            System.out.println("Importe total\t\t" + importeFinal);
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
