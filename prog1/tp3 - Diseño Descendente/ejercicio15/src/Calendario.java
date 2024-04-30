import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calendario {
    public static void main(String[] args) {
        final int MIN_MES = 1;
        final int MAX_MES = 12;
        int mes = pedirMes(MIN_MES, MAX_MES);
        while(mes >= MIN_MES && mes <= MAX_MES) {
            cantidadDeDias(mes);

            mes = pedirMes(MIN_MES, MAX_MES);
        }
    }

    public static int pedirMes(int MIN, int MAX) {
        int mes = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Ingrese un mes del año en numeros:");
                mes = Integer.valueOf(entrada.readLine());
                if (mes >= MIN && mes <= MAX) 
                    flag = true;
                else
                    System.out.println("Mes no valido");
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        return mes;
    }

    public static void cantidadDeDias(int mes) {
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println(mes + "Tiene 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println(mes + "Tiene 30 dias");
                break;
            default:
                System.out.println(mes + "Tiene 28 dias");
        }
    }
}
