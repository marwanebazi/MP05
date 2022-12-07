import java.util.Scanner;

public class PizzeriaPepe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pizzes;
        boolean resposta = true;

        System.out.println("Introdueix el numero de pizzes:");
        pizzes = input.nextInt();

        if (pizzes > 10){
            resposta = false;
        }

        System.out.println(resposta);
    }
}
