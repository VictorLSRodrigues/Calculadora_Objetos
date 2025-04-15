package figuras;

import figuras.Triangulo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    void testGetArea() {
        double altura = 3;
        double base = 2;
        double retornoEsperado = 3.0;
        Triangulo triangulo = new Triangulo("", base, altura);
        double retornoFeito = triangulo.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testgetSomaCostrutorVazio() {
        Triangulo tri = new Triangulo();
        double retornoEsperado = 0.0;
        double retornoFeito = tri.getArea();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
