package figuras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import retangulo.Retangulo;

public class FiguraTest {

    @Test
    void testGetCor() {
        String retornoEsperado = "Verde";
        Figura retangulo = new Retangulo();
        retangulo.setCor("Verde");
        assertEquals(retornoEsperado, retangulo.getCor());
    }
}
