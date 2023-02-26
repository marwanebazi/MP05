import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ONG {
    public static String[] associacio = {"0. Enrere", "1. Creu Roja", "2. Delwende", "3. Caritas"},
            aliments = {"1. Arroç", "2. Galetes", "3. Pasta"};

    public static int[] stock = {1000000, 200, 20, 300},
            distancia = {20, 35, 62};

    public static Scanner input = new Scanner(System.in);
    public static int usuari, KgDemanats;

    public static String text;


    public static void main(String[] args) {
        java.util.Date fecha = new Date();
        System.out.println(fecha);
        menu();

    }

    public static void menu() {
        System.out.println("SELECCIONA UNA OPCIÓ:");
        System.out.println("1. Donar d'alta Associació");
        System.out.println("2. Aliments");
        System.out.println("3. Enviaments");
        System.out.println("4. Donacions");
        System.out.println("5. Mostrar aliments");
        System.out.println("0. Sortir");

        usuari = input.nextInt();

        while (usuari < 0 || usuari > 5) {
            System.out.println("Tria una opció vàlida");
            usuari = input.nextInt();
        }

        switch (usuari) {

            case 1:
                menuAssociacio();
                System.out.println();
                System.out.println("**************");
                System.out.println();
                menu();

            case 2:
                aliments();
                System.out.println();
                System.out.println("**************");
                System.out.println();
                menu();

            case 3:
                enviaments();
                System.out.println();
                System.out.println("**************");
                System.out.println();
                menu();

            case 4:
                donacions();
                System.out.println();
                System.out.println("**************");
                System.out.println();
                menu();

            case 5:
                mostrarAliments();
                System.out.println();
                System.out.println("**************");
                System.out.println();
                menu();

            case 0:
                System.out.println("HAS SORTIT");
                break;

        }

    }

    private static void mostrarAliments() {
        System.out.println();
        System.out.println("Hi ha els següents aliments:");

        for (int i = 0; i < aliments.length; i++) {
            System.out.println(aliments[i]);
        }
    }


    public static void menuAssociacio() {
        int n = distancia.length;
        int m = associacio.length;

        System.out.println("DONAR D'ALTA ASSOCIACIÓ");
        System.out.println("0. Enrere");

        System.out.println("Introdueix el nom:");
        text = input.skip("\n").nextLine();
        associacio = Arrays.copyOf(associacio, m + 1);
        associacio[m] = m + ". " + text;

        if (text.equals("0")) {
            System.out.println();
            menu();
        } else {
            System.out.println("Introdueix el telèfon");
            text = input.nextLine();

            System.out.println("Introdueix la distancia");
            usuari = input.nextInt();
            distancia = Arrays.copyOf(distancia, n + 1);
            distancia[n] = usuari;

            System.out.println(Arrays.toString(associacio));
            menu();
        }

    }

    public static void aliments() {
        int numSeleccionat, numAliments, cond;
        String[] aliments = new String[10];

        System.out.println("ALIMENTS");

        System.out.println("Quants aliments vols introduïr?");
        numAliments = input.nextInt();
        System.out.println("Introdueix el nom/s");
        for (int j = 0; j < numAliments + 1; j++) {
            aliments[j] = input.nextLine();
        }
        System.out.println("ALIMENTS");
        System.out.println(Arrays.toString(aliments));

        //Per a modificar
        System.out.println("Vols modificar algún aliment? (1 per a modificar i qualsevol altre NÚMERO per seguir)");
        cond = input.nextInt();
        if (cond == 1) {
            System.out.println("Quin aliment vols modificar?");
            System.out.println(Arrays.toString(aliments));
            numSeleccionat = input.nextInt();

            System.out.println("Has seleccionat " + aliments[numSeleccionat] + " , introdueix el nou nom");

            aliments[numSeleccionat] = input.skip("\n").nextLine();
            System.out.println("Ha quedat així:");
            System.out.println(Arrays.toString(aliments));


        }
        System.out.println("Vols borrar algún aliment? (1 per a borrar i qualsevol altre NÚMERO per seguir)");
        cond = input.nextInt();
        if (cond == 1) {
            String condBorrat;

            System.out.println("Introdueix un número per dir quin aliment vols BORRAR, hi ha les següents opcions:,");
            System.out.println(Arrays.toString(aliments));
            numSeleccionat = input.nextInt();

            //aixó és per a esborrar l'aliment que hem seleccionat si escrivim esborrar

            System.out.println("Has seleccionat " + aliments[numSeleccionat]);
            System.out.println("Escriu 'BORRAR' per a borrar l'aliment, per a parar posa qualsevol altra cosa o INTRO.");
            condBorrat = input.skip("[\r\n]*").nextLine();
            //Condició de borrat
            if (condBorrat.equals("BORRAR") || condBorrat.equals("Borrar") || condBorrat.equals("borrar")) {
                aliments[numSeleccionat] = null;
            }
            System.out.println("Ha quedat així:");
            System.out.println(Arrays.toString(aliments));

        }
        System.out.println();
        menu();
    }

    public static void enviaments() {
        int costEnviament;

        System.out.println("ENVIAMENTS");
        System.out.println("0. Enrere");

        // Demanem a l'usuari que seleccioni l'associacio on s'enviarà i guardem la distància.
        System.out.println("Selecciona la associacio:" + Arrays.toString(associacio));
        usuari = input.nextInt();
        costEnviament = distancia[usuari];

        //Menú per seleccionar aliment
        System.out.println("Selecciona un aliment: ");
        System.out.println(Arrays.toString(aliments));
        usuari = input.nextInt();

        // Tornar enrere
        if (usuari == 0) {
            System.out.println();
            menu();
        }

        if (true) {

            System.out.println("Has seleccionat " + aliments[usuari - 1]);
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
                        System.out.println();
                        System.out.println("El cost de l'enviament és: " + costEnviament * 0.19 + " €");

                    } else {
                        System.out.println();
                        System.out.println("El cost de l'enviament és: " + costEnviament * 0.22 + " €");
                    }

                    String Data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                    System.out.println("La teva comanda arribarà " + Data);

                } else System.out.println("Demanes més KG del que hi ha en stock");

            } else System.out.println("No hi ha stock");
        }
        System.out.println();
        menu();

    }

    public static void donacions() {
        System.out.println("FER DONACIONS");
        System.out.println("1. Seleccionar aliment");
        System.out.println("0. Enrere");

        usuari = input.nextInt();

        do {
            if (usuari == 0) {
                System.out.println();
                menu();
                break;
            } else if (usuari == 1) {
                System.out.println(Arrays.toString(aliments));
                usuari = input.nextInt();

                if (usuari == 0) {
                    donacions();
                } else {
                    System.out.println("Has seleccionat " + aliments[usuari - 1]);
                    System.out.println("Quants KG vols donar?, " + "hi ha un total de " + stock[usuari - 1] + " KG en stock");
                    KgDemanats = input.nextInt();
                    stock[usuari - 1] = (stock[usuari - 1] + KgDemanats);
                    System.out.println("Fet, queda un total de " + stock[usuari - 1] + "Kg");
                    System.out.println();
                    break;
                }

            }

            System.out.println("Selecciona una opció vàlida");
            usuari = input.nextInt();

        } while (true);
        System.out.println();
        menu();
    }


}