public class TipoDeLetras {
    static final int MAX = 12;
    public static void main(String[] args) {
        char[] letras = {'h', 'o', 'l', 'a', 's', 'o', 'y', 'm', 'a', 't', 'e', 'o'};
        
        char[] vocales = traerVocales(letras);
        char[] consonantes = traerConsonantes(letras);

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

    public static void mostrarArreglo(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println();
    }

    public static char[] traerVocales(char[] arr) {
        int tamanio = 0;
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arr[i]))
                tamanio++;
        }

        char[] vocales = new char[tamanio];

        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (esVocal(arr[i])) {
                vocales[j] = arr[i];
                j++;
            }
        }
        return vocales;
    }

    public static char[] traerConsonantes(char[] arr) {
        int tamanio = 0;
        for (int i = 0; i < MAX; i++) {
            if (!esVocal(arr[i]))
                tamanio++;
        }

        char[] consonantes = new char[tamanio];

        int j = 0;
        for (int i = 0; i < MAX; i++) {
            if (!esVocal(arr[i])) {
                consonantes[j] = arr[i];
                j++;
            }
        }

        return consonantes;
    }
}
