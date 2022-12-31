import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlTemperaturaTest {
    @Test // Temperatura > termostat la sortida ha de ser 0
    void prova1() {
        assertEquals(0, ControlTemperatura.potencia(22, 15));
    }

    @Test // Error. Temperatura > termostat la sortida hauria de ser 0
    void prova2() {
        assertEquals(1, ControlTemperatura.potencia(22, 15));
    }

    @Test // Temperatura major o menor entre 0 i 2 graus, la sortida ha de ser 1
    void prova3() {
        assertEquals(1,ControlTemperatura.potencia(24, 25));
        assertEquals(1,ControlTemperatura.potencia(27, 25));
    }

    @Test // Error. La sortida hauria de ser 0.
    void prova4() {
        assertEquals(1,ControlTemperatura.potencia(22, 25));
        assertEquals(1,ControlTemperatura.potencia(28, 25));
    }

    @Test // Termostat es major que temperatura en més de 2 graus
    void prova5() {
        assertEquals(2,ControlTemperatura.potencia(20, 26));
    }
    @Test // Error.
    void prova6() {
        assertEquals(0,ControlTemperatura.potencia(23, 22));

    }
}