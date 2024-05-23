public class EncimaDelPromedio {
    static final int MAX = 10;
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float promedio = calcularPromedio(numeros);
        System.out.println("El promedio es de: " + promedio);
        int cantidadMayorPromedio = cantidadSobreElPromedio(numeros, promedio);
        if (cantidadMayorPromedio > 0) 
            System.out.println("Hay " + cantidadMayorPromedio + " numeros sobre el promedio (" + promedio + ")");
        else
            System.out.println("No hay elementos que superen el promedio (" + promedio + ")");
    }

    public static float calcularPromedio(int[] arr) {
        int suma = 0;
        for (int i = 0; i < MAX; i++) 
            suma+= arr[i];
        
        return (float)suma / MAX;
    }

    public static int cantidadSobreElPromedio(int[] arr, float promedio) {
        int contador = 0;
        for(int i = 0; i < MAX; i++) {
            if (arr[i] > promedio)
                contador++;
        }

        return contador;
    }
}
