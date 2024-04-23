public class TablaDeVerdad {
    public static void main(String[] args) {

        System.out.println("Tabla de verdad AND");
        System.out.println("true AND true: " + (true && true));
        System.out.println("true AND false: " + (true && false));
        System.out.println("false AND true: " + (false && true));
        System.out.println("false AND false: " + (false && false));

        System.out.println();

        System.out.println("Tabla de verdad OR");
        System.out.println("true OR true: " + (true || true));
        System.out.println("true OR false: " + (true || false));
        System.out.println("false OR true: " + (false || true));
        System.out.println("false OR false: " + (false || false));
    }
}