public class NumerosPerfectos {
    public static void main(String[] args) {
        final int MIN_NUM = 2;
        final int MAX_NUM = 10000;

        imprimirNumerosPerfectos(MIN_NUM, MAX_NUM);
    }

    public static void imprimirNumerosPerfectos(int MIN, int MAX) {
        for (int i = MIN; i <= MAX; i++) {
            int acu = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j != i)
                    acu+= j;
            }
            if (acu == i)
                System.out.println(i + " es un numero pefecto");
        }    
    }
}
