import java.util.Arrays;
import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSeleccionat, KgDemanats;
        int[] stock = {1000000, 200, 0, 300};
        int[] distancia = {100000, 1001};
        //Aixó és el menú per a seleccionar cada aliment
        String[] aliments = {"ab", "dd", "hd", "uw"};
        System.out.println("Introdueix un número per dir quin aliment vols, hi ha les següents opcions:,");
        System.out.println(Arrays.toString(aliments));
        numSeleccionat = input.nextInt();

        if (true) {

            System.out.println("Has seleccionat " + aliments[numSeleccionat - 1]);
            System.out.println("Hi ha un total de " + stock[numSeleccionat - 1] + " KG en stock");

            // Aquí demano els KG que es volen agafar i ho resto als que hi havia,
            // posteriorment mostro l'stock restant.

            if (stock[numSeleccionat - 1] != 0) { //Si no hi ha stock no ho fa
                System.out.println("Quants KG vols?");
                KgDemanats = input.nextInt();
                if (stock[numSeleccionat - 1] > KgDemanats) { //Si no hi ha suficients Kg en stock per a la quantitat que demano no ho fa.
                    System.out.println("Queden " + (stock[numSeleccionat - 1] - KgDemanats) + " Kg");
                    stock[numSeleccionat] = (stock[numSeleccionat - 1] - KgDemanats);

                    //Aquí calculo el preu d'enviament
                    if (KgDemanats < 200) {
                        System.out.println("El cost de l'enviament és: " + distancia[numSeleccionat-1] * 0.19 + " €");
                    } else {
                        System.out.println("El cost de l'enviament és: " + distancia[numSeleccionat-1] * 0.22 + " €");
                    }
                } else System.out.println("Demanes més KG del que hi ha en stock");
            } else System.out.println("No hi ha stock");
        }
    }
}

