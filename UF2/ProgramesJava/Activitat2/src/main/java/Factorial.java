public class Factorial {
    public static void main(String[] args) {
        System.out.println("El factorial de 3 és:" + factorial(6));
    }

    public static int factorial(int numero) {
        if (numero > 1) {
            return numero * factorial(numero -1 );
        }

        return 1;
    }
}
