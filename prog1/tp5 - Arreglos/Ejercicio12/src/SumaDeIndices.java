public class SumaDeIndices {
    final static int MAX_A = 5, MAX_B = 3;
    public static void main(String[] args) {
        int[] arrA = {4, 3, 22, 3, 8};
        int[] arrB = {0, 1, 4};

        int sumaIndices = sumarIndices(arrA, arrB);
        System.out.println("El resultado de la suma fue: " + sumaIndices);
    }

    public static int sumarIndices(int[] arr1, int[] arr2) {
        int suma = 0;

        for(int i = 0; i < MAX_B; i++) {
            int valActual = arr2[i];
            // esto va a darme el indice guardado en el arreglo para utilizar a continuación
            suma += arr1[valActual];
        }

        return suma;
    }
}
