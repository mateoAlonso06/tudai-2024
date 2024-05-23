public class Sumatoria {
    public static void main(String[] args) {
        int numeroNatural = 5;
        int resultado = obtenerSumatoria(numeroNatural);
        System.out.println("El resultado de la sumatoria es: " + resultado);
    }

    public static int obtenerSumatoria(int numero) {
        int resultado = 0;
        // for(int i = 1; i <= numero; i++) {
        //     resultado+= i;
        //     System.out.println(resultado);
        // }
        while (numero > 0) {
            resultado += numero--;
            System.out.println(resultado);
        }
        return resultado;
    }
}
