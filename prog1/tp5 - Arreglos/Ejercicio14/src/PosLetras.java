public class PosLetras {
    static final int MAX = 12;
    public static void main(String[] args) {
        char[] letras = {'h', 'o', 'l', 'a', 's', 'o', 'y', 'm', 'a', 't', 'e', 'o'};
        
        int[] vocales = traerVocalesPos(letras);
        int[] consonantes = traerConsonantesPos(letras);

        System.out.println("Letras vocales:");
        mostrarArreglo(vocales);
        System.out.println("Letras consonantes");
        mostrarArreglo(consonantes);
    }

    public static boolean esVocal(char letra) {
        boolean valido = false;
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':
                valido = true;
        }
        return valido;
    }

    public static void mostrarArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    public static int[] traerVocalesPos(char[] arr) {
        int tamanio = 0;
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arr[i]))
                tamanio++;
        }

        int[] vocalesPos = new int[tamanio];

        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arr[i])) {
                vocalesPos[j] = i;
                j++;
            }
        }
        return vocalesPos;
    }

    public static int[] traerConsonantesPos(char[] arr) {
        int tamanio = 0;
        for (int i = 0; i < MAX; i++) {
            if (!esVocal(arr[i]))
                tamanio++;
        }

        int[] consonantesPos = new int[tamanio];

        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (!esVocal(arr[i])) {
                consonantesPos[j] = i;
                j++;
            }
        }

        return consonantesPos;
    }
}
