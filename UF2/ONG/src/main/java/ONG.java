import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class ONG {
    public static String[] associacio = {"0. Enrere", "1. Creu Roja", "2. Delwende", "3. Caritas"},
            aliments = {"0. Enrere", "1. Arroz", "2. Galetes", "3. Pasta"};

    public static int[] stock = {1000000, 200, 20, 300},
            distancia = {20, 35, 62};

    public static Scanner input = new Scanner(System.in);
    public static int usuari, KgDemanats;


    public static void main(String[] args) {
        java.util.Date fecha = new Date();
        System.out.println (fecha);
        menu();

    }

    public static void menu(){
        System.out.println("SELECCIONA UNA OPCIÓ:");
        System.out.println("1. Donar d'alta Associació");
        System.out.println("2. Aliments");
        System.out.println("3. Enviaments");
        System.out.println("4. Donacions");
        System.out.println("0. Sortir");

        usuari = input.nextInt();

        while (usuari < 0 || usuari > 4){
            System.out.println("Tria una opció vàlida");
            usuari = input.nextInt();
        }

        switch (usuari) {

            case 1:
                menuAssociacio();
                break;

            case 2:
                aliments();
                break;

            case 3:
                enviaments();
                break;

            case 4:
                donacions();
                break;

            case 0:
                System.out.println("HAS SORTIT");
                break;

        }

    }


    public static void menuAssociacio(){
        System.out.println("DONAR D'ALTA ASSOCIACIÓ");
        System.out.println("Nom");
        System.out.println("telefon");
        System.out.println("distancia");
        System.out.println("0. Enrere");
    }

    public static void aliments(){
        System.out.println("ALIMENTS");
        System.out.println("1. Donar d'alta");
        System.out.println("2. Mostrar aliments");
        System.out.println("3. Modificar nom");
        System.out.println("4. Eliminar");
        System.out.println("0. Enrere");
    }

    public static void enviaments(){
        int costEnviament;

        System.out.println("ENVIAMENTS");
        System.out.println("0. Enrere");
        System.out.println("seleccionar aliments");
        System.out.println("suma de kilos");
        System.out.println("calcular");
        System.out.println("data enviament");

        // Demanem a l'usuari que seleccioni l'associacio on s'enviarà i guardem la distància.
        System.out.println("Selecciona la associacio:" + Arrays.toString(associacio));
        usuari = input.nextInt();
        costEnviament = distancia[usuari - 1];

        //Menú per seleccionar aliment
        System.out.println("Selecciona un aliment: ");
        System.out.println(Arrays.toString(aliments));
        usuari = input.nextInt();

        // Tornar enrere
        if (usuari == 0){
            menu();
        }

        if (true) {

            System.out.println("Has seleccionat " + aliments[usuari]);
            System.out.println("Hi ha un total de " + stock[usuari - 1] + " KG en stock");

            if (stock[usuari - 1] != 0) { // Comprovem que hi ha stock
                System.out.println("Quants KG vols?");
                KgDemanats = input.nextInt();

                if (stock[usuari - 1] > KgDemanats) {
                    // Mostro l'stock restant
                    System.out.println("Queden " + (stock[usuari - 1] - KgDemanats) + " Kg");
                    stock[usuari - 1] = (stock[usuari - 1] - KgDemanats);

                    // Calculo el preu d'enviament
                    if (KgDemanats < 200) {
                        System.out.println("El cost de l'enviament és: " + costEnviament * 0.19 + " €");

                    } else {
                        System.out.println("El cost de l'enviament és: " + costEnviament * 0.22 + " €");
                    }
                    System.out.println("Mostrar data");

                } else System.out.println("Demanes més KG del que hi ha en stock");

            } else System.out.println("No hi ha stock");
        }

    }

    public static void donacions(){
        System.out.println("FER DONACIONS");
        System.out.println("1. Seleccionar aliment");
        System.out.println("0. Enrere");

        usuari = input.nextInt();



        do {
            if (usuari == 0) {
                menu();
                break;
            } else if (usuari == 1) {
                System.out.println(Arrays.toString(aliments));
                usuari = input.nextInt();

                if (usuari == 0){
                    donacions();
                } else {
                    System.out.println("Quants KG vols donar");
                    KgDemanats = input.nextInt();
                    stock[usuari -1] = (stock[usuari - 1] + KgDemanats);
                    System.out.println("Has seleccionat " + aliments[usuari]);
                    System.out.println("Hi ha un total de " + stock[usuari - 1] + " KG en stock");
                    break;
                }

            }

            System.out.println("Selecciona una opció vàlida");
            usuari = input.nextInt();

        } while (true);



        menu();
    }


}
