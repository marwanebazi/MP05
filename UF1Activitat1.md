# ACTIVITAT 1: RECERCA DE LLENGUATGES DE PROGRAMACIÓ

Es tracta de que feu un treball analitzant les principals característiques dels principals llenguatges de programació segons l'índex [TIOBE](https://www.tiobe.com/tiobe-index/) que mesura la popularitat d'un llenguatge segons les referències que se'n fan a la Web.

Haureu d’escollir **Python** i **Java**, a més de 2 llenguatges més del TOP 20 que us resultin interessants, **4 llenguatges en total**.

D'aquests llenguatges heu de comentar obligatòriament els següents aspectes: 
- Naixement, creadors i evolució històrica. 
- Característiques del llenguatge. 
  - Imperatiu, declaratiu, OOP... 
  - Compilat, interpretat, híbrid... 
  - Principals novetats o aportacions respecte altres llenguatges. 
  - Avantatges i inconvenients respecte altres llenguatges. 
- Principals entorns on es fa servir el llenguatge. 
- Exemple de codi (valoraré especialment si mostreu que ho heu implementat i provat). 
  - Hola mòn (Molt fàcil de trobar). 
  - Demanar el nom a l'usuari i mostrar-lo (haureu de buscar una mica més). 
- Buscar com estan les ofertes de treball a Infojobs del llenguatge.
- WebGrafia.

Valoraré molt especialment que feu un treball personal, i que no us limiteu a enganxar informació trobada a Internet. 

Intenteu entendre els termes tècnics que feu servir, i si teniu algun dubte podeu preguntar. 

No serveix de res fer un treball que no entengueu vosaltres mateixos. 

L’aspecte en un treball sempre és important. 

Intenteu ser una mica polits, i sobretot, doneu un repàs a les faltes d'ortografia.

Podeu fer servir imatges rellevants.

## PYTHON  

Python es un llenguatge utilitzat en múltiples camps com poden ser la intel·ligència artificial, desenvolupament web o desenvolupament de videojocs. Es un llenguatge d’alt nivell interpretat, orientat a objectes.

Va ser creat a finals de la dècada dels 80 pel neerlandés Guido van Rossum. L’any 2000 es publica Python 2.0, a partir d’aquesta versió la comunitat comença a tenir una gran importància. L’any 2008 es va llençar Python 3.0 que es la versió que es manté fins avui en dia.

Algunes de les moltes avantatges que ens ofereix Python son la seva gran compatibilitat amb tots els sistemes operatius, és un llenguatge relativament fàcil d'aprendre ja que la seva sintaxis no és molt complicada i ens permet crear programes amb poques línies de codi, la polivalencia també és un dels punts forts ja que s’utilitza en molts camps molt diferents entre ells. A més a més Python té una comunitat molt gran ja que és de codi obert.

Les ofertes de treball relacionades amb Python son molt variades i de diferents sectors, algunes estan relacionades amb els videojocs, algunes altres amb el desenvolupament web i altres amb la ciència de dades.

**Hola Món**  
``` 
print("Hola món") 
```  

**Hola User**  
```
nom = input("Com et dius? ")
print("Hola", nom + "!")
```

## JAVA  

Java es un llenguatge orientat a objectes que ens permet desenvolupar aplicacions mòbils, disseny web o accedir a bases de dades entre d’altres usos.

Aquest llenguatge de programació va ser dissenyat per un equip de treballadors de Sun Microsystems liderats per James Gosling l’any 1991. L’any 1995 va ser publicada la primera versió. Oracle va comprar Sun Microsystems l’any 2010, apropiant-se d’aquesta manera del llenguatge.

La sintaxis de Java esta basada en la del llenguatge C, es un llenguatge imperatiu que s’executa en maquina virtual.

Algunes de les principals avantatges que ens ofereix Java són la seva versatilitat i la seva capacitat multiplataforma, es pot usar per crear tot tipus d’aplicacions en qualsevol sistema operatiu. Les principals desavantatges del llenguatge són la seva sintaxis ja que és més complexa comparada amb llenguatges com Python, a més el fet d’usar la maquina virtual JVM fa que el llenguatge sigui totalment dependent d’aquesta.

Les ofertes de treball relacionades amb aquest llenguatge demanen en la majoria dels casos un mínim de 2 anys d'experiència, els sou oferit oscil·la entre els 20.000 i els 40.000 euros. La majoria d’ofertes donen l’opció de treballar en remot.

**Hola Món**  
```
class HolaMon {
    public static void main(String[] args) {
        System.out.println("Hola món!"); 
    }
}
```

**Hola User**    
```
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {

		System.out.println("Com et dius?");

		Scanner input = new Scanner(System.in);
		String nom = input.next();

		System.out.println("Hola " + nom);

	}

}
```
## JAVASCRIPT  

Javascript es un llenguatge interpretat, imperatiu i orientat a objectes. La seva principal funció és donar vida a les pàgines web permeten la interacció. Majoritàriament s’executa a la part del client, però també es pot executar a la part del servidor gràcies a Node.js.

La primera vegada que va aparèixer Javascript va ser l’any 1995. El seu desenvolupador, Brendan Eich, el va anomenar Mocha i després va canviar-li el nom a LiveScript. El nom Javascript el va adoptar quan Netscape va afegir compatibilitat al seu navegador amb Java.
 
La seva sintaxis, basada en Java, es una de les seves principals avantatges ja que és fàcil d’entendre per l’usuari. La velocitat és un altre dels punts forts ja que s’executa immediatament al navegador. El fet que s’executi a la part del client també suposa una desavantatja ja que si hi ha algun bug o error pot ser explotat.

La gran majoria d’ofertes de treball, per no dir totes, demanen coneixement d’HTML i CSS, PHP, NodeJS o frameworks com Angular o React. Els sous que s’ofereixen van entre 18.000 i 36.000 euros segons l’experiència i les funcions a desenvolupar.


**Hola Món**  
```
console.log('Hola món');
```
**Hola User**  
```
var nom = prompt("Com et dius?");
console.log("Hola " + nom);
```

## C#

**Hola Món**  
```
namespace HolaMon
{
    class Hola {         
        static void Main(string[] args)
        {
            System.Console.WriteLine("Hola món");
        }
    }
}
```
**Hola User**  
```
using System;

class MainClass {
  public static void Main (string[] args) {
    Console.WriteLine ("Com et dius?");
    string nom = Console.ReadLine();
    Console.WriteLine("Hola {0}", nom); 
   }
}
```

## WEBGRAFIA
[InfoJobs](https://www.infojobs.net/)  
[Tiobe](https://www.tiobe.com/tiobe-index/)  
[UNAM](https://docencia.tic.unam.mx/presenciales/Lenguaje-de-programacion-java.html)  
[Crehana](https://www.crehana.com/blog/desarrollo-web/que-es-java/)  
[Assembler Institute](https://assemblerinstitute.com/blog/tipos-lenguaje-programacion/)  
[Banco Santander](https://www.becas-santander.com/es/blog/python-que-es.html)  
[Aula 21](https://www.cursosaula21.com/que-es-python/)  
[Soy Rafa Ramos](https://soyrafaramos.com/que-es-javascript-para-que-sirve/)  
[LenguajeJS](https://lenguajejs.com/javascript/)  
[C Sharp - Wikipedia](https://es.wikipedia.org/wiki/C_Sharp)  
[BeSoftware](https://bsw.es/que-es-c/)  
