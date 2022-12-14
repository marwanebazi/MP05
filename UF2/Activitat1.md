# Activitats: 

Per dibuixar els diagrames de flux podeu fer servir [draw.io](https://draw.io) o qualsevol altra eina online.

1. Calcula el CC de les següents figures:  
  ![image](https://user-images.githubusercontent.com/110727546/204613022-4ab64342-2e06-438d-a7e8-570685b3c406.png)  
  ![image](https://user-images.githubusercontent.com/110727546/204613180-6d55bf09-28b8-417e-96f4-f71a762ac44c.png)  
  ![image](https://user-images.githubusercontent.com/110727546/204655229-8c3f28d7-3d8b-4746-a55d-331f89da39d2.png)  

  - **Resultat 1:** 16 - 14 + 2 = 4
  - **Resultat 2:** 16 - 14 + 2 = 4
  - **Resultat 3:** 8 - 6 + 2 = 4


2. Dibuixa el diagrama de flux representat per aquest codi i després calcula la seva CC:
  - ![image](https://user-images.githubusercontent.com/110727546/204615125-363e5e6c-173b-4ec0-8c0b-cb97985ade06.png)

  - **Diagrama:**  
 ![image](https://user-images.githubusercontent.com/113586070/204749770-991773c6-ccd8-48a9-a8e9-251ea829b3ad.png)  
  - **Resultat CC:** 8 - 7 + 2 = 3  
  - **Resultat proves camins:**  
  Prova 1: A = 205  
  Prova 2: A = 354, B = 10 i C = 3  
  Prova 3: A = 354, B = 10 i C = 15

3. Dibuixa el diagrama de flux representat per aquest codi i després calcula la seva CC:

```
public class proves {
    public static  String queEmPoso(int temperatura) {
        String roba = "res";
        if(temperatura<0){
           roba = "roba d'esquiar";
        }
        else if(temperatura<10){
           roba = "roba de muntanya";
        }
        else if(temperatura<20){
           roba = "roba d'hivern";
        }
        else if(temperatura<30){
           roba = "roba d'estiu";
        }
        return roba;
    }    
}
```

  - **Diagrama:**  
  ![image](https://user-images.githubusercontent.com/113586070/204755943-d89f8ef7-b04f-450d-9884-6148dfcfd76a.png)  
  - **Resultat CC:** 15 - 12 + 2 = 5  
  - **Resultat proves camins:**  
  Prova 1: Temperatura = -5   
  Prova 2: Temperatura = 7   
  Prova 3: Temperatura = 15  
  Prova 4: Temperatura = 27  
  Prova 5: Temperatura = 47  

4. Dibuixa el diagrama de flux representat per aquest codi, calcula la seva CC i crea una prova per a cada camí posible:

```
    public static Boolean llumsEncesos(int hora) {
        Boolean llums = false;
        if(hora <= 8 || hora >= 20){
            llums = true;
        }
        return llums;
    }
```
  - **Diagrama:**  
  ![image](https://user-images.githubusercontent.com/113586070/205626837-15e17667-b28a-4ed7-9c68-6be8efe84f6e.png)  
  - **Resultat CC:** 8 - 7 + 2 = 3
  - **Resultat proves camins:**  
  Prova 1: Hora = 8  
  Prova 2: Hora = 10   
  Prova 3: Hora = 20  

5. Investiga sobre les proves de caixa negra:

  - Què són? Són proves on estudiem els resultats basant-nos en les entrades que res i els resultats que retorna, sense tenir en compte el funcionament intern.
  - Quina diferència principal tenen sobre les de caixa blanca? La principal diferència es que les proves de caixa blanca estan destinades a comprovar el funcionament intern i en canvi les de caixa negres es basen en les dades d'entrada i sortida.


