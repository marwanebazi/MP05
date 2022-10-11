# ACTIVITAT 2: PRÀCTICA AMB LLENGUATGES
Ara que ja coneixeu uns quants llenguatges de programació el que farem serà
crear un programa d’exemple.  
El programa simplement ha de generar un número aleatori de l’1 al 6 i s’anomenarà “d6”, simula el llançament d’un dau de 6 cares.

Escolliu 3 llenguatges de programació, un de compilat, un d’interpretat i un de MV.

**Per al llenguatge compilat:**  
- Utilitzant la línia de comandes, sense utilitzar un IDE de desenvolupament escriureu el programa en un fitxer de text que sigui el codi font, el codi font l’adjunteu dins el document.  
- Identifiqueu el compilador real que utilitzeu (nom de l’executable) i la comanda per utilitzar-lo per passar de codi font a codi objecte.  
- Descriviu com passar de codi font a codi objecte.  
- Mostreu les extensions dels fitxers de codi font i codi objecte.  
- Descriviu com passar de codi objecte a executable.  
- Expliqueu els avantatges d’utilitzar un llenguatge compilat i els punts febles.  
- Busqueu 3 IDEs de desenvolupament pel llenguatge.  

**Per al llenguatge interpretat:**
- Utilitzant la línia de comandes, sense utilitzar un IDE de desenvolupament escriureu el programa en un fitxer de text que sigui el codi font, el codi font l’adjunteu dins el document.  
- Identifiqueu l'intèrpret del llenguatge (l’executable).
- Descriviu com funciona l’intèrpret.
- Mostreu les extensions dels fitxers de codi font.
- Expliqueu els avantatges d’utilitzar un llenguatge interpretat i els punts febles.
- Busqueu 3 IDEs de desenvolupament pel llenguatge. 

**Per al llenguatge de MV:**
- Utilitzant la línia de comandes, sense utilitzar un IDE de desenvolupament escriureu el programa en un fitxer de text que sigui el codi font, el codi font l’adjunteu dins el document.  
- Identifiqueu el compilador real (nom d’executable) que utilitzeu i la comanda per utilitzar-lo per passar de codi font a ByteCode.  
- Descriviu com passar de codi font a ByteCode.
- Mostreu les extensions dels fitxers de codi font i ByteCode.
- Descriviu com executar el programa.
- Expliqueu els avantatges d’utilitzar un llenguatge de MV i els punts febles.
- Busqueu 3 IDEs de desenvolupament pel llenguatge. 

## Python

```
import random
print(random. randrange(6))
```
Alguns dels IDEs que podem usar per a progrmar amb Pyhton són PyDev, PyCharm o Spyder.

## Cobol

Per programar amb Cobol podem usar OpenCobol IDE, Notepad++ o isCobol.

## Java

```
import java.util.Random;

public class Dado {
    public static void main(String[] args) {


        int numAleatori = 1;
        Random rd = new Random();
        numAleatori = rd.nextInt(7);
        System.out.println(numAleatori);
    }
}
```
Alguns dels IDEs més usats per programar amb Java són IntelliJ, NetBeans o Eclipse.
