# Activitats de recerca:

Cerca per Internet i respon a aquestes preguntes.

1. Buscar quines són les principals versions de UML publicades fins la més actual i de quin any són.  
1.1 → 1997  
1.2 → 1999  
2.0 → 2005  
2.2 → 2009  
2.5.1 → 2017  

2. Qui va crear UML?  
Grady Booch, Ivar Jacobson i James Rumbaugh.   

3. Què és Rational Rose?  
Es un software que s’utilitza per a modelar un sistema abans de començar a construir-lo.   

4. Què té que veure Rational Rose amb UML?  
Es el software que en permet construir esquemes UML.  

5. Quan va ser publicada UML per la International Organization for Standardization (ISO)?  
L’any 2004.  

6. Què vol dir OMG?  
Object Management Group. És un consorci americà que té per objectiu l'estandardització i promoció de l'Objecte Model en totes les seves formes.  

7. Què té que veure OMG amb UML?  
OMG va doptar UML com a estàndard.  

# Diagrames:
Utilitzarem [Lucid](https://lucid.app/) per crear els diagrames de classes següents:

1. persona.  
![image](https://user-images.githubusercontent.com/113586070/222083986-84ad7862-5e26-473d-90a7-447702465071.png)
2. llibre.  
![image](https://user-images.githubusercontent.com/113586070/222084277-d8102efc-c5ff-4c50-8e10-d11d1d0dfcc9.png)
3. vehicle.  
![image](https://user-images.githubusercontent.com/113586070/222084373-bdfe7904-7913-46c3-9342-fd031fb45a72.png)
4. ordinador.  
![image](https://user-images.githubusercontent.com/113586070/222084189-4ac83a77-0775-4784-91ed-3f21d7eba026.png)


### Herència:
![image](https://user-images.githubusercontent.com/113586070/223492888-c1b2450b-09c3-4861-afd9-52034b2e3cde.png)  
![image](https://user-images.githubusercontent.com/113586070/223492960-699c3ea2-1291-42da-b0ad-d3c95cfc793e.png)  
![image](https://user-images.githubusercontent.com/113586070/223493016-f9f39999-ca98-4bdd-afd8-1fad77904bd0.png)  
![image](https://user-images.githubusercontent.com/113586070/223493098-7c1ba5c2-7274-487c-9d69-ea6769b6960d.png)  
![image](https://user-images.githubusercontent.com/113586070/223493184-1fcea32a-ea92-49c7-87f4-b189417bc985.png)  

### Relació:  
Escrivim quines associacions poden tenir les següents classes, nom d'associació i cardinalitat:

1. persona, DNI.
2. persona, comics.
3. persona, tren.
4. animal, persona.
5. persona, persona.
6. persona, cotxe.
7. persona, adreça.
8. taxi, client.  


### Agregació: 
Utilitzarem [Lucid](https://lucid.app/) per crear una agregació entre:

1. ovelles, corral.
2. animals, zoo.
3. curs, estudiants.
4. biblioteca, llibres.
5. atletes, equip.

### Composició:
Utilitzarem [Lucid](https://lucid.app/) per crear 5 relacions de composició:

1.
2.
3.
4.
5.

### Classe Associativa:

Utilitzarem [Lucid](https://lucid.app/) crea 2 relacions d'associació amb operacions o atributs propis:

1.
2.

# Enginyeria Inversa (Marwane i Oriol)  
### Calculadora

Tenim el següent codi:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double operand1, operand2;
        int operacio;
        Calculadora calc = new Calculadora();
        while (true){
            try {
                System.out.println("Introdueix el primer número: ");
                operand1 = sc.nextDouble();
                System.out.println("Introdueix el segon número: ");
                operand2 = sc.nextDouble();
                System.out.println("Quina operació vols realitzar? ");
                System.out.println("1. suma");
                System.out.println("2. resta");
                System.out.println("3. multiplicació");
                System.out.println("4. divisió");
                operacio = sc.nextInt();
                switch (operacio) {
                    case 1:
                        System.out.println("El resultat és: " + calc.suma(operand1, operand2));
                        break;
                    case 2:
                        System.out.println("El resultat és: " + calc.resta(operand1, operand2));
                        break;
                    case 3:
                        System.out.println("El resultat és: " + calc.multiplicacio(operand1, operand2));
                        break;
                    case 4:
                        System.out.println("El resultat és: " + calc.divisio(operand1, operand2));
                        break;
                }
            }
            catch (Exception e){
                System.out.println("Error!\n");
                sc = new Scanner(System.in);
            }
        }
    }
}
```

Sense coneixer la classe Calculadora ens demanen fer un treball de documentació dels següents passos (link a un repositori públic de github on ho expliqueu):

1. Crear la classe Calculadora a Umbrello.  
2. A Umbrello afegir el codi de tots els mètodes de la classe Calculadora.  
![image](https://user-images.githubusercontent.com/113586070/234495936-fd8d606f-fdc1-4c7b-86fb-a5b9fd64ce53.png)  
3. Importar a Umbrello la classe Main (mitjançant assistent d'importació).  
![image](https://user-images.githubusercontent.com/113586070/234498789-3e723d29-e985-4170-bc01-666c2230dc50.png)
4. Exportar el codi del projecte a JAVA i a Python.  
![image](https://user-images.githubusercontent.com/113586070/234500470-513e9e02-c158-4c8a-8a9f-61c04cebe3a3.png)
![image](https://user-images.githubusercontent.com/113586070/234500515-ef126f5b-a0b0-4a2a-9218-974156631ee5.png)
5. Es pot utilitzar directament el codi generat a JAVA?  
No.

### Batalles 

Hem vist un joc que està fent l'alumnat de 2n de DAM amb les tecnologies Python + Flask.

És tracta d'un joc de batalles per torns on 2 personatges generats aleatòriament s'enfronten entre ells.

![image](https://user-images.githubusercontent.com/110727546/234293601-609310d0-8986-4d37-be2c-c96227eca9d2.png)

Per accedir al joc haureu d'escriure al navegador [192.168.204.100:5000](http://192.168.204.100:5000)

**Es demana:**

Utilitzeu el programa i penseu com deu funcionar.

Ens demanen fer un treball de documentació dels següents passos (link a un repositori públic de github on ho expliqueu):

1. Fer un diagrama de classes de la classe Personatge amb els seus atributs i mètodes a Umbrello.
2. Exportar el diagrama a codi Python des d'Umbrello.
3. Fer el diagrama de casos d'ús que penseu que tindria el joc (a Umbrello o Lucid).
4. Fer el diagrama de seqüència total o d'algun cas d'ús específic que penseu que tindria el joc (a Umbrello o Lucid).

# Diagrama d'activitats:

### Activitat 1:
Tenim un programa de reserves de pistes de pàdel. El programa permet, via web, escollir un horari per reservar una pista de pàdel i reservar-la previ pagament per passarel·la bancària. Un cop està reservada la pista rep un mail de confirmació.

Divideix tot el que ha de fer el programa en activitats i després crea el diagrama d'activitats a [Lucid](https://lucid.app).  
![image](https://user-images.githubusercontent.com/113586070/237060916-be7c2c61-25bc-4c3a-bbb5-eba5208d5b83.png)



### Activitat 2

Utilitzant [alguna d'aquestes receptes de còctels sense alcohol](https://www.qdefesta.cat/recursos/upload/Coctels_%20sense_alcohol.pdf) feu un diagrama d'activitats seguint la recepta a [Lucid](https://lucid.app).  
![image](https://user-images.githubusercontent.com/113586070/237060774-9284d3f1-a297-4abb-b87f-934f12f5a304.png)

