# Activitats:

## Activitats Caixa Negra:

### Pizzeria Pepe:

Un programa controla si una comanda de pizzes la pot portar un repartidor.

Heu de tenir en compte que un repartidor pot portar 10 pizzes com a màxim a la moto.

El programa retorna true si la comanda es pot portar i false en cas contrari.

Es demana:

- Fer el codi font del programa.
```
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
```
- Fer la taula amb les particions equivalents i casos vàlids i no vàlids.
- Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.

### Transports Jean Claude:

Un programa gestiona si una càrrega es pot portar amb una furgoneta.

Una càrrega sempre pesarà almenys 500 kg. per aprofitar el transport, però no podrà pesar més de 900kg.

Una furgoneta ha de tenir la capacitat de portar un pes mínima de 500kg i màxima de 750kg.

Si una càrrega no es pot portar el programa retorna -1, en cas contrari retorna 0.

Es demana:

- Fer el codi font del programa.
- Fer la taula amb les particions equivalents i casos vàlids i no vàlids.
- Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.

### Control de temperatura:

Un programa gestiona el modificador de temperatura del sistema de calefacció d'un restaurant.

Aquest programa rep la medició de la temperatura del restaurant en graus celsius, acceptant com entrades vàlides de -10 a 50 graus. (medidor)

A més té una entrada d'usuari/a amb la temperatura que es vol mantenir, que va de 15 a 40 graus. (termostat).

El sistema té tres sortides possibles que representen la potencia del sistema de calefacció: 0, 1, 2.

Segons la informació que té en cada moment el programa farà el següent:

Si la temperatura del medidor és més alta que la del termostat, la potencia del sistema serà 0.
Si la temperatura del medidor és més baixa o més alta que la del termostat però només entre 0 i 2 graus, la potència serà 1.
Si la temperatura del medidor és més baixa que la del termostat en més de dos graus, la potència del sistema serà 2.

Es demana:

- Fer el codi font del programa.
- Fer la taula amb les particions equivalents i casos vàlids i no vàlids.
- Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.


## Activitats debug:

### Factorial:

El factorial d'un nombre és el resultat de multiplicar el número per ell mateix -1 tantes vegades com  siguin necessàries fins arrivar a 1.

Per exemple el factorial de 5 és:

5 * 4 * 3 * 2 * 1

![image](https://user-images.githubusercontent.com/110727546/206031980-55e59610-42bb-4cc6-9b5f-039d7f67e185.png)

Fes una funció factorial que rebi un número com paràmetre i retorni el seu factorial.

Es demana:

- Codi del programa.
- Captura de pantalla amb un punt d'interrupció que deixi veure totes les crides a la funció (agafeu un valor menor a 10).

### Taula de multiplicar:

Fes un programa que crea una matriu de números del 1 al 10.
Aquest programa rep per argument d'entrada un número sencer i retorna per terminal la taula de multiplicar d'aquest número multiplicant el argument per cada valor de la matriu.

Es demana:

- Codi del programa.
- Captura de pantalla de com li passeu a IntelliJ com argument del programa un número. (Mireu exemple findAverage).
- Captura de com feu un punt d'interrupció al bucle de creació de la matriu i mostreu els valors de la matriu.
- Captura de punt d'interrupció al bucle de multiplicació i com modifiqueu a ma els valors de la matriu de números per a que l'execució retorni el número 1 10 vegades quan l'argument d'entrada era 1.


