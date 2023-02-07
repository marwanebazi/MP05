import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ONG {
    public static String[] associacio = {"0. Enrere", "1. Creu Roja", "2. Delwende", "3. Caritas"},
            aliments = {"0. Enrere", "1. Arroz", "2. Galetes", "3. Pasta"};

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
        System.out.println("0. Sortir");

        usuari = input.nextInt();

        while (usuari < 0 || usuari > 4) {
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


    public static void menuAssociacio() {
        int n = distancia.length;
        int m = associacio.length;

        System.out.println("DONAR D'ALTA ASSOCIACIÓ");
        System.out.println("0. Enrere");

        System.out.println("Introdueix el nom:");
        text = input.skip("\n").nextLine();
        if (text.equals("0")) {
            menu();
        } else {
            associacio = Arrays.copyOf(associacio, m + 1);
            associacio[m] = m + ". " + text;
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

        System.out.println("Vols seguir o tornar atras? (0 per tornar atras i qualsevol altre NÚMERO per a seguir)");
        cond = input.nextInt();
        if (cond == 0) {
            menu();
        } else {
            System.out.println("Quants aliments vols introduïr?");
            numAliments = input.nextInt();
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
    }
    public static void enviaments() {
        int costEnviament;

        System.out.println("ENVIAMENTS");
        System.out.println("0. Enrere");

        // Demanem a l'usuari que seleccioni l'associacio on s'enviarà i guardem la distància.
        System.out.println("Selecciona la associacio:" + Arrays.toString(associacio));
        usuari = input.nextInt();
        costEnviament = distancia[usuari - 1];

        //Menú per seleccionar aliment
        System.out.println("Selecciona un aliment: ");
        System.out.println(Arrays.toString(aliments));
        usuari = input.nextInt();

        // Tornar enrere
        if (usuari == 0) {
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

                    String Data = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                    System.out.println("La teva comanda arribarà " + Data);

                } else System.out.println("Demanes més KG del que hi ha en stock");

            } else System.out.println("No hi ha stock");
        }
        menu();

    }

    public static void donacions() {
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

                if (usuari == 0) {
                    donacions();
                } else {
                    System.out.println("Quants KG vols donar");
                    KgDemanats = input.nextInt();
                    stock[usuari - 1] = (stock[usuari - 1] + KgDemanats);
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