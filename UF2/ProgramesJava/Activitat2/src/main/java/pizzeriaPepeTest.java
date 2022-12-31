import org.junit.jupiter.api.*;


class pizzeriaPepeTest {


    @Test //Valor entre els límits
    void prova1() {
        boolean pot = PizzeriaPepe.potCarregar(3);
        Assertions.assertTrue(pot);
    }

    @Test //Valor superior al límit superior
    void prova2() {
        boolean pot = PizzeriaPepe.potCarregar(11);
        Assertions.assertFalse(pot);
    }


    @Test //Valor inferior al límit inferior
    void prova3() {
        boolean pot = PizzeriaPepe.potCarregar(-2);
        Assertions.assertFalse(pot);
    }


    @Test //Valor no és un número
    void prova4() {
        boolean pot = PizzeriaPepe.potCarregar(Integer.parseInt("cinc"));
        Assertions.assertFalse(pot);
    }


    @Test
    void prova5() {
        boolean pot = PizzeriaPepe.potCarregar(0);
        Assertions.assertFalse(pot);
    }


    @Test
    void prova6() {
        boolean pot = PizzeriaPepe.potCarregar(1);
        Assertions.assertTrue(pot);
    }


    @Test
    void prova7() {
        boolean pot = PizzeriaPepe.potCarregar(2);
        Assertions.assertTrue(pot);
    }


    @Test
    void prova8() {
        boolean pot = PizzeriaPepe.potCarregar(9);
        Assertions.assertTrue(pot);
    }


    @Test
    void prova9() {
        boolean pot = PizzeriaPepe.potCarregar(10);
        Assertions.assertTrue(pot);
    }


    @Test
    void prova10() {
        boolean pot = PizzeriaPepe.potCarregar(11);
        Assertions.assertFalse(pot);
    }
}