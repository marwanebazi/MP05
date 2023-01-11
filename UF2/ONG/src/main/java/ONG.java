import java.io.IOException;
import java.util.Scanner;

public class ONG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int usuari;
        menu();
        usuari = input.nextInt();

        while (usuari < 0 || usuari > 4){
            System.out.println("Tria una opció vàlida");
            usuari = input.nextInt();
        }

        switch (usuari) {

            case 1:
                associacio();
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

    public static void menu(){
        System.out.println("SELECCIONA UNA OPCIÓ:");
        System.out.println("1. Donar d'alta Associació");
        System.out.println("2. Aliments");
        System.out.println("3. Enviaments");
        System.out.println("4. Donacions");
        System.out.println("0. Sortir");
    }

    public static void associacio(){
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
        System.out.println("ENVIAMENTS");
        System.out.println("seleccionar aliments");
        System.out.println("suma de kilos");
        System.out.println("calcular");
        System.out.println("data enviament");
        System.out.println("0. Enrere");
    }

    public static void donacions(){
        System.out.println("FER DONACIONS");
        System.out.println("1. Seleccionar aliment");
        System.out.println("0. Enrere");
    }


}
