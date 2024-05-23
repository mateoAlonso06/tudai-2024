public class Factorial {
    public static void main(String[] args) {
        int numeroNatural = 5;
        int resultado = obtenerFactorial(numeroNatural);
        System.out.println("El resultado del factorial es: " + resultado);
    }

    public static int obtenerFactorial(int numero) {
        int resultado = 1;
        while (numero > 1)  {
            resultado *= numero;
            numero--;
            System.out.println(resultado);
        }
        return resultado;
    }
}
