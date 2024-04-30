public class Incrementar {
    public static void main(String[] args) {
        final int MAX = 4;
        int numero = 1;
        incrementarNumero(numero, MAX);
    }
    
    public static void incrementarNumero(int num, int max) {
        for(int i = num; i <= max; i++) 
            System.out.println("El valor actual es: " + i);
    }
}
