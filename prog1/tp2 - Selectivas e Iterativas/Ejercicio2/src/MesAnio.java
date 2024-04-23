import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MesAnio {
    public static void main(String[] args) {
        final int MES_MIN = 1;
        final int MES_MAX = 12;

        int numeroMes;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero de mes:");
            numeroMes = Integer.valueOf(entrada.readLine());

            if (numeroMes >= MES_MIN && numeroMes <= MES_MAX) {
                switch(numeroMes) {
                    // 31 dias
                    case 2: {
                        System.out.println("Ingrese el numero del año:");
                        int anio = Integer.valueOf(entrada.readLine());
                        
                        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                            System.out.println("El año ingresado: " + anio + " es bisiesto por lo que tiene 29 dias");
                        else
                            System.out.println("El año ingresado: " + anio + " tiene 28 dias");
                    }
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("El mes ingresado " + numeroMes + " tiene 31 dias");
                        break;
                    default:
                        System.out.println("El mes ingresado " + numeroMes + " tiene 30 dias");
                        break;
                }
            } else {
                System.out.println("El numero ingresado no corresponde a ningun mes");
            }
        }
        catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
