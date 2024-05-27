package bonusTrack;

public class Ejercicio1 {
    final static int MAX = 19;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        final int N = 1;
        final double M = 2.0;
        double[] arr = {0, 2.5, 1.5, 4.4, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0};
        // primero hallo las secuencias
        int ini = 0, fin = -1;

        double promedioTotal = 0;
        int cantidadDias = 0;
        while (ini < MAX) {
            ini = obtenerInicio(arr, fin+1);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini);
                int cantidadTemblores = fin-ini+1;
                if (cantidadTemblores > N) {
                    double promedioIndividual = calcularPromedioIndividual(arr, ini, fin, cantidadTemblores);
                    if (promedioIndividual > M) {
                        promedioTotal+= promedioIndividual;
                        cantidadDias++;
                    }
                }
            }
        }

        if (cantidadDias > 0) {
            System.out.println("El promedio de sismos para los dias que cumplen la condición es: " + (promedioTotal / cantidadDias));
        }
    }

    public static double calcularPromedioIndividual(double[] arr, int ini, int fin, int cant) {
        double acumulador = 0;
        for (int i = ini; i <= fin; i++)
            acumulador+= arr[i];
        return acumulador / cant;
    }

    public static int obtenerInicio(double[] arr, int pos) {
        while (pos < MAX && arr[pos] == DIVISOR) 
            pos++;
        return pos;
    }

    public static int obtenerFin(double[] arr, int pos) {
        while (pos < MAX && arr[pos] != DIVISOR) 
            pos++;
        return pos-1;
    }
}
