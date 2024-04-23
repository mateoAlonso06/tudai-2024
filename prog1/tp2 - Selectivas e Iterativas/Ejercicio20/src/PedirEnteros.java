import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PedirEnteros {
    public static void main(String[] args) {
        final int CORTE = 0;

        int numero = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese un numero entero distinto de: " + CORTE);
            numero = Integer.valueOf(entrada.readLine());

            while (numero != CORTE) {
                System.out.println("Ingrese un caracter:");
                char caracter = entrada.readLine().charAt(0);

                if (caracter == 'a') {
                    System.out.println("Ingrese un texto:");
                    String texto = entrada.readLine();

                    System.out.println("Usted ingreso:\n" + texto);
                } else if (caracter == 'b') {
                    int numeroAux = 0;
                    boolean ordenado = true;
                    for(int i = 0; i < 5; i++) {
                        System.out.println("Ingrese un numero entero positivo:");
                        boolean bandera = false;
                        int numeroPuntoB = 0;
                        while(!bandera) {
                            try {
                                numeroPuntoB = Integer.valueOf(entrada.readLine());
                                if (numeroPuntoB > 0)
                                    bandera = true;
                                else
                                    System.out.println("El numero no es positivo, intentelo de nuevo:");
                            } catch (Exception exc) {
                                System.out.println(exc);
                            }
                        }

                        if (i == 0) 
                            numeroAux = numeroPuntoB;
                        else {
                            if (numeroPuntoB > numeroAux) {
                                numeroAux = numeroPuntoB;
                            } else {
                                ordenado = false;
                            }
                        }
                    }
                    if (ordenado) 
                        System.out.println("Fueron ingresados en orden ascendente");
                    else
                        System.out.println("Los numeros fueron en otro orden");
                } else if (caracter == 'c') {
                    System.out.println("Ingrese el primer numero negativo:");
                    int primerNegativo = Integer.valueOf(entrada.readLine());
                    if (primerNegativo < 0) {
                        System.out.println("Ingrese el segundo numero negativo:");
                        int segundoNegativo = Integer.valueOf(entrada.readLine());
                        if (segundoNegativo < 0) {
                            int resultado = (int)Math.sqrt(primerNegativo * segundoNegativo);
                            System.out.println("El resultado es: " + resultado);
                        }
                    }
                } else {
                    System.out.println("Error. Ingrese otro caracter");
                }
                System.out.println("-----------------------------------------------------");
                System.out.println("Vuelva a ingresar otro numero distinto de " + CORTE);
                numero = Integer.valueOf(entrada.readLine());
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
