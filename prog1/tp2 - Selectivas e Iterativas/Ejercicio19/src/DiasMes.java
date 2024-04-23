import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiasMes {
    public static void main(String[] args) {
        final int MIN_MES = 1;
        final int MAX_MES = 12;

        int numeroDelMes = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero del mes:");
            numeroDelMes = Integer.valueOf(entrada.readLine());

            if (numeroDelMes >= MIN_MES && numeroDelMes <= MAX_MES) {
                switch (numeroDelMes) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println("El mes ingresado: " + numeroDelMes + " tiene 30 dias");
                        break;
                    case 4, 6, 9, 11:
                        System.out.println("El mes ingresado: " + numeroDelMes + " tiene 31 dias");
                        break;
                    default: {
                            System.out.println("Ingrese el mes del anio (entre 2000 y 2019):");
                            int anio = Integer.valueOf(entrada.readLine());

                            while (anio >= 2000 && anio <= 2019) {
                                if((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
                                    System.out.println("El anio es bisiesto, por ende tiene 29 dias!");
                                else 
                                    System.out.println("El anio tiene 28 dias");

                                System.out.println("Ingrese el anio nuevamente:");
                                anio = Integer.valueOf(entrada.readLine());
                            }
                        }
                        break;
                }
            } else {
                System.out.println("El numero ingresado no es valido");
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
