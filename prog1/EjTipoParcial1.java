public class EjTipoParcial1 {
    final static int MAXP = 24;
    final static int MAXT = 2;
    final static int PRODUCTO = 99;
    final static int DIVISOR = 0;
    public static void main(String[] args) {
        int[] arrP = {0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 1, 0, 0, 0, 0};
        mostrarArreglo(arrP);
        System.out.println(arrP.length);
        int[] arrT = {5, 8};

        int cantProducto = 2;
        // hallar secuencia
        int ini = 0, fin = -1;
        while (ini < MAXP && cantProducto > 0) {
            ini = obtenerInicio(arrP, fin+1);
            if (ini < MAXP) {
                fin = obtenerFin(arrP, ini);
                if(existeEnT(arrP, ini, fin, arrT)) {
                    insertarProducto(arrP, fin);
                    cantProducto--;
                }
            }
        }
        //
        mostrarArreglo(arrP);

        if (cantProducto == 0)
            System.out.println("No quedaron productos por insertar");
        else 
            System.out.println("Quedaron en stock: " + cantProducto + " producto/s");
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < MAXP; i++) 
            System.out.print(arr[i] + " | ");
        System.out.println();
    }

    public static void insertarProducto(int[] arrP, int pos) {
        int i = MAXP-1;
        while (i > pos) {
            arrP[i] = arrP[i-1];
            i--;
        }
        arrP[pos] = PRODUCTO;
    }

    public static boolean existeEnT(int[] arrP, int ini, int fin, int[] arrT) {
        boolean ocurrencia = false;
        while (ini <= fin && !ocurrencia) {
            int valActual = arrP[ini];
            for (int i = 0; i < MAXT; i++) {
                if (valActual == arrT[i])
                    ocurrencia = true;
            }
            ini++;
        }
        return ocurrencia;
    }

    public static int obtenerInicio(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] == DIVISOR)
            pos++;
        return pos;
    }

    public static int obtenerFin(int[] arr, int pos) {
        while (pos < MAXP && arr[pos] != DIVISOR)
            pos++;
        return pos-1;
    }
}
