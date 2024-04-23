import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PedirNumeros {
    public static void main(String[] args) {
        final int POSITIVIDAD = 0;
        final int MAYOR_QUE = 100;

        // punto A
        int numeroPuntoA = 0;
        // punto B
        int numeroPuntoB = 0;
        // punto C
        int dia = 0;
        // punto D
        char letra;
        // punto E
        int num1, num2, num3;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            // punto A
            System.out.println("Ingrese un número para verificar si es positivo o negativo: ");
            numeroPuntoA = Integer.valueOf(entrada.readLine());

            if(numeroPuntoA > POSITIVIDAD)
                System.out.println("El numero ingresado es positivo");
            else if(numeroPuntoA < POSITIVIDAD)
                System.out.println("El numero ingresado es negativo");
            else
                System.out.println("El numero ingresado es 0");

            // punto B
            System.out.println("Ingrese un numero para verificar si es mayor que: " + MAYOR_QUE);
            numeroPuntoB = Integer.valueOf(entrada.readLine());

            if(numeroPuntoB > MAYOR_QUE)
                System.out.println("grande");
            else
                System.out.println("chico");
            
            // punto C
            System.out.println("Ingrese un dia de la semana:");
            dia = Integer.valueOf(entrada.readLine());

            switch(dia) {
                case 1: System.out.println("Lunes"); break;
                case 2: System.out.println("Martes"); break;
                case 3: System.out.println("Miercoles"); break;
                case 4: System.out.println("Jueves"); break;
                case 5: System.out.println("Viernes"); break;
                case 6: System.out.println("Sabado"); break;
                case 7: System.out.println("Domingo"); break;
                default:
                    System.out.println("El numero ingresado no corresponde a ningun dia valido, vuelva a intentarlo"); break;
            }

            // punto D
            System.out.println("Ingrese una letra:");
            letra = entrada.readLine().charAt(0);
            
            letra = Character.toLowerCase(letra);

            if(letra >= 'a' && letra <= 'z') {
                switch(letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println("Es vocal");
                        break;
                    default:
                        System.out.println("Es consonante");
                        break;
                }
            } else {
                System.out.println("El caracter ingresado no es una letra");
            }

            // punto E
            System.out.println("Ingrese el primer numero de la serie (1/3):");
            num1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo numero de la serie (2/3):");
            num2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el tercer numero de la serie (3/3):");
            num3 = Integer.valueOf(entrada.readLine());

            if (num1 < num2 && num2 < num3)
                System.out.println("Creciente");
            else if (num1 > num2 && num2 > num3)
                System.out.println("Decreciente");
            else
                System.out.println("Error");
        }
        catch(Exception exc) {
            System.out.println(exc);
        }
        
        System.out.println("Fin del programa");
    }
}