import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SerieDeNumeros {
    public static void main(String[] args) {
        int numero = 0;
        int mayor = 0;
        for(int i = 0; i < 20; i++) {
            numero = pedirEntero();
            if (i == 0) 
                mayor = numero;
            else {
                if(mayorNum(numero, mayor) > mayor)
                    mayor = mayorNum(numero, mayor);
            }
        }
        System.out.println("El mayor valor ingresado fue: " + mayor);
    }

    public static int pedirEntero() {
        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ingrese un numero entero:");
            numero = Integer.valueOf(entrada.readLine());
        } catch (Exception exc) {
            System.out.println(exc);
        }
        return numero;
    }

    public static int mayorNum(int num, int mayor) {
        if (num > mayor)
            return num;
        else
            return mayor;
    }
}
