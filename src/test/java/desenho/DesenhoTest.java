package desenho;

import desenho.Desenho;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import retangulo.Retangulo;
import triangulo.Triangulo;
public class DesenhoTest {

    @Test
    void testAdicionar() {
        //Objeto desenho a ser testado
        Desenho desenho = new Desenho();

        //Insere uma figura do tipo retângulo
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        Retangulo retangulo = new Retangulo("",
                baseRetangulo, alturaRetangulo);

        desenho.adicionar(retangulo);

        assertEquals(1, desenho.getFiguras().size());

    }

    @Test
    void testGetArea() {
        Desenho desenho = new Desenho(); //Objeto desenho a ser testado
        //Insere uma figura do tipo retângulo
        double alturaRetangulo = 3;
        double baseRetangulo = 2;
        double retornoEsperadoRetangulo = 6;
        Retangulo retangulo = new Retangulo("", baseRetangulo,
                alturaRetangulo);
        desenho.adicionar(retangulo);

        //Insere uma figura do tipo triângul
        double alturaTriangulo = 3;
        double baseTriangulo = 2;
        double retornoEsperadoTriangulo = 3.0;
        Triangulo triangulo = new Triangulo("", baseTriangulo,
                alturaTriangulo);
        desenho.adicionar(triangulo);
        double areaDesenhoEsperado = retornoEsperadoRetangulo
                + retornoEsperadoTriangulo;
        double retornoFeito = desenho.getArea();
        assertEquals(areaDesenhoEsperado, retornoFeito);
    }

}
