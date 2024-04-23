import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HoraDelDia {
    public static void main(String[] args) {
        final int HORA_MIN = 0;
        final int HORA_MAX = 23;

        final int KEY_VALUE = 364;

        int hora;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Ingrese la hora del dia (sin minutos, ni segundos):");
            hora = Integer.valueOf(entrada.readLine());

            if (hora >= HORA_MIN && hora <= HORA_MAX) {
                if (hora <= 5) {
                    System.out.println("Ingrese la temperatura:");
                    float temperatura = Float.valueOf(entrada.readLine());

                    if (temperatura > 25)
                        System.out.println("Apagar calefacción");
                    else if (temperatura < 20)
                        System.out.println("Encender la calefacción");
                    else
                        System.out.println("Calefacción encendida, no abra las ventanas!!!");
                } else if (hora <= 11) {
                    System.out.println("Ingrese un caracter LETRA minuscula:");
                    char letra = entrada.readLine().charAt(0);

                    if (letra >= 'a' && letra <= 'z') {
                        int cantidadVocales = 0;
                        int cantidadConsonantes = 0;

                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u': {
                                    switch (hora) {
                                        case 6:
                                        case 8:
                                        case 10:
                                        case 11:
                                            cantidadVocales = 2;
                                            break;
                                        default:
                                            cantidadVocales = 3;
                                            break;
                                    }
                                    System.out.println("La hora ingresada (" + hora + ") tiene: " + cantidadVocales + " vocales");
                                }
                                break;
                            default:
                                switch (hora) {
                                    case 6:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        cantidadConsonantes = 2;
                                        break;
                                    default:
                                        cantidadConsonantes = 3;
                                        break;
                                }
                                System.out.println("La hora ingresada (" + hora + ") tiene: " + cantidadConsonantes
                                        + " consonantes");
                                break;
                        }
                    } else {
                        System.out.println("El caracter ingresado no es una letra minuscula");
                    }
                } else if (hora <= 17) {
                    // si la hora es par o impar:
                    if (hora % 2 == 0) {
                        int promedioHoraMinimo = (hora + 12) / 2;
                        System.out.println("El promedio de la hora ingresado con el limite inferior es de = "
                                + promedioHoraMinimo);
                    } else {
                        int promedioHoraMaximo = (hora + 17) / 2;
                        System.out.println("El promedio de la hora ingresada con el limite superior es de = "
                                + promedioHoraMaximo);
                    }
                } else {
                    System.out.println("Ingrese una clave numerica:");
                    int claveNumerica = Integer.valueOf(entrada.readLine());

                    if (claveNumerica == KEY_VALUE) {
                        System.out.println("Ingrese una clave de verificación (valor entre 100 y 999):");
                        int claveDeVerificacion = Integer.valueOf(entrada.readLine());

                        if (claveDeVerificacion >= 100 && claveDeVerificacion <= 999) {
                            int centenaDeVerificacion = (claveDeVerificacion / 100) % 10;
                            int centenaKeyValue = (KEY_VALUE / 100) % 10;
                            if (centenaDeVerificacion % centenaKeyValue == 0)
                                System.out.println("Clave correcta");
                            else
                                System.out.println("Clave incorrecta");
                        } else {
                            System.out.println("La clave de verificación esta fuera de rango");
                        }
                    } else {
                        System.out.println("La clave ingresada no coincide con el valor almacenado");
                    }
                }
            }
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
