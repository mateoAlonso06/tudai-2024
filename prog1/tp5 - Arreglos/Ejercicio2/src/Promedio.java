public class Promedio {
    static final int MAX = 10;
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        float promedio = calcularPromedio(numeros);
        System.out.println("El promedio es de: " + promedio);
    }

    public static float calcularPromedio(int[] arr) {
        int suma = 0;
        for (int i = 0; i < MAX; i++) 
            suma+= arr[i];
        
        return (float)suma / MAX;
    }
}
