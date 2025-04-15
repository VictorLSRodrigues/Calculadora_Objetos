package figuras;

import figuras.Retangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 6;
        Retangulo retangulo = new Retangulo("", base, altura);
        double retornoFeito = retangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

}
