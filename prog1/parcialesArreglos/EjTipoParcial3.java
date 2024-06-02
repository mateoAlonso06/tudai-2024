public class EjTipoParcial3 {
    final static int MAX = 21;
    final static int MAX_PATRON = 21;
    final static int SEPARADOR = -1;
    final static int N = 2;
    public static void main(String[] args) {
        int[] arr = {-1, 12, 22, 44, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 55, -1, 23, 34, 57, -1};
        int[] patron = {-1, -1, -1, -1, -1, -1, -1, 23, 34, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        
        mostrarArreglo(arr, MAX);
        // consigna

        int iniP = 0, finP = -1;
        iniP = obtenerInicio(patron, finP+1, MAX_PATRON);
        finP = obtenerFin(patron, iniP, MAX_PATRON);

        int cantidadRepeticionesMin = buscarPatron(patron, iniP, finP, arr);
        int contador = 0;
        if (cantidadRepeticionesMin >= N) {
            int ini = 0, fin = -1;
            while (ini < MAX) {
                ini = obtenerInicio(arr, fin+1, MAX);
                if (ini < MAX) {
                    fin = obtenerFin(arr, ini, MAX);
                    contador++;
                    if (sonIguales(arr, ini, fin, patron, iniP, finP)) {
                        if (contador >= cantidadRepeticionesMin)
                        eliminarSecuencia(arr, ini, fin);
                        System.out.println("Secuencia eliminada");
                        fin = ini;
                    }
                }
            }
        }
        mostrarArreglo(arr, MAX);
    }

    public static void eliminarSecuencia(int[] arr, int ini, int fin) {
        for (int i = ini; i <= fin; i++)
            corrimientoIzquierda(arr, ini);
    }

    public static void corrimientoIzquierda(int[] arr, int ini) {
        while (ini < MAX - 1) {
            arr[ini] = arr[ini + 1];
            ini++;
        }
    }

    public static int obtenerInicio(int[] arr, int pos, int lenght) {
        while (pos < lenght && arr[pos] == SEPARADOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos, int MAX) {
        while (pos < MAX && arr[pos] != SEPARADOR) 
            pos++;
        return pos-1;
    }

    public static int buscarPatron(int[] patron, int iniP, int finP, int[] arr) {
        int contador = 0;
        int ini = 0, fin = -1;
        while (ini < MAX && contador <= 2) {
            System.out.println("Dentro del while");
            ini = obtenerInicio(arr, fin+1, MAX);
            if (ini < MAX) {
                fin = obtenerFin(arr, ini, MAX);
                if (sonIguales(arr, ini, fin, patron, iniP, finP)) {
                    contador++;
                }
            }
        }
        System.out.println("Fuera del while");
        return contador;
    }

    public static boolean sonIguales(int[] arr, int ini, int fin, int[] patron, int iniP, int finP) {
        int tamA = fin - ini + 1;
        int tamB = finP - iniP + 1;

        int contador = 0;

        if (tamA == tamB) {
            while (ini <= fin && arr[ini] == patron[iniP]) {
                contador++;
                iniP++;
                ini++;
            }
        }
        return contador == tamA;
    }

    public static void mostrarArreglo(int[] arr, int length) {
        for (int i = 0; i < length; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }
}